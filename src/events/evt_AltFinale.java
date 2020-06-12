package events;

import game.Held;
import game.Spiel;
import game.Texte;
import items.Item;

public class evt_AltFinale extends Item implements Event{

	private String trigger = Texte.event31Trigger;
	
	public evt_AltFinale() {
		super();
		this.setItemID(31);
		this.setName(Texte.eventName31);
		this.setBeschreibung(Texte.eventBeschreibung31);
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
		if (Held.getKraft() == 10 && 
			befehl.contains(trigger.toUpperCase())) {
			System.out.println(this.getBeschreibung());
			System.out.println(Texte.credits);
			Spiel.exit("FORCED");
			return true;
		}else {
			return false;
		}
	}
	
}
