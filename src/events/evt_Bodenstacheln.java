package events;
import items.*;
import game.*;

public class evt_Bodenstacheln extends Item implements Event{

	private String trigger = "GEHE";
	private boolean depleted = false;
	
	public evt_Bodenstacheln() {
		super();
		this.setItemID(51);
		this.setName("evt_Bodenstacheln");
		this.setBeschreibung("Verweiß bitte hier einfügen!");
		this.setEventItem(true);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public void Use(String trigger) {
		super.Use(trigger);
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
		}
	}

	@Override
	public void leaveEffect() {
		Spiel.setEventItem(null);
	}

	@Override
	public boolean triggerEffect(String befehl) {
		if (befehl.contains(trigger)) {
			System.out.println(this.getBeschreibung());
			Held.Schaden(1);
			this.depleted = true;
			Spiel.setEventItem(null);
			return true;
		}else {
			return false;
		}
	}
	
	
}
