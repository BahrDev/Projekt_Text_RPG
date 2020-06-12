package events;
import game.Held;
import game.Spiel;
import game.Texte;
import items.*;

public class evt_Pfeilfalle extends Item implements Cloneable, Event{

	private boolean depleted = false;
	private int schaden = 1;

	public evt_Pfeilfalle() {
		super();
		this.setItemID(22);
		this.setName(Texte.eventName22);
		this.setBeschreibung(Texte.eventBeschreibung22);
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
			Held.schaden(this.schaden);
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
