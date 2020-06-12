package game;
import java.util.ArrayList;

import items.*;

public class Raum {
// -------------------- Attribute --------------------
	private int x;
	private int y;
	private boolean besucht = false;
	private boolean hasItem;
	ArrayList<Item> inventarImRaum = new ArrayList<Item>();
	private String beschreibung = "";
	
	
// -------------------- Konstruktoren --------------------
	public Raum(int x, int y) throws CloneNotSupportedException {
		this(x, y, null, null, null);
		}
	
	public Raum(int x, int y, Integer itemID) throws CloneNotSupportedException{
		this(x, y, itemID, null, null);
		}
	
	public Raum(int x, int y, Integer itemID, Integer itemID2) throws CloneNotSupportedException{
		this(x, y, itemID, itemID2, null);
	}
	
	public Raum(int x, int y, Integer itemID, Integer itemID2, Integer itemID3) throws CloneNotSupportedException{
		super();
		this.x = x;
		this.y = y;
		this.beschreibung = Texte.raumTexte[x][y];
		if (itemID != null) {
			this.addItemToRoom((Item)Spiel.cloneItemSelect(itemID).clone());
			this.hasItem =true;
		}
		if (itemID2 != null) {
			this.addItemToRoom((Item)Spiel.cloneItemSelect(itemID2).clone());
		}
		if (itemID3 != null) {
			this.addItemToRoom((Item)Spiel.cloneItemSelect(itemID3).clone());
		}
	}


// -------------------- Methoden --------------------

	public void addItemToRoom(Item itemX) {
		this.inventarImRaum.add(itemX);
	}
	
	public void removeItemFromRoom(Item itemX) {
		this.inventarImRaum.remove(itemX);
	}
	
	public void zeigeInventarImRaum() {
		String ausgabe = "In diesem Raum findest du folgende Items: \n";
		boolean itemsVorhanden = false;
		for (int i = 0; i < this.inventarImRaum.size(); i++) {
			if (this.inventarImRaum.get(i).getName().contains("evt_")) {
				if (Spiel.eventsSichtbar == false) {
					continue;
				}
			}else {
				ausgabe+= "- " + this.inventarImRaum.get(i).getName() + "\n";
				itemsVorhanden = true;
			}
		}
		if (itemsVorhanden == false) {
			ausgabe = "Du kannst in diesem Raum nichts von Wert finden.";
		}
		System.out.println(ausgabe);
	}
	

// -------------------- Getter und Setter --------------------	
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
	
}
