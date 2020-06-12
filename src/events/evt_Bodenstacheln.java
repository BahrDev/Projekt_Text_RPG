package events;
import items.*;
import game.*;

public class evt_Bodenstacheln extends Item implements Event{

	private String trigger = Texte.keyWordgo;
	private String saveTrigger = Texte.event21SaveWord;
	private int schaden = 1;
	
	public evt_Bodenstacheln() {
		super();
		this.setItemID(21);
		this.setName(Texte.eventName21);
		this.setBeschreibung(Texte.eventBeschreibung21);
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
		if (befehl.contains(trigger) && !befehl.contains(saveTrigger.toUpperCase())) {
			System.out.println(this.getBeschreibung());
			Held.schaden(this.schaden);
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
