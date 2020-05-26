package events;
import items.*;

public class evt_Pfeilfalle extends Item implements Cloneable, Event{


	public evt_Pfeilfalle() {
		super();
		this.setItemID(50);
		this.setName("evt_Pfeilfalle");
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
		System.out.println("Pfeilfalle erfolgreich ausgeführt");
		
	}



	@Override
	public void leaveEffect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean triggerEffect(String befehl) {
		return false;
	}


	
	
	
	
	
	
	
	
	
	
}
