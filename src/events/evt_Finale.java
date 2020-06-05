package events;

import game.Spiel;
import items.Item;

public class evt_Finale extends Item implements Event {
	
	public evt_Finale() {
		super();
		this.setItemID(50);
		this.setName("evt_Finale");
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
		System.out.println("Spiel-Ende-Text-Verweis hier einfügen");
		Spiel.closeScan();
		System.out.println("Credits hier abspielen lassen");
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
