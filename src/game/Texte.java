package game;
import java.util.*;
public class Texte {
	
	
	
	
	public static ArrayList<String> itemNamen = new ArrayList<String>( 
            Arrays.asList(
            		"Platzhalter",
            		"Schlüssel", 
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
            		"Ein Schlüssel aus kalt geschmiedetem Eisen. Er öffnet gewöhnliche Türen.", 
                    "Ein kleines Glasfläschchen mit einer rot leuchtenden Flüssigkeit.", 
                    "Ein großer Schild aus Stahl der die meisten Angriffe abwehrt. Du musst ihn nur tragen, nicht benutzen.",
                    "Ein erstaunliche Menge an Flusen, verfilzt und staubig.",
                    "Ein kleiner Kompass aus Messing, mit ihm kannst du dich orientieren.",
                    "Eine Öl-Lampe, sie bringt Licht ins dunkle.",
                    "Plötzlich schießen Pfeile aus kleinen Löchern in den Wänden und durchbohren dich."
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
										+ "\nDeine Gliedmaßen tun dir weh. "
										+ "\nDu weist nicht wo du bist. "
										+ "\nDu liegst in einer Säule aus Licht."
										+ "\nEs scheint aus einem Loch in der Decke zu kommen."
										+ "\nGroß genug, als das du hättest hindurch fallen können."
										+ "\nAußerhalb des Kegels aus Licht ist nur finsterste Dunkelheit."
										+ "\nZu deinem Füßen liegen Trümmer von Ziegelsteinen und eine alte Öl-Lampe."
										+ "\nZeit einen Weg hier raus zu finden."
										+ "\nWas möchtest du tun?";
	
	public static String deathMessage = "Du erliegst deinen Wunden, deine Leiche wird auf Jahrhunderte hinaus in diesem Kerker verrotten.\nGame Over";
	
	
	
	
	
	//System.out.println("Du bist überladen und kannst dies nicht noch zusätzlich tragen.");
}
