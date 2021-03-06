package game;
import java.util.ArrayList;

import items.*;

public class Held {
	
	// Attribute
	private static int leben = 5;
	private static int lebenMax = 5;
	private static int kraft = 5;
	private static int armor = 0;
	private static int posX;
	private static int posY;
	private static boolean hasSight = false;		// Default: false
	private static boolean isAlive = true;
	private static ArrayList<Item> inventar = new ArrayList<Item>();
	
	
	// Methoden
	public static boolean checkIfItemFitsInventory(int GewichtItem) {
		if ((Held.inventoryWeight() + GewichtItem) > Held.kraft) {
			return false;
		}else {
			return true;
		}
			
	}
	
	public static void zeigeGewicht() {
		System.out.println(Texte.heldzeigeGewicht + ": " + Held.inventoryWeight() + "/" + kraft);
	}
	
	public static int inventoryWeight() {
		int weight = 0;
		for (int i = 0; i < inventar.size(); i++) {
			weight += Held.inventar.get(i).getWeight();
		}
		return weight;
	}
	
	public static void zeigeInventar() {
		String ausgabe = Texte.heldZeigeInventar + ": \n";
		for (int i = 0; i < inventar.size(); i++) {
			ausgabe+= "- " + Held.inventar.get(i).getName() + "\n";
		}
		System.out.println(ausgabe);
	}
	
	public static boolean checkInventoryForItem(String itemName) {
		boolean ausgabe = false;
		for (int i = 0; i < Held.inventar.size(); i++) {
			if (Held.inventar.get(i).getName() == itemName) {
				ausgabe = true;
			}
		}
		return ausgabe;
	}
		
	public static void zeigeLeben() {
		System.out.println(Texte.heldZeigeLeben + ": " + leben + "/" + lebenMax);
	}
	
	public static void heilung(int x) {
		if (leben < lebenMax) {
			if (leben + x >lebenMax) {
				leben = lebenMax;
			}else {
				leben += x;
			}
			System.out.println(Texte.heldHeilung1 + " " + x + " " +  Texte.heldHeilung2);
		}else {
			System.out.println(Texte.heldHeilung3);
		}
	}
	
	public static void schaden(int x) {
		int schaden = x - armor;
		if (schaden <= 0) {
			System.out.println(Texte.heldSchaden1);
		}else {
			leben -= x;
			System.out.println(Texte.heldSchaden2 + " " + x + " " + Texte.heldSchaden3);
			if (Held.checkIfDead()) {
				Held.isAlive = false;
			}else {
				Held.zeigeLeben();
			}
		}
	}
	
	public static boolean checkIfDead() {
		if (leben <=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void kraftRauf(int x) {
		kraft += x;
		System.out.println(Texte.heldKraftRauf);
	}

	
	// Getter und Setter
	public static int getLeben() {
		return leben;
	}

	public static void setLeben(int leben) {
		Held.leben = leben;
	}

	public static int getLebenMax() {
		return lebenMax;
	}

	public static void setLebenMax(int lebenMax) {
		Held.lebenMax = lebenMax;
	}

	public static int getKraft() {
		return kraft;
	}

	public static void setKraft(int kraft) {
		Held.kraft = kraft;
	}

	public static int getArmor() {
		return armor;
	}

	public static void setArmor(int armor) {
		Held.armor = armor;
	}

	public static int getPosX() {
		return posX;
	}

	public static void setPosX(int posX) {
		Held.posX = posX;
	}

	public static int getPosY() {
		return posY;
	}

	public static void setPosY(int posY) {
		Held.posY = posY;
	}

	public static boolean isHasSight() {
		return hasSight;
	}

	public static void setHasSight(boolean hasSight) {
		Held.hasSight = hasSight;
	}

	public static boolean isAlive() {
		return isAlive;
	}

	public static void setAlive(boolean isAlive) {
		Held.isAlive = isAlive;
	}

	public static ArrayList<Item> getInventar() {
		return inventar;
	}

	public static void setInventar(ArrayList<Item> inventar) {
		Held.inventar = inventar;
	}
	
	
	
}
