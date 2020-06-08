package events;
import game.Held;
import game.Spiel;
import items.Heiltrank;
import items.Item;
import items.Zuckerwasser;

public class evt_TrankPuzzle extends Item implements Event{
	
	private String richtigeAntwort = "amethyst";
	private String falscheAntwort1 = "rubin";
	private String falscheAntwort2 = "smaragd";
	private String falscheAntwort3 = "bernstein";
	private String falscheAntwort4 = "saphir";
	
	private String endText = "Du nimmst die Flasche vom Podest.\n"
			+ "In einer Stichflamme entz�nden sich die anderen Flaschen.\n"
			+ "Zur�ck bleiben nur kleine H�ufchen an feiner grauer Asche.";
	
	private boolean depleted = false;
	
	private Item TrankPuzzleBelohnung = new Heiltrank();
	private Item TrankPuzzleVersagen = new Zuckerwasser();
	
	public evt_TrankPuzzle() {
		super();
		this.setItemID(26);
		this.setName("evt_TrankPuzzle");
		this.setBeschreibung("In der Mitte des Raumes stehen f�nf kleine S�ulen, beleuchtet von einer nicht auszumachenden Lichtquelle.\n" + 
				"Auf jeder dieser etwa armdicken S�ulen stehen Fl�schchen die Fl�ssigkeiten unterschiedlicher Farbe enthalten.\n" + 
				"Als du dich n�herst ert�nt eine glockenhelle Stimme:\n" + 
				"\"Der Trank den du suchst ist eine Mixtur aus zwei seiner Br�der.\n" + 
				"W�hle weise!\"\n" + 
				"Welchen Trank willst du von seinem Podest nehmen?\n" + 
				"- den Rubin-farbenen Trank\n" + 
				"- den Smaragdfarbenen Trank\n" + 
				"- den Ametystfarbenen Trank\n" + 
				"- den Bernsteinfarbenen Trank\n" + 
				"- den Saphirfarbenen Trank");
		this.setEventItem(true);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public void use(String trigger) {
		super.use(trigger);
		if (trigger == "Enter") {
			this.enterEffect();
		}else if (trigger == "Leave") {
			this.leaveEffect();
		}else {
			this.triggerEffect(trigger);
		}
	}
	
	@Override
	public void enterEffect() {
		if (this.depleted == false) {
			Spiel.setEventItem(this);
			System.out.println(this.getBeschreibung());
		}
	}

	@Override
	public void leaveEffect() {
		Spiel.setEventItem(null);
	}

	@Override
	public boolean triggerEffect(String befehl) {
		if (befehl.contains(this.richtigeAntwort.toUpperCase())) {
			if (Held.checkIfItemFitsInventory(TrankPuzzleBelohnung.getWeight())) {
				Held.getInventar().add(TrankPuzzleBelohnung);
			}else {
				System.out.println("Die Flasche ist zu sperrig um damit komfortabel reisen zu k�nnen.\n"
						+ "Du stellst sie vorsichtig auf dem Boden ab.");
				Spiel.getMap()[Held.getPosX()][Held.getPosY()].addItemToRoom(TrankPuzzleBelohnung);
			}
			System.out.println(this.endText);
			this.depleted = true;
			Spiel.setEventItem(null);
			return true;
		}else if (befehl.contains(this.falscheAntwort1.toUpperCase()) || 
				befehl.contains(this.falscheAntwort2.toUpperCase()) || 
				befehl.contains(this.falscheAntwort3.toUpperCase()) ||
				befehl.contains(this.falscheAntwort4.toUpperCase())) {
			if (Held.checkIfItemFitsInventory(TrankPuzzleVersagen.getWeight())) {
				Held.getInventar().add(TrankPuzzleVersagen);
			}else {
				System.out.println("Die Flasche ist zu sperrig um damit komfortabel reisen zu k�nnen.\n"
						+ "Du stellst sie vorsichtig auf dem Boden ab.");
				Spiel.getMap()[Held.getPosX()][Held.getPosY()].addItemToRoom(TrankPuzzleVersagen);
			}
			System.out.println(this.endText);
			this.depleted = true;
			Spiel.setEventItem(null);
			return true;
			
		}else {
			return false;
		}
	}
	
	
	
	
	
	

}
