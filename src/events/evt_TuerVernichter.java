package events;

import game.Held;
import game.Spiel;
import game.Texte;
import items.Item;

public class evt_TuerVernichter extends Item implements Event{

	private boolean depleted = false;
	private String itemToTrigger = Texte.itemName6;		// Lampe
	
	public evt_TuerVernichter() {
		super();
		this.setItemID(24);
		this.setName(Texte.eventName24);
		this.setBeschreibung(Texte.eventBeschreibung24);
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
		if(this.depleted == false) {
			System.out.println(this.getBeschreibung());
			Spiel.getLastDoorUsed().setDestroyed(true);
			for (int i = 0; i < Held.getInventar().size(); i++) {
				if (Held.getInventar().get(i).getName() == itemToTrigger) {
					Held.getInventar().get(i).useFromExternal();
				}
			}
			this.depleted = true;
		}
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
