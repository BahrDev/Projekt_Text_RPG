import java.util.ArrayList;
import java.util.Scanner;

public class Spiel {
	
	public static Raum[][] map = new Raum[6][6];
	public static Tuer[][][][] tueren = new Tuer[6][6][6][6];
	public static ArrayList<Item> items = new ArrayList<Item>();
	public static Scanner scan = new Scanner(System.in);
	public static Event eventItem = null;
	
	
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
	
	
	// Aufbau der Karte
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
	
	
	// Aktionen des Spielers
	public static void Go (int laufrichtungX, int laufrichtungY) {
		int zielraumX = Held.posX + laufrichtungX;
		int zielraumY = Held.posY + laufrichtungY;
		if (tuertargetting(zielraumX, zielraumY) != null) {
			if (tuertargetting(zielraumX, zielraumY).isMasterLocked()) {
				System.out.println("Du brauchst einen besonderen Schlüssel um diese Tür zu öffnen.");
			}else if (tuertargetting(zielraumX, zielraumY).isSimpleLocked()) {
				System.out.println("Diese Tür ist verschlossen.");
			}else {
				System.out.println("Du verlässt den Raum nach Süden."); //Richtungsangabe als Methode schreiben
				Spiel.Event("Leave");
				Held.posX = zielraumX;
				Held.posY = zielraumY;
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
				Held.inventar.add(itemFromCMD);
				map[Held.posX][Held.posY].RemoveItemFromRoom(itemFromCMD);
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
			map[Held.posX][Held.posY].AddItemToRoom(itemFromCMD);
			Held.inventar.remove(itemFromCMD);
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
		if (Held.hasSight) {
			map[Held.posX][Held.posY].getBeschreibung();
			System.out.println(CheckForDoors());
			map[Held.posX][Held.posY].ZeigeInventarImRaum();
		}else {
			System.out.println("Es ist zu dunkel um irgendetwas zu erkennen.");
		}
	}
	
	public static void ObserveSelf() {
		Held.ZeigeLeben();
		
	}
	
	// Spiel-Mechaniken
	public static void StartingPos(int x, int y) {
		Held.posX = x;
		Held.posY = y;
	}
	
	public static void UserEingabe() {
		String eingabe = scan.nextLine().toUpperCase();
		
		if (eventItem != null) {
			if (eventItem.triggerEffect(eingabe) != true) {
				Spiel.BefolgeBefehl(eingabe);
			}else {
				if (Held.isAlive) {
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
		

		if (befehl.toUpperCase().contains("GEH")) {
			if (befehl.toUpperCase().contains("WEST")) {
				Spiel.Go(-1, 0);
			}else if (befehl.toUpperCase().contains("OST")) {
				Spiel.Go(1, 0);
			}else if (befehl.toUpperCase().contains("NORD")) {
				Spiel.Go(0, -1);
			}else if (befehl.toUpperCase().contains("SÜD")) {
				Spiel.Go(0, 1);
			}
		}else if (befehl.toUpperCase().contains("SCHAU")) {
			Item itemFromCMD = Spiel.CommandTranslatorItem(befehl, "Alle");
			if (befehl.toUpperCase().contains("RAUM")) {
				Spiel.ObserveRoom();
			}else if (befehl.toUpperCase().contains("SELBST")) {
				Held.ZeigeLeben();
				Held.ZeigeGewicht();
			}else if(befehl.toUpperCase().contains("TÜR")) {
				if (befehl.toUpperCase().contains("WEST")) {
					CheckDoor("West");
				}else if (befehl.toUpperCase().contains("OST")) {
					CheckDoor("Ost");
				}else if (befehl.toUpperCase().contains("NORD")) {
					CheckDoor("Nord");
				}else if (befehl.toUpperCase().contains("SÜD")) {
					CheckDoor("Süd");
				}
			}else if(befehl.toUpperCase().contains("INVENTAR")) {
				Held.ZeigeInventar();
			}else if (Held.inventar.contains(itemFromCMD)) {
				System.out.println(itemFromCMD.getBeschreibung());
			}else if (map[Held.posX][Held.posY].inventarImRaum.contains(itemFromCMD)) {
				System.out.println(itemFromCMD.getBeschreibung());
			}else {
				System.out.println("Was genau möchtest du dir anschauen?");
			}
		}else if (befehl.toUpperCase().contains("BENUTZE")) {
			Spiel.UseItem(befehl);	
		}else if(befehl.toUpperCase().contains("HEBE")){
			Spiel.PickupItem(befehl);
		}else if(befehl.toUpperCase().contains("FALLEN")){
			Spiel.DropItem(befehl);
		}else if(befehl.toUpperCase().contains("HILF")){
			Spiel.help();
		}else if (befehl.toUpperCase().contains("TEST")) {
													// Testen während der Runtime, später entfernen
			if (befehl.toUpperCase().contains("1")) {
				items.get(1).Use(befehl);
			}else if (befehl.toUpperCase().contains("2")) {
				System.out.println(eventItem);
			}
		}else {
			System.out.println("Wups, ungültiger Befehl");
		}
		
		if (Held.isAlive) {
			Spiel.UserEingabe();
		}else {
			System.out.println(Texte.deathMessage);
			scan.close();
		}
		
	}
	
	public static void BetreteRaum() {
		System.out.println("========================================");
		if (Held.hasSight) {
			if (map[Held.posX][Held.posY].isBesucht()) {
				System.out.println("Hier warst du schon einmal.");
			}
			System.out.println(map[Held.posX][Held.posY].getBeschreibung());;
			System.out.println(CheckForDoors());
			Spiel.Event("Enter");
		}else {
			System.out.println("Es ist zu dunkel um irgendetwas zu erkennen.");
			Spiel.Event("Enter");
		}
		map[Held.posX][Held.posY].setBesucht(true);
		System.out.println("========================================");
	}
	
	public static Item CommandTranslatorItem(String command, String arrayListUsed) {
		Item ausgabe = null;
		boolean checkForSecondItemTrue = false;
		ArrayList<Item> benutzteListe = null;
		
		if (arrayListUsed == "Raum") {
			benutzteListe = map[Held.posX][Held.posY].inventarImRaum;
		}else if (arrayListUsed == "Inventar") {
			benutzteListe = Held.inventar;
		}else if (arrayListUsed == "Alle") {
			benutzteListe = items;
		}
		
		for (int i = 0; i < benutzteListe.size(); i++) {
			if (command.contains(benutzteListe.get(i).getName())) {
				if (checkForSecondItemTrue) {
					if (ausgabe.getName() != benutzteListe.get(i).getName()) {
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
		map[Held.posX][Held.posY].setBesucht(true);
	}

	// Überarbeiten wenn die Event-Items überarbeitet werden
	public static void Event(String trigger) {
		for (int i = 0; i < map[Held.posX][Held.posY].inventarImRaum.size(); i++) {
			if (map[Held.posX][Held.posY].inventarImRaum.get(i).isEventItem()) {
				map[Held.posX][Held.posY].inventarImRaum.get(i).Use(trigger);
			}
		}
	}
	
	public static void CheckDoor(String tuer) { // Dringend überarbeiten und ggf an die Tuer-Klasse outsourcen
		if (tuer == "Nord") {
			if(tueren[Held.posX][Held.posY][Held.posX][Held.posY-1] != null) {
				if (tueren[Held.posX][Held.posY][Held.posX][Held.posY-1].isSimpleLocked()) {
				System.out.println("Diese Tür ist verschlossen. Ein Schlüssel könnte sie öffnen.");
				}else {
					System.out.println("Eine gewöhnliche Tür, sie ist nicht verriegelt.");
				}
			}else {
				System.out.println("Hier ist keine Tür.");
			}
		}else if(tuer == "Süd") {
			if(tueren[Held.posX][Held.posY][Held.posX][Held.posY+1] != null) {
				if (tueren[Held.posX][Held.posY][Held.posX][Held.posY+1].isSimpleLocked()) {
				System.out.println("Diese Tür ist verschlossen. Ein Schlüssel könnte sie öffnen.");
				}else {
					System.out.println("Eine gewöhnliche Tür, sie ist nicht verriegelt.");
				}
			}else {
				System.out.println("Hier ist keine Tür.");
			}
		}else if(tuer == "West") {
			if(tueren[Held.posX][Held.posY][Held.posX-1][Held.posY] != null) {
				if (tueren[Held.posX][Held.posY][Held.posX-1][Held.posY].isSimpleLocked()) {
				System.out.println("Diese Tür ist verschlossen. Ein Schlüssel könnte sie öffnen.");
				}else {
					System.out.println("Eine gewöhnliche Tür, sie ist nicht verriegelt.");
				}
			}else {
				System.out.println("Hier ist keine Tür.");
			}
		}else if(tuer == "Ost") {
			if(tueren[Held.posX][Held.posY][Held.posX+1][Held.posY] != null) {
				if (tueren[Held.posX][Held.posY][Held.posX+1][Held.posY].isSimpleLocked()) {
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
		if (tuertargetting(Held.posX, Held.posY-1) != null) {
			ausgabe += " Norden";
		}
		if (tuertargetting(Held.posX, Held.posY+1) != null) {
			ausgabe += " Süden";
		}
		if (tuertargetting(Held.posX-1, Held.posY) != null) {
			ausgabe += " Westen";
		}
		if (tuertargetting(Held.posX+1, Held.posY) != null) {
			ausgabe += " Osten";
		}
		return ausgabe;
	}
	
	public static Tuer tuertargetting (int zielraumX, int zielraumY) {
		if (tueren[Held.posX][Held.posY][zielraumX][zielraumY] != null) {
			return tueren[Held.posX][Held.posY][zielraumX][zielraumY];
		}else if (tueren[zielraumX][zielraumY][Held.posX][Held.posY] != null) {
			return tueren[zielraumX][zielraumY][Held.posX][Held.posY];
		}else {
			return null;
		}
	}
	
	
	// Test-Methoden, können später gelöscht werden
	
	public static void TesteAlleItems() {
		for (int i = 0; i < items.size(); i++) {
			System.out.println(Spiel.items.get(i).getName());
		}
	}
	
//	public static void CheckIfRoomsMatch() {
//		boolean error = false;
//		for (int y = 0; y < map.length; y++) {
//			for (int x = 0; x < map.length; x++) {
//				if (map[x][y] != null) {
//					if (map[x][y].isTuerNord() == true) {
//						if (map[x][y-1].isTuerSued() == false) {
//							error = true;
//						}
//					}else if (map[x][y].isTuerSued() == true) {
//						if (map[x][y+1].isTuerNord() == false) {
//							error = true;
//						}
//					}else if (map[x][y].isTuerWest() == true) {
//						if (map[x-1][y].isTuerOst() == false) {
//							error = true;
//						}
//					}else if (map[x][y].isTuerOst() == true) {
//							if (map[x+1][y].isTuerWest() == false) {
//								error = true;
//							}
//					}
//					if (error) {
//						System.out.println("Die Türen von Raum: " + x + "-" + y + " passen nicht zu seinen Nachbarräumen.");
//					}else {
//						System.out.println("Die Türen von Raum: " + x + "-" + y + " sind ok.");
//					}
//				}
//			}
//		}
//	}
	
//	public static void GoNord () {
//	if (map[Held.posX][Held.posY].isTuerNord()) {
//		if (map[Held.posX][Held.posY].isTuerNordLocked()) {
//			System.out.println("Diese Tür ist verschlossen.");
//		}else {
//			System.out.println("Du verlässt den Raum nach Norden.");
//			Held.posY--;
//			Spiel.BetreteRaum();
//		}
//	}else {
//		System.out.println("Dort ist kein Ausgang.");
//	}
//}
//
//public static void GoSued () {
//	if (map[Held.posX][Held.posY].isTuerSued()) {
//		if (map[Held.posX][Held.posY].isTuerSuedLocked()) {
//			System.out.println("Diese Tür ist verschlossen.");
//		}else {
//			System.out.println("Du verlässt den Raum nach Süden.");
//			Held.posY++;
//			Spiel.BetreteRaum();
//		}
//	}else {
//		System.out.println("Dort ist kein Ausgang.");
//	}
//}
//
//public static void GoWest () {
//	if (map[Held.posX][Held.posY].isTuerWest()) {
//		if (map[Held.posX][Held.posY].isTuerWestLocked()) {
//			System.out.println("Diese Tür ist verschlossen.");
//		}else {
//			System.out.println("Du verlässt den Raum nach Westen.");
//			Held.posX--;
//			Spiel.BetreteRaum();
//		}
//	}else {
//		System.out.println("Dort ist kein Ausgang.");
//	}
//}
//
//public static void GoOst () {
//	if (map[Held.posX][Held.posY].isTuerOst()) {
//		if (map[Held.posX][Held.posY].isTuerOstLocked()) {
//			System.out.println("Diese Tür ist verschlossen.");
//		}else {
//			System.out.println("Du verlässt den Raum nach Osten.");
//			Held.posX++;
//			Spiel.BetreteRaum();
//		}
//	}else {
//		System.out.println("Dort ist kein Ausgang.");
//	}
//}
//	
	
//	public static boolean CheckIfDoorIsThere(String Richtung) {
//	if (Richtung == "West") {
//		return map[Held.posX][Held.posY].isTuerWest();
//	}else if(Richtung == "Ost") {
//		return map[Held.posX][Held.posY].isTuerOst();
//	}else if(Richtung == "Nord") {
//		return map[Held.posX][Held.posY].isTuerNord();
//	}else if(Richtung == "Süd") {
//		return map[Held.posX][Held.posY].isTuerSued();
//	}else {
//
//		return false;
//	}
//}	
	
}
