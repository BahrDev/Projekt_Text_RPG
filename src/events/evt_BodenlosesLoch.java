package events;

import game.Held;
import game.Spiel;
import items.Item;

public class evt_BodenlosesLoch extends Item implements Event{

	private String trigger = "GEHE";
	
	public evt_BodenlosesLoch() {
		super();
		this.setItemID(55);
		this.setName("evt_BodenlosesLoch");
		this.setBeschreibung("Verweiß bitte hier einfügen!");
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
		if (befehl.contains(trigger)) {
			System.out.println(this.getBeschreibung());
			Held.setAlive(false);
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
}
