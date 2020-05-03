import java.util.ArrayList;

public class Raum {
// Attribute
	private int x;
	private int y;
	private boolean tuerNord;
	private boolean tuerSued;
	private boolean tuerWest;
	private boolean tuerOst;
	private boolean tuerNordLocked = false;
	private boolean tuerSuedLocked = false;
	private boolean tuerWestLocked = false;
	private boolean tuerOstLocked = false;
	private String tuerMasterLocked;
	private boolean besucht = false;
	private boolean hasItem;
	ArrayList<Item> inventarImRaum = new ArrayList<Item>();
	private String beschreibung = "";
	
// Konstruktoren	
	public Raum(int x, int y, boolean tuerNord, boolean tuerSued, boolean tuerWest, boolean tuerOst, Integer itemID) {
		super();
		this.x = x;
		this.y = y;
		this.tuerNord = tuerNord;
		this.tuerSued = tuerSued;
		this.tuerWest = tuerWest;
		this.tuerOst = tuerOst;
		this.AddItemToRoom(Spiel.items.get(itemID));
		this.hasItem =true;
	}

	public Raum(int x, int y, boolean tuerNord, boolean tuerSued, boolean tuerWest, boolean tuerOst) {
		super();
		this.x = x;
		this.y = y;
		this.tuerNord = tuerNord;
		this.tuerSued = tuerSued;
		this.tuerWest = tuerWest;
		this.tuerOst = tuerOst;
	}
	
	public Raum(int x, int y, boolean tuerNord, boolean tuerSued, boolean tuerWest, boolean tuerOst,
			boolean tuerNordLocked, boolean tuerSuedLocked, boolean tuerWestLocked, boolean tuerOstLocked) {
		super();
		this.x = x;
		this.y = y;
		this.tuerNord = tuerNord;
		this.tuerSued = tuerSued;
		this.tuerWest = tuerWest;
		this.tuerOst = tuerOst;
		this.tuerNordLocked = tuerNordLocked;
		this.tuerSuedLocked = tuerSuedLocked;
		this.tuerWestLocked = tuerWestLocked;
		this.tuerOstLocked = tuerOstLocked;
	}
	
	public Raum(int x, int y, boolean tuerNord, boolean tuerSued, boolean tuerWest, boolean tuerOst,
			boolean tuerNordLocked, boolean tuerSuedLocked, boolean tuerWestLocked, boolean tuerOstLocked, Integer itemID) {
		super();
		this.x = x;
		this.y = y;
		this.tuerNord = tuerNord;
		this.tuerSued = tuerSued;
		this.tuerWest = tuerWest;
		this.tuerOst = tuerOst;
		this.tuerNordLocked = tuerNordLocked;
		this.tuerSuedLocked = tuerSuedLocked;
		this.tuerWestLocked = tuerWestLocked;
		this.tuerOstLocked = tuerOstLocked;
		this.AddItemToRoom(Spiel.items.get(itemID));
		this.hasItem =true;
	}

	
	

// Methoden

	public void Lock(String tuer) {
		if (tuer == "Nord" && tuerNord == true) {
			this.tuerNordLocked = true;
		}else if(tuer == "Süd" && tuerSued == true) {
			this.tuerSuedLocked = true;
		}else if(tuer == "West" && tuerWest == true) {
			this.tuerWestLocked = true;
		}else if(tuer == "Ost" && tuerOst == true) {
			this.tuerOstLocked = true;
		}else {
			System.out.println("Fehler beim verschließen der Tuer: " + tuer);
		}
	}
	
	public void Unlock(String tuer) {
		if (tuer == "Nord" && this.tuerNord == true) {
			this.tuerNordLocked = false;
		}else if(tuer == "Süd" && this.tuerSued == true) {
			this.tuerSuedLocked = false;
		}else if(tuer == "West" && this.tuerWest == true) {
			this.tuerWestLocked = false;
		}else if(tuer == "Ost" && this.tuerOst == true) {
			this.tuerOstLocked = false;
		}else {
			System.out.println("Fehler beim öffnen der Tuer: " + tuer);
		}
	}
	
	
	public void CheckDoor(String tuer) {
		if (tuer == "Nord") {
			if(this.isTuerNord()) {
				this.LockedOrUnlocked(this.isTuerNordLocked());
			}else {
				System.out.println("Hier ist keine Tür.");
			}
		}else if(tuer == "Süd") {
			if(this.isTuerSued()) {
				this.LockedOrUnlocked(this.isTuerSuedLocked());
			}else {
				System.out.println("Hier ist keine Tür.");
			}
		}else if(tuer == "West") {
			if(this.isTuerWest()) {
				this.LockedOrUnlocked(this.isTuerWestLocked());
			}else {
				System.out.println("Hier ist keine Tür.");
			}
		}else if(tuer == "Ost") {
			if(this.isTuerOst()) {
				this.LockedOrUnlocked(this.isTuerOstLocked());
			}else {
				System.out.println("Hier ist keine Tür.");
			}
		}
	}
	
	public void LockedOrUnlocked(boolean locked) {
		if (locked) {
			System.out.println("Diese Tür ist verschlossen. Ein Schlüssel könnte sie öffnen.");
		}else {
			System.out.println("Eine gewöhnliche Tür, sie ist nicht verriegelt.");
		}
	}
	

	
	public String CheckForDoors() {
		String ausgabe = "Dieser Raum hat Türen im:";
		if (this.tuerNord) {
			ausgabe += " Norden";
		}
		if (this.tuerSued) {
			ausgabe += " Süden";
		}
		if (this.tuerWest) {
			ausgabe += " Westen";
		}
		if (this.tuerOst) {
			ausgabe += " Osten";
		}
		return ausgabe;
	}
	
	public void AddItemToRoom(Item itemX) {
		this.inventarImRaum.add(itemX);
	}
	
	public void RemoveItemFromRoom(Item itemX) {
		this.inventarImRaum.remove(itemX);
	}
	
	public void ZeigeInventarImRaum() {
		String ausgabe = "In diesem Raum findest du folgende Items: ";
		for (int i = 0; i < this.inventarImRaum.size(); i++) {
			ausgabe+= this.inventarImRaum.get(i).getName() + " ";
		}
		System.out.println(ausgabe);
	}
	
	
	
	
	
	
	
	
	
	
// Getter und Setter	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isTuerNord() {
		return tuerNord;
	}
	public void setTuerNord(boolean tuerNord) {
		this.tuerNord = tuerNord;
	}
	public boolean isTuerSued() {
		return tuerSued;
	}
	public void setTuerSued(boolean tuerSued) {
		this.tuerSued = tuerSued;
	}
	public boolean isTuerWest() {
		return tuerWest;
	}
	public void setTuerWest(boolean tuerWest) {
		this.tuerWest = tuerWest;
	}
	public boolean isTuerOst() {
		return tuerOst;
	}
	public void setTuerOst(boolean tuerOst) {
		this.tuerOst = tuerOst;
	}
	public boolean isTuerNordLocked() {
		return tuerNordLocked;
	}
	public void setTuerNordLocked(boolean tuerNordLocked) {
		this.tuerNordLocked = tuerNordLocked;
	}
	public boolean isTuerSuedLocked() {
		return tuerSuedLocked;
	}
	public void setTuerSuedLocked(boolean tuerSuedLocked) {
		this.tuerSuedLocked = tuerSuedLocked;
	}
	public boolean isTuerWestLocked() {
		return tuerWestLocked;
	}
	public void setTuerWestLocked(boolean tuerWestLocked) {
		this.tuerWestLocked = tuerWestLocked;
	}
	public boolean isTuerOstLocked() {
		return tuerOstLocked;
	}
	public void setTuerOstLocked(boolean tuerOstLocked) {
		this.tuerOstLocked = tuerOstLocked;
	}
	public boolean isBesucht() {
		return besucht;
	}
	public void setBesucht(boolean besucht) {
		this.besucht = besucht;
	}
	public boolean isHasItem() {
		return hasItem;
	}
	public void setHasItem(boolean hasItem) {
		this.hasItem = hasItem;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getTuerMasterLocked() {
		return tuerMasterLocked;
	}

	public void setTuerMasterLocked(String tuerMasterLocked) {
		this.tuerMasterLocked = tuerMasterLocked;
	}

	
	
	
	
	
	
	
}
