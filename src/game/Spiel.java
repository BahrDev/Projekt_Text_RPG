package game;
import java.util.ArrayList;
import java.util.Scanner;

import items.*;
import events.*;

public class Spiel {
	
	private static Raum[][] map = new Raum[6][6];
	private static Tuer[][][][] tueren = new Tuer[6][6][6][6];
	private static ArrayList<Item> items = new ArrayList<Item>();
	private static Scanner scan = new Scanner(System.in);
	private static Event eventItem = null;
	
	
	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		
		//Spiel.GeneriereAlleItems();
		//Spiel.TesteAlleItems();
		Spiel.GeneriereAlleItems();
		Spiel.DefaultMap();
		Spiel.StartingPos(1, 1);
		Spiel.StartRaum();
		Spiel.UserEingabe();
		
	}
	
	
	// -------------------- Level Data --------------------
	public static void DefaultMap() throws CloneNotSupportedException{
		map[1][1] = new Raum(1, 1, 6, 2);	//Lampe
		map[2][1] = new Raum(2, 1);
		map[3][1] = new Raum(3, 1);
		map[4][1] = new Raum(4, 1);
		
		map[1][2] = new Raum(1, 2, 51); //Pfeilfalle
		map[2][2] = new Raum(2, 2);
		map[3][2] = new Raum(3, 2);
		map[4][2] = new Raum(4, 2);
		
		map[1][3] = new Raum(1, 3); //Schlüssel
		map[2][3] = new Raum(2, 3);
		map[3][3] = new Raum(3, 3);
		map[4][3] = new Raum(4, 3);
		
		map[1][4] = new Raum(1, 4);
		map[2][4] = new Raum(2, 4);
		map[3][4] = new Raum(3, 4);
		map[4][4] = new Raum(4, 4);
		
		// Erinnerung: Tuer(raum1x, raum1y, raum2x, raum2y, simpleLocked, masterLocked)
		tueren[1][1][1][2] = new Tuer(1, 1, 1, 2, false, false);
		tueren[2][1][3][1] = new Tuer(2, 1, 3, 1, false, false);
		tueren[2][1][2][2] = new Tuer(2, 1, 2, 2, false, false);
		tueren[3][1][3][2] = new Tuer(3, 1, 3, 2, false, false);
		tueren[4][1][4][2] = new Tuer(4, 1, 4, 2, false, false);
		
		tueren[1][2][2][2] = new Tuer(1, 2, 2, 2, false, false);
		tueren[1][2][1][3] = new Tuer(1, 2, 1, 3, false, false);
		tueren[2][2][2][3] = new Tuer(2, 2, 2, 3, false, false);
		tueren[3][2][4][2] = new Tuer(3, 2, 4, 2, false, false);
		tueren[4][2][4][3] = new Tuer(4, 2, 4, 3, false, false);
		
		tueren[2][3][2][4] = new Tuer(2, 3, 2, 4, false, false);
		tueren[3][3][4][3] = new Tuer(3, 3, 4, 3, false, false);
		tueren[3][3][3][4] = new Tuer(3, 3, 3, 4, false, false);
		tueren[4][3][4][4] = new Tuer(4, 3, 4, 4, false, false);

		tueren[1][4][2][4] = new Tuer(1, 4, 2, 4, false, false);
		tueren[2][4][3][4] = new Tuer(2, 4, 3, 4, false, false);
		tueren[2][4][2][5] = new Tuer(2, 4, 2, 5, false, true);

	}
	
	public static void GeneriereAlleItems() {
		items.add(new Schluessel());
		items.add(new Heiltrank());
		items.add(new Schild());
		items.add(new Flusen());
		items.add(new Kompass());
		items.add(new Lampe());
		items.add(new evt_Pfeilfalle());
		items.add(new evt_Bodenstacheln());
	}
	
	
	// -------------------- Aktionen des Spielers --------------------
	public static void Go (int laufrichtungX, int laufrichtungY) {
		int zielraumX = Held.getPosX() + laufrichtungX;
		int zielraumY = Held.getPosY() + laufrichtungY;
		if (tuertargetting(zielraumX, zielraumY) != null) {
			if (tuertargetting(zielraumX, zielraumY).isMasterLocked()) {
				System.out.println("Du brauchst einen besonderen Schlüssel um diese Tür zu öffnen.");
			}else if (tuertargetting(zielraumX, zielraumY).isSimpleLocked()) {
				System.out.println("Diese Tür ist verschlossen.");
			}else {
				System.out.println("Du verlässt den Raum nach Süden."); //Richtungsangabe als Methode schreiben
				Spiel.Event("Leave");
				Held.setPosX(zielraumX);
				Held.setPosY(zielraumY);
				Spiel.BetreteRaum();
			}
		}else {
			System.out.println("Dort ist kein Ausgang.");
		}
	}
		
	public static void UseItem(String befehl) {
		Item itemFromCMD = Spiel.CommandTranslatorItem(befehl, "Inventar");
		if (itemFromCMD != null) {
			itemFromCMD.Use(befehl);	
		}else {
			System.out.println("Dieses Item befindet sich nicht in deinem Inventar.");
		}	
	}
	
	public static void PickupItem(String befehl) {
		Item itemFromCMD = Spiel.CommandTranslatorItem(befehl, "Raum");

		if (itemFromCMD != null) {
			if (Held.CheckIfItemFitsInventory(itemFromCMD.getWeight())) {
				Held.getInventar().add(itemFromCMD);
				map[Held.getPosX()][Held.getPosY()].RemoveItemFromRoom(itemFromCMD);
				System.out.println("Du hast " + itemFromCMD.getName() + " aufgehoben.");
			}else {
				System.out.println("Dieses Item ist zu schwer, als dass du es noch tragen könntest.");
			}				
		}else {
			System.out.println("Du kannst dieses Item hier nirgendwo finden.");
		}
	}
	
	public static void DropItem(String befehl) {
		Item itemFromCMD = Spiel.CommandTranslatorItem(befehl, "Inventar");
		
		if (itemFromCMD != null) {
			map[Held.getPosX()][Held.getPosY()].AddItemToRoom(itemFromCMD);
			Held.getInventar().remove(itemFromCMD);
			System.out.println("Du hast " + itemFromCMD.getName() + " fallen gelassen." );
			if (itemFromCMD.isDropEffekt()) {
				itemFromCMD.DropEffect();
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
		System.out.println("===================");
	}
	
	public static void ObserveRoom() {
		if (Held.isHasSight()) {
			map[Held.getPosX()][Held.getPosY()].getBeschreibung();
			System.out.println(CheckForDoors());
			map[Held.getPosX()][Held.getPosY()].ZeigeInventarImRaum();
		}else {
			System.out.println("Es ist zu dunkel um irgendetwas zu erkennen.");
		}
	}
	
	public static void ObserveSelf() {
		Held.ZeigeLeben();
		
	}
	
	// -------------------- Spiel-Mechaniken --------------------
	public static void StartingPos(int x, int y) {
		Held.setPosX(x);
		Held.setPosY(y);
	}
	
	public static void UserEingabe() {
		String eingabe = scan.nextLine().toUpperCase();
		
		if (eventItem != null) {
			if (eventItem.triggerEffect(eingabe) != true) {
				Spiel.BefolgeBefehl(eingabe);
			}else {
				if (Held.isAlive()) {
					Spiel.UserEingabe();
				}else {
					System.out.println(Texte.deathMessage);
					scan.close();
				}
			}
		}else {
			Spiel.BefolgeBefehl(eingabe);
		}
		

	}
	
	public static void BefolgeBefehl(String befehl) {
		

		if (befehl.contains("GEH")) {
			if (befehl.contains("WEST")) {
				Spiel.Go(-1, 0);
			}else if (befehl.contains("OST")) {
				Spiel.Go(1, 0);
			}else if (befehl.contains("NORD")) {
				Spiel.Go(0, -1);
			}else if (befehl.contains("SÜD")) {
				Spiel.Go(0, 1);
			}
		}else if (befehl.contains("SCHAU")) {
			Item itemFromCMD = Spiel.CommandTranslatorItem(befehl, "Alle");
			if (befehl.contains("RAUM")) {
				Spiel.ObserveRoom();
			}else if (befehl.contains("SELBST")) {
				Held.ZeigeLeben();
				Held.ZeigeGewicht();
			}else if(befehl.contains("TÜR")) {
				if (befehl.contains("WEST")) {
					CheckDoor("West");
				}else if (befehl.contains("OST")) {
					CheckDoor("Ost");
				}else if (befehl.contains("NORD")) {
					CheckDoor("Nord");
				}else if (befehl.contains("SÜD")) {
					CheckDoor("Süd");
				}else {
					System.out.println("Welche Tür möchtest du dir denn ansehen?");
				}
			}else if(befehl.contains("INVENTAR")) {
				Held.ZeigeInventar();
			}else if (Held.getInventar().contains(itemFromCMD)) {
				System.out.println(itemFromCMD.getBeschreibung());
			}else if (map[Held.getPosX()][Held.getPosY()].inventarImRaum.contains(itemFromCMD)) {
				System.out.println(itemFromCMD.getBeschreibung());
			}else {
				System.out.println("Was genau möchtest du dir anschauen?");
			}
		}else if (befehl.contains("BENUTZE")) {
			Spiel.UseItem(befehl);	
		}else if(befehl.contains("HEBE")){
			Spiel.PickupItem(befehl);
		}else if(befehl.contains("FALLEN")){
			Spiel.DropItem(befehl);
		}else if(befehl.contains("HILF")){
			Spiel.help();
		}else if (befehl.contains("TEST")) {
													// Testen während der Runtime, später entfernen
			if (befehl.contains("1")) {
				items.get(1).Use(befehl);
			}else if (befehl.contains("2")) {
				System.out.println(eventItem);
			}
		}else {
			System.out.println("Wups, ungültiger Befehl");
		}
		
		if (Held.isAlive()) {
			Spiel.UserEingabe();
		}else {
			System.out.println(Texte.deathMessage);
			scan.close();
		}
		
	}
	
	public static void BetreteRaum() {
		System.out.println("========================================");
		if (Held.isHasSight()) {
			if (map[Held.getPosX()][Held.getPosY()].isBesucht()) {
				System.out.println("Hier warst du schon einmal.");
			}
			System.out.println(map[Held.getPosX()][Held.getPosY()].getBeschreibung());;
			System.out.println(CheckForDoors());
			Spiel.Event("Enter");
		}else {
			System.out.println("Es ist zu dunkel um irgendetwas zu erkennen.");
			Spiel.Event("Enter");
		}
		map[Held.getPosX()][Held.getPosY()].setBesucht(true);
		System.out.println("========================================");
	}
	
	public static Item CommandTranslatorItem(String command, String arrayListUsed) {
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
					if (ausgabe.getName() != benutzteListe.get(i).getName().toUpperCase()) {
						System.out.println("Error, Zwei Items im Befehl enthalten");
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
	
	public static Item CloneItemSelect(int itemID) {
		Item ausgabeItem = null;
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getItemID() == itemID) {
				ausgabeItem = items.get(i);
			}
		}
		return ausgabeItem;
	}
	
 	public static void StartRaum() {
		System.out.println(Texte.startMessage);
		map[Held.getPosX()][Held.getPosY()].setBesucht(true);
	}

	public static void Event(String trigger) {
		for (int i = 0; i < map[Held.getPosX()][Held.getPosY()].inventarImRaum.size(); i++) {
			if (map[Held.getPosX()][Held.getPosY()].inventarImRaum.get(i).isEventItem()) {
				map[Held.getPosX()][Held.getPosY()].inventarImRaum.get(i).Use(trigger);
			}
		}
	}
	
	public static void CheckDoor(String tuer) { // Dringend überarbeiten und ggf an die Tuer-Klasse outsourcen
		if (tuer == "Nord") {
			if(tueren[Held.getPosX()][Held.getPosY()][Held.getPosX()][Held.getPosY()-1] != null) {
				if (tueren[Held.getPosX()][Held.getPosY()][Held.getPosX()][Held.getPosY()-1].isSimpleLocked()) {
				System.out.println("Diese Tür ist verschlossen. Ein Schlüssel könnte sie öffnen.");
				}else {
					System.out.println("Eine gewöhnliche Tür, sie ist nicht verriegelt.");
				}
			}else {
				System.out.println("Hier ist keine Tür.");
			}
		}else if(tuer == "Süd") {
			if(tueren[Held.getPosX()][Held.getPosY()][Held.getPosX()][Held.getPosY()+1] != null) {
				if (tueren[Held.getPosX()][Held.getPosY()][Held.getPosX()][Held.getPosY()+1].isSimpleLocked()) {
				System.out.println("Diese Tür ist verschlossen. Ein Schlüssel könnte sie öffnen.");
				}else {
					System.out.println("Eine gewöhnliche Tür, sie ist nicht verriegelt.");
				}
			}else {
				System.out.println("Hier ist keine Tür.");
			}
		}else if(tuer == "West") {
			if(tueren[Held.getPosX()][Held.getPosY()][Held.getPosX()-1][Held.getPosY()] != null) {
				if (tueren[Held.getPosX()][Held.getPosY()][Held.getPosX()-1][Held.getPosY()].isSimpleLocked()) {
				System.out.println("Diese Tür ist verschlossen. Ein Schlüssel könnte sie öffnen.");
				}else {
					System.out.println("Eine gewöhnliche Tür, sie ist nicht verriegelt.");
				}
			}else {
				System.out.println("Hier ist keine Tür.");
			}
		}else if(tuer == "Ost") {
			if(tueren[Held.getPosX()][Held.getPosY()][Held.getPosX()+1][Held.getPosY()] != null) {
				if (tueren[Held.getPosX()][Held.getPosY()][Held.getPosX()+1][Held.getPosY()].isSimpleLocked()) {
				System.out.println("Diese Tür ist verschlossen. Ein Schlüssel könnte sie öffnen.");
				}else {
					System.out.println("Eine gewöhnliche Tür, sie ist nicht verriegelt.");
				}
			}else {
				System.out.println("Hier ist keine Tür.");
			}
		}
	}

	public static String CheckForDoors() {	 
		String ausgabe = "Dieser Raum hat Türen im:";
		if (tuertargetting(Held.getPosX(), Held.getPosY()-1) != null) {
			ausgabe += " Norden";
		}
		if (tuertargetting(Held.getPosX(), Held.getPosY()+1) != null) {
			ausgabe += " Süden";
		}
		if (tuertargetting(Held.getPosX()-1, Held.getPosY()) != null) {
			ausgabe += " Westen";
		}
		if (tuertargetting(Held.getPosX()+1, Held.getPosY()) != null) {
			ausgabe += " Osten";
		}
		return ausgabe;
	}
	
	public static Tuer tuertargetting (int zielraumX, int zielraumY) {
		if (tueren[Held.getPosX()][Held.getPosY()][zielraumX][zielraumY] != null) {
			return tueren[Held.getPosX()][Held.getPosY()][zielraumX][zielraumY];
		}else if (tueren[zielraumX][zielraumY][Held.getPosX()][Held.getPosY()] != null) {
			return tueren[zielraumX][zielraumY][Held.getPosX()][Held.getPosY()];
		}else {
			return null;
		}
	}
	
	public static Event getEventItem() {
		return eventItem;
	}


	public static void setEventItem(Event eventItem) {
		Spiel.eventItem = eventItem;
	}
	
	
	
	// -------------------- Test-Methoden, können später gelöscht werden --------------------
	



	public static void TesteAlleItems() {
		for (int i = 0; i < items.size(); i++) {
			System.out.println(Spiel.items.get(i).getName());
		}
	}
	

	
}
