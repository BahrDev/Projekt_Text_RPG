package events;

import game.Spiel;
import game.Texte;
import items.Item;

public class evt_Finale extends Item implements Event {
	
	public evt_Finale() {
		super();
		this.setItemID(20);
		this.setName(Texte.eventName20);
		this.setBeschreibung(Texte.eventBeschreibung20);
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
		System.out.println(this.getBeschreibung());
		System.out.println(Texte.credits);
		Spiel.exit("FORCED");
	}

	@Override
	public void leaveEffect() {
		Spiel.setEventItem(null);
	}

	@Override
	public boolean triggerEffect(String befehl) {
		return false;
	}

}
