package events;

import game.Held;
import game.Spiel;
import game.Texte;
import items.Arkankubus;
import items.Item;

public class evt_SphinxPuzzle extends Item implements Event{
	
	private String richtigeAntwort = Texte.event29RichtigeAntwort;
	private String endText = Texte.event29EndText;
	private String fehlerText = Texte.event29FehlerText;
	private String[] saveWords = Texte.event29SaveWords;
	
	private boolean depleted = false;
	
	private Item SphinxPuzzleBelohnung = new Arkankubus();
	
	public evt_SphinxPuzzle() {
		super();
		this.setItemID(29);
		this.setName(Texte.eventName29);
		this.setBeschreibung(Texte.eventBeschreibung29);
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
		if(this.depleted == false) {
			if (befehl.contains(this.richtigeAntwort.toUpperCase())) {
				System.out.println(this.endText);
				Spiel.getMap()[Held.getPosX()][Held.getPosY()].addItemToRoom(SphinxPuzzleBelohnung);
				this.depleted = true;
				return true;
			}else if(saveWordTest(befehl)) {
				return false;
			}else {
				System.out.println(this.fehlerText);
				Held.setAlive(false);
				return true;
			}	
		}else {
			return false;
		}
	}
	
	public boolean saveWordTest(String befehl) {
		boolean ret = false;
		for (int i = 0; i < saveWords.length; i++) {
			if (befehl.contains(this.saveWords[i])) {
				ret = true;
			}
		}
		return ret;
	}

}
