package game;
import java.util.ArrayList;
import java.util.Scanner;

import items.*;
import events.*;

public class Spiel {
	
	private static Raum[][] map = new Raum[6][6];
	private static Tuer[][][][] tueren = new Tuer[7][7][7][7];
	private static ArrayList<Item> items = new ArrayList<Item>();
	private static Scanner scan = new Scanner(System.in);
	private static Event eventItem = null;
	private static Tuer lastDoorUsed = null;
	public static boolean eventsSichtbar = false;
	
	public static void main(String[] args) throws CloneNotSupportedException{

		Spiel.generiereAlleItems();
		Spiel.generiereDefaultMap();
		Spiel.setStartingPos(1, 1);
		Spiel.startRaum();
		Spiel.userEingabe();
		
	}
	
	
	// -------------------- Game Data --------------------
	public static void generiereDefaultMap() throws CloneNotSupportedException{
		// Erinnerung: Raum(X, Y, ItemID1, ItemID2, ItemID3)
		map[1][1] = new Raum(1, 1, 6);
		map[2][1] = new Raum(2, 1, 5, 23);
		map[3][1] = new Raum(3, 1, 4, 29);	
		map[4][1] = new Raum(4, 1, 28);		
		//
		map[1][2] = new Raum(1, 2, 21);
		map[2][2] = new Raum(2, 2, 4, 26);	
		map[3][2] = new Raum(3, 2);			//EE-Rätsel
		map[4][2] = new Raum(4, 2, 4, 22);	
		//
		map[1][3] = new Raum(1, 3, 1);
		map[2][3] = new Raum(2, 3, 1);
		map[3][3] = new Raum(3, 3, 25, 4);
		map[4][3] = new Raum(4, 3, 21);
		//
		map[1][4] = new Raum(1, 4, 3);
		map[2][4] = new Raum(2, 4, 22);
		map[3][4] = new Raum(3, 4, 24);
		map[4][4] = new Raum(4, 4, 27);	
		//
		map[2][5] = new Raum(2, 5, 20);
		
		// Erinnerung: Tuer(raum1x, raum1y, raum2x, raum2y, simpleLocked, masterLocked)
		tueren[1][1][1][2] = new Tuer(1, 1, 1, 2, false, false);
		tueren[2][1][3][1] = new Tuer(2, 1, 3, 1, true, false);
		tueren[2][1][2][2] = new Tuer(2, 1, 2, 2, true, false);
		tueren[3][1][3][2] = new Tuer(3, 1, 3, 2, false, false);
		tueren[4][1][4][2] = new Tuer(4, 1, 4, 2, false, false);
		
		tueren[1][2][2][2] = new Tuer(1, 2, 2, 2, true, false);
		tueren[1][2][1][3] = new Tuer(1, 2, 1, 3, false, false);
		tueren[2][2][2][3] = new Tuer(2, 2, 2, 3, false, false);
		tueren[3][2][4][2] = new Tuer(3, 2, 4, 2, false, false);
		tueren[4][2][4][3] = new Tuer(4, 2, 4, 3, false, false);
		
		tueren[2][3][2][4] = new Tuer(2, 3, 2, 4, false, false);
		tueren[3][3][4][3] = new Tuer(3, 3, 4, 3, false, false);
		tueren[3][3][3][4] = new Tuer(3, 3, 3, 4, false, false);
		tueren[4][3][4][4] = new Tuer(4, 3, 4, 4, false, false);

		tueren[1][4][2][4] = new Tuer(1, 4, 2, 4, true, false);
		tueren[2][4][3][4] = new Tuer(2, 4, 3, 4, false, false);
		tueren[2][4][2][5] = new Tuer(2, 4, 2, 5, false, true);
	}
	
	public static void generiereAlleItems() {
		items.add(new Schluessel());
		items.add(new Heiltrank());
		items.add(new Schild());
		items.add(new Flusen());
		items.add(new Kompass());
		items.add(new Lampe());
		items.add(new Arkankubus());
		items.add(new Zuckerwasser());
		items.add(new evt_Finale());
		items.add(new evt_Bodenstacheln());
		items.add(new evt_Pfeilfalle());
		items.add(new evt_BodenlosesLoch());
		items.add(new evt_Schluesselblocker());
		items.add(new evt_TuerVernichter());
		items.add(new evt_TrankPuzzle());
		items.add(new evt_GiftPfeilPuzzle());
		items.add(new evt_ArmFallenPuzzle());
		items.add(new evt_SphinxPuzzle());
		
	}
	
	
	// -------------------- Aktionen des Spielers --------------------
	public static void go (int laufrichtungX, int laufrichtungY) {
		int zielraumX = Held.getPosX() + laufrichtungX;
		int zielraumY = Held.getPosY() + laufrichtungY;
		Tuer aktuelleTuer = null;
		aktuelleTuer = tuerTargetter(zielraumX, zielraumY);
		if (aktuelleTuer != null) {
			if (aktuelleTuer.isMasterLocked()) {
				System.out.println("Du brauchst einen besonderen Schlüssel um diese Tür zu öffnen.");
			}else if (aktuelleTuer.isSimpleLocked()) {
				System.out.println("Diese Tür ist verschlossen.");
			}else if (aktuelleTuer.isDestroyed()) {
				System.out.println("Dieser Durchgang ist verschüttet.");
			}else {
				System.out.println("Du verlässt den Raum in Richtung " + Spiel.richtungsWandler(laufrichtungX, laufrichtungY) + "."); 
				Spiel.event("Leave");
				Held.setPosX(zielraumX);
				Held.setPosY(zielraumY);
				Spiel.lastDoorUsed = aktuelleTuer;
				Spiel.betreteRaum();
			}
		}else {
			System.out.println("Dort ist kein Ausgang.");
		}
	}
		
	public static void useItem(String befehl) {
		Item itemFromCMD = Spiel.commandTranslatorItem(befehl, "Inventar");
		if (itemFromCMD != null) {
			itemFromCMD.use(befehl);	
		}else {
			System.out.println("Welches Item meinst du genau?.");
		}	
	}
	
	public static void pickupItem(String befehl) {
		Item itemFromCMD = Spiel.commandTranslatorItem(befehl, "Raum");

		if (itemFromCMD != null) {
			if (Held.checkIfItemFitsInventory(itemFromCMD.getWeight())) {
				Held.getInventar().add(itemFromCMD);
				map[Held.getPosX()][Held.getPosY()].removeItemFromRoom(itemFromCMD);
				System.out.println("Du hast " + itemFromCMD.getName() + " aufgehoben.");
			}else {
				System.out.println("Dieses Item ist zu schwer, als dass du es noch tragen könntest.");
			}				
		}else {
			System.out.println("Du kannst dieses Item hier nirgendwo finden.");
		}
	}
	
	public static void dropItem(String befehl) {
		Item itemFromCMD = Spiel.commandTranslatorItem(befehl, "Inventar");
		
		if (itemFromCMD != null) {
			map[Held.getPosX()][Held.getPosY()].addItemToRoom(itemFromCMD);
			Held.getInventar().remove(itemFromCMD);
			System.out.println("Du hast " + itemFromCMD.getName() + " fallen gelassen." );
			if (itemFromCMD.isDropEffekt()) {
				itemFromCMD.dropEffect();
			}
		}else {
			System.out.println("Du kannst nichts fallen lassen, was du nicht besitzt.");
		}
	}
	
	public static void help() {	
		System.out.println("===================");
		System.out.println("Anmerk: Alle Item-Namen sind Case-Sensitive.");
		System.out.println("Hilfe - Zeigt alle gültigen Befehle an.");
		System.out.println("Geh HIMMELSRICHTUNG - Bewegt dich in die entsprechende Himmelsrichtung");
		System.out.println("Schau PARAMETER - Gibt Informationen über einen Raum, eine Tür oder ein Item.");
		System.out.println("Heb ITEM - Nimmt ein Item auf, welches in diesem Raum liegt.");
		System.out.println("Fallenlassen ITEM - Lässt ein Item fallen");
		System.out.println("Benutze ITEM - Verwendet ein Item.");
		System.out.println("Exit - Beendet das Spiel.");
		System.out.println("===================");
	}
	
	public static void exit() {
		System.out.println("Spiel beendet.");
		System.exit(0);
	}
	
	public static void observeRoom() {
		if (Held.isHasSight()) {
			map[Held.getPosX()][Held.getPosY()].getBeschreibung();
			System.out.println(checkForDoors());
			map[Held.getPosX()][Held.getPosY()].zeigeInventarImRaum();
		}else {
			System.out.println("Es ist zu dunkel um irgendetwas zu erkennen.");
		}
	}
	
	public static void observeSelf() {
		Held.zeigeLeben();
		
	}
	
	public static void observeDoor(int richtungX, int richtungY) {
		int zielTuerX = Held.getPosX() + richtungX;
		int zielTuerY = Held.getPosY() + richtungY;
		Tuer aktuelleTuer = null;
		aktuelleTuer = tuerTargetter(zielTuerX, zielTuerY);
		if (aktuelleTuer != null) {
			if (aktuelleTuer.isMasterLocked()) {
				System.out.println("Ein komplexes und großes Schloss ist in der Tür verbaut. Du kannst nicht hindurch sehen und vermutest, dass du hierfür einen ganz besonderen Schlüssel benötigst.");
			}else if (aktuelleTuer.isSimpleLocked()) {
				System.out.println("Diese Tür ist mit einem simplen Schloss versehen. Du brauchst einen Schlüssel um sie zu öffnen.");
			}else if (aktuelleTuer.isDestroyed()) {
				System.out.println("Dieser Durchgang ist verschüttet und daher unpassierbar.");
			}else {
				System.out.println("Eine gewöhnliche Tür, sie ist nicht verriegelt.");
			}
		}else {
			System.out.println("Dort ist kein Ausgang.");
		}
	}
	
	// -------------------- Spiel-Mechaniken --------------------
	public static void setStartingPos(int x, int y) {
		Held.setPosX(x);
		Held.setPosY(y);
	}
	
	public static void userEingabe() {		
		try {
			String eingabe = scan.nextLine().toUpperCase();
			
			if (eventItem != null) {
				if (eventItem.triggerEffect(eingabe) != true) {
					Spiel.befolgeBefehl(eingabe);
				}else {
					if (Held.isAlive()) {
						Spiel.userEingabe();
					}else {
						System.out.println(Texte.deathMessage);
						scan.close();
					}
				}
			}else {
				Spiel.befolgeBefehl(eingabe);
			}
		} catch (Exception e) {
			System.out.println("GAME OVER");
		}
	}
	
	public static void befolgeBefehl(String befehl) {
		

		if (befehl.contains("GEH")) {
			if (befehl.contains("WEST")) {
				Spiel.go(-1, 0);
			}else if (befehl.contains("OST")) {
				Spiel.go(1, 0);
			}else if (befehl.contains("NORD")) {
				Spiel.go(0, -1);
			}else if (befehl.contains("SÜD")) {
				Spiel.go(0, 1);
			}
		}else if (befehl.contains("SCHAU")) {
			Item itemFromCMD = Spiel.commandTranslatorItem(befehl, "Alle");
			if (befehl.contains("RAUM")) {
				Spiel.observeRoom();
			}else if (befehl.contains("SELBST")) {
				Held.zeigeLeben();
				Held.zeigeGewicht();
			}else if(befehl.contains("TÜR")) {
				if (befehl.contains("WEST")) {
					Spiel.observeDoor(-1, 0);
				}else if (befehl.contains("OST")) {
					Spiel.observeDoor(1, 0);
				}else if (befehl.contains("NORD")) {
					Spiel.observeDoor(0, -1);
				}else if (befehl.contains("SÜD")) {
					Spiel.observeDoor(0, 1);
				}else {
					System.out.println("Welche Tür möchtest du dir denn ansehen?");
				}
			}else if(befehl.contains("INVENTAR")) {
				Held.zeigeInventar();
			}else if (Held.getInventar().contains(itemFromCMD)) {
				System.out.println(itemFromCMD.getBeschreibung());
			}else if (map[Held.getPosX()][Held.getPosY()].inventarImRaum.contains(itemFromCMD)) {
				System.out.println(itemFromCMD.getBeschreibung());
			}else {
				System.out.println("Was genau möchtest du dir anschauen?");
			}
		}else if (befehl.contains("BENUTZE")) {
			Spiel.useItem(befehl);	
		}else if(befehl.contains("HEBE")){
			Spiel.pickupItem(befehl);
		}else if(befehl.contains("FALLEN")){
			Spiel.dropItem(befehl);
		}else if(befehl.contains("HILF")){
			Spiel.help();
		}else if(befehl.contains("EXIT")){
			Spiel.exit();
		}else if (befehl.contains("TEST")) {
													// Testen während der Runtime, später entfernen
			if (befehl.contains("1")) {
				items.get(1).use(befehl);
			}else if (befehl.contains("2")) {
				System.out.println(eventItem);
			}
		}else {
			System.out.println("Wups, ungültiger Befehl");
		}
		
		if (Held.isAlive()) {
			Spiel.userEingabe();
		}else {
			System.out.println(Texte.deathMessage);
			scan.close();
		}
		
	}
	
	public static void betreteRaum() {
		System.out.println("========================================");
		if (Held.isHasSight()) {
			if (map[Held.getPosX()][Held.getPosY()].isBesucht()) {
				System.out.println("Hier warst du schon einmal.");
			}
			System.out.println(map[Held.getPosX()][Held.getPosY()].getBeschreibung());;
			System.out.println(checkForDoors());
			Spiel.event("Enter");
		}else {
			System.out.println("Es ist zu dunkel um irgendetwas zu erkennen.");
			Spiel.event("Enter");
		}
		map[Held.getPosX()][Held.getPosY()].setBesucht(true);
		System.out.println("========================================");
	}
	
	public static Item commandTranslatorItem(String command, String arrayListUsed) {
		Item ausgabe = null;
		boolean checkForSecondItemTrue = false;
		ArrayList<Item> benutzteListe = null;
		
		if (arrayListUsed == "Raum") {
			benutzteListe = map[Held.getPosX()][Held.getPosY()].inventarImRaum;
		}else if (arrayListUsed == "Inventar") {
			benutzteListe = Held.getInventar();
		}else if (arrayListUsed == "Alle") {
			benutzteListe = items;
		}
		
		for (int i = 0; i < benutzteListe.size(); i++) {
			if (command.contains(benutzteListe.get(i).getName().toUpperCase())) {
				if (checkForSecondItemTrue) {
					if (ausgabe.getName() != benutzteListe.get(i).getName()) {
						System.out.println("Du kannst immer nur ein Item auf einmal benutzen.");
						System.out.println(ausgabe.getName());
						System.out.println(benutzteListe.get(i).getName());
						ausgabe = null;
						break;	
					}
				}else {
					checkForSecondItemTrue = true;
					ausgabe = benutzteListe.get(i);
				}
			}
		}
		return ausgabe;
	}
	
	public static Item cloneItemSelect(int itemID) {
		Item ausgabeItem = null;
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getItemID() == itemID) {
				ausgabeItem = items.get(i);
			}
		}
		return ausgabeItem;
	}
	
 	public static void startRaum() {
		System.out.println(Texte.startMessage);
		map[Held.getPosX()][Held.getPosY()].setBesucht(true);
	}

	public static void event(String trigger) {
		for (int i = 0; i < map[Held.getPosX()][Held.getPosY()].inventarImRaum.size(); i++) {
			if (map[Held.getPosX()][Held.getPosY()].inventarImRaum.get(i).isEventItem()) {
				map[Held.getPosX()][Held.getPosY()].inventarImRaum.get(i).use(trigger);
			}
		}
	}
	
	public static String checkForDoors() {	 
		String ausgabe = "Dieser Raum hat Türen im:";
		if (tuerTargetter(Held.getPosX(), Held.getPosY()-1) != null) {
			ausgabe += " Norden";
		}
		if (tuerTargetter(Held.getPosX(), Held.getPosY()+1) != null) {
			ausgabe += " Süden";
		}
		if (tuerTargetter(Held.getPosX()-1, Held.getPosY()) != null) {
			ausgabe += " Westen";
		}
		if (tuerTargetter(Held.getPosX()+1, Held.getPosY()) != null) {
			ausgabe += " Osten";
		}
		return ausgabe;
	}
	
	public static Tuer tuerTargetter (int zielraumX, int zielraumY) {
		if (tueren[Held.getPosX()][Held.getPosY()][zielraumX][zielraumY] != null) {
			return tueren[Held.getPosX()][Held.getPosY()][zielraumX][zielraumY];
		}else if (tueren[zielraumX][zielraumY][Held.getPosX()][Held.getPosY()] != null) {
			return tueren[zielraumX][zielraumY][Held.getPosX()][Held.getPosY()];
		}else {
			return null;
		}
	}
	
	public static String richtungsWandler(int richtungX, int richtungY) {
		String ausgabe = "";
		if (richtungX == -1) {
			ausgabe = "Westen";
		}else if (richtungX == 1) {
			ausgabe = "Osten";
		}else if (richtungY == -1) {
			ausgabe = "Norden";
		}else if (richtungY == 1) {
			ausgabe = "Süden";
		}
		return ausgabe;
	}
	
	public static Event getEventItem() {
		return eventItem;
	}

	public static void setEventItem(Event eventItem) {
		Spiel.eventItem = eventItem;
	}
	
	public static Tuer getLastDoorUsed() {
		return lastDoorUsed;
	}

	public static void setLastDoorUsed(Tuer lastDoorUsed) {
		Spiel.lastDoorUsed = lastDoorUsed;
	}

	public static Tuer[][][][] getTueren() {
		return tueren;
	}

	public static void setTueren(Tuer[][][][] tueren) {
		Spiel.tueren = tueren;
	}
	
	public static Raum[][] getMap() {
		return map;
	}

	public static void setMap(Raum[][] map) {
		Spiel.map = map;
	}
	
	public static void closeScan() {
		scan.close();
	}

	
	// -------------------- Test-Methoden, können später gelöscht werden --------------------
	



	public static void testeAlleItems() {
		for (int i = 0; i < items.size(); i++) {
			System.out.println(Spiel.items.get(i).getName());
		}
	}



	

	
}
