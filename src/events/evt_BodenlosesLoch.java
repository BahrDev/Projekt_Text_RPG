package events;

import game.Held;
import game.Spiel;
import game.Texte;
import items.Item;

public class evt_BodenlosesLoch extends Item implements Event{

	private String trigger = Texte.keyWordgo;
	
	public evt_BodenlosesLoch() {
		super();
		this.setItemID(25);
		this.setName(Texte.eventName25);
		this.setBeschreibung(Texte.eventBeschreibung25);
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
		Spiel.setEventItem(this);
	}

	@Override
	public void leaveEffect() {
		Spiel.setEventItem(null);
	}

	@Override
	public boolean triggerEffect(String befehl) {
		if (Held.isHasSight() == false) {
			if (befehl.contains(trigger)) {
				System.out.println(this.getBeschreibung());
				Held.setAlive(false);
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
}
