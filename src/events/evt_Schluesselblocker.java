package events;

import game.Spiel;
import game.Texte;
import items.Item;

public class evt_Schluesselblocker extends Item implements Event {

	private String trigger1 = Texte.event23Trigger1;
	private String trigger2 = Texte.event23Trigger2;
	
	public evt_Schluesselblocker() {
		super();
		this.setItemID(23);
		this.setName(Texte.eventName23);
		this.setBeschreibung(Texte.eventBeschreibung23);
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
		if (befehl.contains(trigger1.toUpperCase()) || befehl.contains(trigger2.toUpperCase())) {
			System.out.println(this.getBeschreibung());
			return true;
		}else {
			return false;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
