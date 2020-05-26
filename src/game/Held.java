package game;
import java.util.ArrayList;

import items.*;

public class Held {
	private static int leben = 3;
	private static int lebenMax = 5;
	private static int kraft = 5;
	private static int armor = 0;
	private static int posX;
	private static int posY;
	private static boolean hasSight = true;		// Default: false
	private static boolean isAlive = true;
	private static ArrayList<Item> inventar = new ArrayList<Item>();
	

	
	
	
	public static boolean CheckIfItemFitsInventory(int GewichtItem) {
		if ((Held.InventoryWeight() + GewichtItem) > Held.kraft) {
			return false;
		}else {
			return true;
		}
			
	}
	
	public static void ZeigeGewicht() {
		System.out.println("Belastung: " + Held.InventoryWeight() + "/" + kraft);
	}
	
	public static int InventoryWeight() {
		int weight = 0;
		for (int i = 0; i < inventar.size(); i++) {
			weight += Held.inventar.get(i).getWeight();
		}
		return weight;
	}
	
	public static void ZeigeInventar() {
		String ausgabe = "Dein Inventar besteht aus diesen Items: \n";
		for (int i = 0; i < inventar.size(); i++) {
			ausgabe+= "- " + Held.inventar.get(i).getName() + "\n";
		}
		System.out.println(ausgabe);
	}
	
	public static boolean CheckInventoryForItem(String itemName) {
		boolean ausgabe = false;
		for (int i = 0; i < Held.inventar.size(); i++) {
			if (Held.inventar.get(i).getName() == itemName) {
				ausgabe = true;
			}
		}
		return ausgabe;
	}
		
	public static void ZeigeLeben() {
		System.out.println("Leben: " + leben + "/" + lebenMax);
	}
	
	public static void Heilung(int x) {
		if (leben < lebenMax) {
			leben += x;
			System.out.println("Du wurdest um " + x + " Leben geheilt.");
			//Held.ZeigeInventar();
		}else {
			System.out.println("Du spürst keine Veränderung.");
		}
		
		
		
	}
	
	public static void Schaden(int x) {
		leben -= x;
		System.out.println("Du hast " + x + " Schaden bekommen.");
		if (Held.CheckIfDead()) {
			Held.isAlive = false;
		}else {
			Held.ZeigeLeben();
		}
	}
	
	public static boolean CheckIfDead() {
		if (leben <=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void KraftRauf(int x) {
		kraft += x;
		System.out.println("Du fühlst dich stärker.");
	}

	
	
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
	
//	public static void KraftRunter(int x) {
//		kraft -= x;
//		System.out.println("Du fühlst dich schwächer.");
//	}
	
	
	
}
