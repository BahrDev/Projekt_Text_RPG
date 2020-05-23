//
//public class TempCodeAuslagerung {
//	
//	private Integer itemID;
//	private String name;
//	private String beschreibung = "";
//	private int weight;
//	private boolean eventItem = false;
//	private boolean verbrauchsItem = false;
//	private boolean dropEffekt = false;
//	
//	public Item(int itemID, String name, String beschreibung, int weight) {
//		super();
//		this.itemID = itemID;
//		this.name = name;
//		this.beschreibung = beschreibung;
//		this.weight = weight;
//		if(this.name.contains("evt_")) {
//			this.eventItem = true;
//		}
//		if (this.name.contains("trank") || this.name.contains("lüssel")) {
//			this.verbrauchsItem = true;
//		}
//		if (this.name.contains("Lampe")) {
//			this.dropEffekt = true;
//		}
//	}
//	
////	public void Key (int itemID, boolean schloss) {
////		if (itemID != 1) {
////			this.Denied();
////		} else if (Spiel.map[Held.posX][Held.posY].is){
////			
////		}
////		
////	}
//	
//	public void Use(String befehl) {
//		if (befehl.contains("Schlüssel")) {
//			this.Schlüssel(befehl);
//		}else if (befehl.contains("Lampe")){
//			this.Lampe();
//		}else if (befehl.contains("Kompass")){
//			this.Kompass();
//		}else if (befehl.contains("evt_Pfeilfalle")){
//			this.EvtPfeilfalle();
//		}else {
//			System.out.println("Error, Fehler beim benutzen.");
//		}
//	}
//		
//		
//	public void Denied() {
//		System.out.println("Dies hat keine Auswirkungen.");
//	}
//	
//	public void DropActivator() {
//		if (this.name == "Lampe") {
//			this.LampeDrop();
//		}
//	}
//	
//	
//
//	public void Schlüssel(String befehl) {						// überarbeiten weil Tür nun eine Klasse ist
////		if (befehl.toUpperCase().contains("WEST")) {
////			if (Spiel.map[Held.posX][Held.posY].isTuerWest()) {
////				if (Spiel.map[Held.posX][Held.posY].isTuerWestLocked()) {
////					Spiel.map[Held.posX][Held.posY].setTuerWestLocked(false);
////					System.out.println("Die Tür wurde entriegelt, dein Schlüssel bricht dabei ab.");
////				}else {
////					System.out.println("Diese Tür ist nicht verschlossen.");
////				}
////			}else {
////				System.out.println("Hier ist keine Tür.");
////			}
////		}else if (befehl.toUpperCase().contains("OST")) {
////			if (Spiel.map[Held.posX][Held.posY].isTuerOst()) {
////				if (Spiel.map[Held.posX][Held.posY].isTuerOstLocked()) {
////					Spiel.map[Held.posX][Held.posY].setTuerOstLocked(false);
////					System.out.println("Die Tür wurde entriegelt, dein Schlüssel bricht dabei ab.");
////				}else {
////					System.out.println("Diese Tür ist nicht verschlossen.");
////				}
////			}else {
////				System.out.println("Hier ist keine Tür.");
////			}
////		}else if (befehl.toUpperCase().contains("NORD")) {
////			if (Spiel.map[Held.posX][Held.posY].isTuerNord()) {
////				if (Spiel.map[Held.posX][Held.posY].isTuerNordLocked()) {
////					Spiel.map[Held.posX][Held.posY].setTuerNordLocked(false);
////					System.out.println("Die Tür wurde entriegelt, dein Schlüssel bricht dabei ab.");
////				}else {
////					System.out.println("Diese Tür ist nicht verschlossen.");
////				}
////			}else {
////				System.out.println("Hier ist keine Tür.");
////			}
////		}else if (befehl.toUpperCase().contains("SÜD")) {
////			if (Spiel.map[Held.posX][Held.posY].isTuerNord()) {
////				if (Spiel.map[Held.posX][Held.posY].isTuerNordLocked()) {
////					Spiel.map[Held.posX][Held.posY].setTuerNordLocked(false);
////					System.out.println("Die Tür wurde entriegelt, dein Schlüssel bricht dabei ab.");
////				}else {
////					System.out.println("Diese Tür ist nicht verschlossen.");
////				}
////			}else {
////				System.out.println("Hier ist keine Tür.");
////			}
////		}else {
////			System.out.println("Wo bitte willst du den Schlüssel rein stecken!?!");
////		}
//	}
//
//	public void Kompass() {
//		if (Held.hasSight) {
//			System.out.println("Deine Koordinaten: x=" + Held.posX + " y=" + Held.posY);
//		}else {
//			System.out.println("Es ist zu dunkel um zu erkennen was dein Kompass anzeigt.");
//		}
//		
//	}
//	
//	public void Lampe() {
//		Held.hasSight = true;
//		System.out.println("Du zündest die Lampe an, das Licht erhellt die Dunkelheit grade genug, damit du deine Umgebung erkennen kannst.");
//	}
//	
//	public void LampeDrop() {
//		Held.hasSight = false;
//		System.out.println("Die Lampe geht aus, es wird dunkel.");
//	}
//	
//	public int Schild(int schaden) {
//		if (Held.CheckInventoryForItem("Schild")) {
//			schaden -= 1;
//		}
//		return schaden;
//	}
//	
//	public void Heiltrank() {
//		Held.Heilung(1);
//	}
//	
//	public void EvtPfeilfalle() {
//		int schaden = 1;
//		System.out.println(this.beschreibung);
//		if (Held.CheckInventoryForItem("Schild")) {
//			this.Schild(schaden);
//			System.out.println("Zum Glück hast du deinen truen Schild.");
//		}
//		if (schaden > 0) {
//			Held.Schaden(schaden);
//		}
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	public Integer getItemID() {
//		return itemID;
//	}
//
//	public void setItemID(Integer itemID) {
//		this.itemID = itemID;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getBeschreibung() {
//		return beschreibung;
//	}
//
//	public void setBeschreibung(String beschreibung) {
//		this.beschreibung = beschreibung;
//	}
//
//	public int getWeight() {
//		return weight;
//	}
//
//	public void setWeight(int weight) {
//		this.weight = weight;
//	}
//
//	public boolean isEventItem() {
//		return eventItem;
//	}
//
//	public void setEventItem(boolean eventItem) {
//		this.eventItem = eventItem;
//	}
//
//	public boolean isVerbrauchsItem() {
//		return verbrauchsItem;
//	}
//
//	public void setVerbrauchsItem(boolean verbrauchsItem) {
//		this.verbrauchsItem = verbrauchsItem;
//	}
//
//	public boolean isDropEffekt() {
//		return dropEffekt;
//	}
//
//	public void setDropEffekt(boolean dropEffekt) {
//		this.dropEffekt = dropEffekt;
//	}
//	
//	
//	
//
//}
