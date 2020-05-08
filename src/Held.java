import java.util.ArrayList;

public class Held {
	static int leben = 5;
	static int lebenMax = 5;
	static int kraft = 5;
	static int posX;
	static int posY;
	static boolean hasSight = false;		// Default: false
	static boolean isAlive = true;
	static ArrayList<Item> inventar = new ArrayList<Item>();
	

	
	
	
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
		String ausgabe = "Dein Inventar besteht aus diesen Items: ";
		for (int i = 0; i < inventar.size(); i++) {
			ausgabe+= Held.inventar.get(i).getName() + " ";
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
			Held.ZeigeInventar();
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
	
//	public static void KraftRunter(int x) {
//		kraft -= x;
//		System.out.println("Du fühlst dich schwächer.");
//	}
	
	
	
}
