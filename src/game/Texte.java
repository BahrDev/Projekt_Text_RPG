package game;
import java.util.*;
public class Texte {
	
	
	
	
	public static ArrayList<String> itemNamen = new ArrayList<String>( 
            Arrays.asList(
            		"Platzhalter",
            		"Schl�ssel", 
                    "Heiltrank", 
                    "Schild",
                    "Flusen",
                    "Kompass",
                    "Lampe",
                    "evt_Pfeilfalle"
            		)); 
	
	public static ArrayList<String> itemBeschreibung = new ArrayList<String>( 
            Arrays.asList(
            		"Platzhalter",
            		"Ein Schl�ssel aus kalt geschmiedetem Eisen. Er �ffnet gew�hnliche T�ren.", 
                    "Ein kleines Glasfl�schchen mit einer rot leuchtenden Fl�ssigkeit.", 
                    "Ein gro�er Schild aus Stahl der die meisten Angriffe abwehrt. Du musst ihn nur tragen, nicht benutzen.",
                    "Ein erstaunliche Menge an Flusen, verfilzt und staubig.",
                    "Ein kleiner Kompass aus Messing, mit ihm kannst du dich orientieren.",
                    "Eine �l-Lampe, sie bringt Licht ins dunkle.",
                    "Pl�tzlich schie�en Pfeile aus kleinen L�chern in den W�nden und durchbohren dich."
            		));
	
	public static ArrayList<Integer> itemGewichte = new ArrayList<Integer>( 
            Arrays.asList(
            		0,
            		1,
            		1,
            		5,
            		0,
            		1,
            		3,
            		0
            		));

	
	
	
	
	
	
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
	
	
	
	
	
	//System.out.println("Du bist �berladen und kannst dies nicht noch zus�tzlich tragen.");
}
