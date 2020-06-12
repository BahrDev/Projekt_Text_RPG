package events;
import game.Held;
import game.Spiel;
import game.Texte;
import items.Heiltrank;
import items.Item;
import items.Zuckerwasser;

public class evt_TrankPuzzle extends Item implements Event{
	
	private String richtigeAntwort = Texte.event26RichtigeAntwort;
	private String falscheAntwort1 = Texte.event26FalscheAntwort1;
	private String falscheAntwort2 = Texte.event26FalscheAntwort2;
	private String falscheAntwort3 = Texte.event26FalscheAntwort3;
	private String falscheAntwort4 = Texte.event26FalscheAntwort4;
	
	private String endText = Texte.event26EndText;
	
	private String toHeavyText = Texte.event26ToHeavyText;
	
	private boolean depleted = false;
	
	private Item TrankPuzzleBelohnung = new Heiltrank();
	private Item TrankPuzzleVersagen = new Zuckerwasser();
	
	public evt_TrankPuzzle() {
		super();
		this.setItemID(26);
		this.setName(Texte.eventName26);
		this.setBeschreibung(Texte.eventBeschreibung26);
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
				System.out.println(this.toHeavyText);
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
				System.out.println(this.toHeavyText);
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
