package game;

public class Texte {
	
	public static String[][] raumTexte = new String[6][6];
	
	// -------------------- Schl�sselw�rter Eingabe --------------------
	
	
	
	
	
	// -------------------- Spielmechanik-Texte --------------------
	
	
	
	
	// -------------------- R�ume --------------------

	public static void addRaumTexte() {	
		raumTexte[1][1] = "";
		raumTexte[2][1] = "";
		raumTexte[3][1] = "";
		raumTexte[4][1] = "";
		
		raumTexte[1][2] = "";
		raumTexte[2][2] = "";
		raumTexte[3][2] = "";
		raumTexte[4][2] = "";
		
		raumTexte[1][3] = "";
		raumTexte[2][3] = "";
		raumTexte[3][3] = "";
		raumTexte[4][3] = "";
		
		raumTexte[1][4] = "";
		raumTexte[2][4] = "";
		raumTexte[3][5] = "";
		raumTexte[4][5] = "";
		
		raumTexte[5][2] = "";	
	}
		
	// -------------------- Items --------------------
	
	//itemID: 0
	public static String itemName0 = "Muster";
	public static String itemBeschreibung0 = "Muster";
	
	//itemID: 1
	public static String itemName1 = "Schl�ssel";
	public static String itemBeschreibung1 = "";
	
	//itemID: 2
	public static String itemName2 = "Heiltrank";
	public static String itemBeschreibung2 = "";
		
	//itemID: 3
	public static String itemName3 = "Schild";
	public static String itemBeschreibung3 = "";
	
	//itemID: 4
	public static String itemName4 = "Flusen";
	public static String itemBeschreibung4 = "Die sind zu nicht zu gebrauchen.";
	
	//itemID: 5
	public static String itemName5 = "Kompass";
	public static String itemBeschreibung5 = "";
	
	//itemID: 6
	public static String itemName6 = "Lampe";
	public static String itemBeschreibung6 = "";
	
	//itemID: 7
	public static String itemName7 = "Arkankubus";
	public static String itemBeschreibung7 = "";
	
	//itemID: 8
	public static String itemName8 = "Zuckerwasser";
	public static String itemBeschreibung8 = "";
	
	//itemID: 8
	public static String itemName9 = "Krafttrank";
	public static String itemBeschreibung9 = "";
	
	// -------------------- Events --------------------
	
	
	
	
	public static String startMessage = "Du erwachst. "
										+ "\nDeine Gliedma�en tun dir weh. "
										+ "\nDu weist nicht wo du bist. "
										+ "\nDu liegst in einer S�ule aus Licht."
										+ "\nEs scheint aus einem Loch in der Decke zu kommen."
										+ "\nGro� genug, als das du h�ttest hindurch fallen k�nnen."
										+ "\nAu�erhalb des Kegels aus Licht ist nur finsterste Dunkelheit."
										+ "\nZu deinem F��en liegen Tr�mmer von Ziegelsteinen und eine alte �l-Lampe."
										+ "\nZeit einen Weg hier raus zu finden."
										+ "\nWas m�chtest du tun?";
	
	public static String deathMessage = "Du erliegst deinen Wunden, deine Leiche wird auf Jahrhunderte hinaus in diesem Kerker verrotten.\nGame Over";

	
	

	
	
	
	
	
	
}
