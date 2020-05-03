import java.util.ArrayList;
import java.util.Scanner;

public class Spiel {
	
	public static Raum[][] map = new Raum[4][4];
	public static ArrayList<Item> items = new ArrayList<Item>();
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Spiel.GeneriereAlleItems();
		//Spiel.TesteAlleItems();
		Spiel.DefaultMap();
		Spiel.StartingPos(0, 0);
		Spiel.StartRaum();
		Spiel.UserEingabe();
		
	}
	
	
	// Aufbau der Karte
	public static void DefaultMap() {
		// Erinnerung (X, Y, Nord, S�d, West, Ost)
		// Erinnerung (X, Y, Nord, S�d, West, Ost, ItemID)
		// Erinnerung (X, Y, Nord, S�d, West, Ost, NordLocked, S�dLocked, WestLocked, OstLocked)
		map[0][0] = new Raum(0, 0, false, true, false, false, 6);
		map[1][0] = new Raum(1, 0, false, true, false, true);
		map[2][0] = new Raum(2, 0, false, true, true, false);
		map[3][0] = new Raum(3, 0, false, true, false, false);
		
		map[0][1] = new Raum(0, 1, true, true, false, true, false, false, false, true, 7);
		map[1][1] = new Raum(1, 1, true, true, true, false);
		map[2][1] = new Raum(2, 1, true, false, false, true);
		map[3][1] = new Raum(3, 1, true, true, true, false);
		
		map[0][2] = new Raum(0, 2, true, false, false, false, 1);
		map[1][2] = new Raum(1, 2, true, true, false, false);
		map[2][2] = new Raum(2, 2, false, true, false, true);
		map[3][2] = new Raum(3, 2, true, true, true, false);
		
		map[0][3] = new Raum(0, 3, false, false, false, true);
		map[1][3] = new Raum(1, 3, true, true, true, true);
		map[2][3] = new Raum(2, 3, true, false, true, false);
		map[3][3] = new Raum(3, 3, true, false, false, false);
	}
	
	
	
	// Aktionen des Spielers
	public static void GoNord () {
		if (map[Held.posX][Held.posY].isTuerNord()) {
			if (map[Held.posX][Held.posY].isTuerNordLocked()) {
				System.out.println("Diese T�r ist verschlossen.");
			}else {
				System.out.println("Du verl�sst den Raum nach Norden.");
				Held.posY--;
				Spiel.BetreteRaum();
			}
		}else {
			System.out.println("Dort ist kein Ausgang.");
		}
	}
	
	public static void GoSued () {
		if (map[Held.posX][Held.posY].isTuerSued()) {
			if (map[Held.posX][Held.posY].isTuerSuedLocked()) {
				System.out.println("Diese T�r ist verschlossen.");
			}else {
				System.out.println("Du verl�sst den Raum nach S�den.");
				Held.posY++;
				Spiel.BetreteRaum();
			}
		}else {
			System.out.println("Dort ist kein Ausgang.");
		}
	}
	
	public static void GoWest () {
		if (map[Held.posX][Held.posY].isTuerWest()) {
			if (map[Held.posX][Held.posY].isTuerWestLocked()) {
				System.out.println("Diese T�r ist verschlossen.");
			}else {
				System.out.println("Du verl�sst den Raum nach Westen.");
				Held.posX--;
				Spiel.BetreteRaum();
			}
		}else {
			System.out.println("Dort ist kein Ausgang.");
		}
	}
	
	public static void GoOst () {
		if (map[Held.posX][Held.posY].isTuerOst()) {
			if (map[Held.posX][Held.posY].isTuerOstLocked()) {
				System.out.println("Diese T�r ist verschlossen.");
			}else {
				System.out.println("Du verl�sst den Raum nach Osten.");
				Held.posX++;
				Spiel.BetreteRaum();
			}
		}else {
			System.out.println("Dort ist kein Ausgang.");
		}
	}
	
	public static void UseItem(Item itemX, String befehl) {
		itemX.Use(befehl);
		if(itemX.isVerbrauchsItem()) {
			Held.inventar.remove(Held.inventar.indexOf(itemX));
		}
	}
	
	public static void PickupItem(Item itemX) {
		if (map[Held.posX][Held.posY].inventarImRaum.contains(itemX)) {
			if (Held.CheckIfItemFitsInventory(itemX.getWeight())) {
				Held.inventar.add(itemX);
				map[Held.posX][Held.posY].RemoveItemFromRoom(itemX);
				System.out.println("Du hast " + itemX.getName() + " aufgehoben.");
			}else {
				System.out.println("Dieses Item ist zu schwer, als dass du es noch tragen k�nntest.");
			}				
		}else {
			System.out.println("Du kannst dieses Item hier nirgendwo finden.");
		}

	}
	
	public static void DropItem(Item itemX) {
		if (Held.inventar.contains(itemX)) {
			map[Held.posX][Held.posY].AddItemToRoom(itemX);
			Held.inventar.remove(Held.inventar.indexOf(itemX));
			System.out.println("Du hast " + itemX.getName() + " fallen gelassen." );
			if (itemX.isDropEffekt()) {
				itemX.DropActivator();
			}
		}else {
			System.out.println("Du kannst nichts fallen lassen, was du nicht besitzt.");
		}
	}
	
	public static void help() {	
		System.out.println("===================");
		System.out.println("Anmerk: Alle Item-Namen sind Case-Sensitive.");
		System.out.println("Hilfe - Zeigt alle g�ltigen Befehle an.");
		System.out.println("Geh HIMMELSRICHTUNG - Bewegt dich in die entsprechende Himmelsrichtung");
		System.out.println("Schau PARAMETER - Gibt Informationen �ber einen Raum, eine T�r oder ein Item.");
		System.out.println("Heb ITEM - Nimmt ein Item auf, welches in diesem Raum liegt.");
		System.out.println("Fallenlassen ITEM - L�sst ein Item fallen");
		System.out.println("Benutze ITEM - Verwendet ein Item.");
		System.out.println("===================");
	}
	
	public static void ObserveRoom() {
		if (Held.hasSight) {
			map[Held.posX][Held.posY].getBeschreibung();
			System.out.println(map[Held.posX][Held.posY].CheckForDoors());
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
		String eingabe = scan.nextLine();
		Spiel.BefolgeBefehl(eingabe);
	}
	
	public static void BefolgeBefehl(String befehl) {
		Item itemFromCMD = Spiel.CommandTranslaterItem(befehl);

		if (befehl.toUpperCase().contains("GEH")) {
			if (befehl.toUpperCase().contains("WEST")) {
				Spiel.GoWest();
			}else if (befehl.toUpperCase().contains("OST")) {
				Spiel.GoOst();
			}else if (befehl.toUpperCase().contains("NORD")) {
				Spiel.GoNord();
			}else if (befehl.toUpperCase().contains("S�D")) {
				Spiel.GoSued();
			}
		}else if (befehl.toUpperCase().contains("BENUTZE")) {
			if(itemFromCMD != null) {
				Spiel.UseItem(itemFromCMD, befehl);
			}else {
				System.out.println("Was genau willst du benutzen?");
			}
			
		}else if (befehl.toUpperCase().contains("SCHAU")) {
			if (befehl.toUpperCase().contains("RAUM")) {
				Spiel.ObserveRoom();
			}else if (befehl.toUpperCase().contains("SELBST")) {
				Held.ZeigeLeben();
				Held.ZeigeGewicht();
			}else if(befehl.toUpperCase().contains("T�R")) {
				if (befehl.toUpperCase().contains("WEST")) {
					map[Held.posX][Held.posY].CheckDoor("West");
				}else if (befehl.toUpperCase().contains("OST")) {
					map[Held.posX][Held.posY].CheckDoor("Ost");
				}else if (befehl.toUpperCase().contains("NORD")) {
					map[Held.posX][Held.posY].CheckDoor("Nord");
				}else if (befehl.toUpperCase().contains("S�D")) {
					map[Held.posX][Held.posY].CheckDoor("S�d");
				}
			}else if(befehl.toUpperCase().contains("INVENTAR")) {
				Held.ZeigeInventar();
			}else if (Spiel.items.contains(itemFromCMD)) {
				System.out.println(itemFromCMD.getBeschreibung());
			}else {
				System.out.println("Was genau m�chtest du dir anschauen?");
			}
		}else if(befehl.toUpperCase().contains("HEBE")){
			Spiel.PickupItem(itemFromCMD);
		}else if(befehl.toUpperCase().contains("FALLEN")){
			Spiel.DropItem(itemFromCMD);
		}else if(befehl.toUpperCase().contains("HILF")){
			Spiel.help();
		}else {
			System.out.println("Wups, ung�ltiger Befehl");
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
			System.out.println(map[Held.posX][Held.posY].CheckForDoors());
			Spiel.EventItem();
		}else {
			System.out.println("Es ist zu dunkel um irgendetwas zu erkennen.");
			Spiel.EventItem();
		}
		map[Held.posX][Held.posY].setBesucht(true);
		System.out.println("========================================");
	}
	
	public static void GeneriereAlleItems() {
		for (int i = 0; i < Texte.itemNamen.size(); i++) {
			items.add(new Item(i, Texte.itemNamen.get(i), Texte.itemBeschreibung.get(i), Texte.itemGewichte.get(i)));
		}
	}
	
	public static Item CommandTranslaterItem(String command) {
		Item ausgabe = null;
		boolean checkForSecondItemTrue = false;
		for (int i = 0; i < items.size(); i++) {
			if (command.contains(items.get(i).getName())) {
				if (checkForSecondItemTrue) {
					System.out.println("Error, Zwei Items im Befehl enthalten");
					ausgabe = null;
					break;
				}else {
					checkForSecondItemTrue = true;
					ausgabe = items.get(i);
				}
			}
		}
		return ausgabe;
	}
	
	public static boolean CheckIfDoorIsThere(String Richtung) {
		if (Richtung == "West") {
			return map[Held.posX][Held.posY].isTuerWest();
		}else if(Richtung == "Ost") {
			return map[Held.posX][Held.posY].isTuerOst();
		}else if(Richtung == "Nord") {
			return map[Held.posX][Held.posY].isTuerNord();
		}else if(Richtung == "S�d") {
			return map[Held.posX][Held.posY].isTuerSued();
		}else {

			return false;
		}
	}
	
	public static void StartRaum() {
		System.out.println(Texte.startMessage);
		map[Held.posX][Held.posY].setBesucht(true);
	}

	public static void EventItem() {
		for (int i = 0; i < map[Held.posX][Held.posY].inventarImRaum.size(); i++) {
			if (map[Held.posX][Held.posY].inventarImRaum.get(i).getName().contains("evt_")) {
				map[Held.posX][Held.posY].inventarImRaum.get(i).Use(map[Held.posX][Held.posY].inventarImRaum.get(i).getName());
			}
		}
	}
	
	// Test-Methoden, k�nnen sp�ter gel�scht werden
	
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
//						System.out.println("Die T�ren von Raum: " + x + "-" + y + " passen nicht zu seinen Nachbarr�umen.");
//					}else {
//						System.out.println("Die T�ren von Raum: " + x + "-" + y + " sind ok.");
//					}
//				}
//			}
//		}
//	}
}
