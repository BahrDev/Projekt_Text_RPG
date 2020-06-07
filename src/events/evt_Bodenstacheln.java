package events;
import items.*;
import game.*;

public class evt_Bodenstacheln extends Item implements Event{

	private String trigger = "GEHE";
	private String saveTrigger = "SCHWARZ";
	private int schaden = 1;
	
	public evt_Bodenstacheln() {
		super();
		this.setItemID(21);
		this.setName("evt_Bodenstacheln");
		this.setBeschreibung("Verweiß auf Sekundär-Beschreibung einfügen");
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
		if (befehl.contains(trigger) && !befehl.contains(saveTrigger)) {
			System.out.println(this.getBeschreibung());
			Held.schaden(this.schaden);
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
