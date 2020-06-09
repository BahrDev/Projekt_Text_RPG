package events;

import game.Held;
import game.Spiel;
import items.Heiltrank;
import items.Item;

public class evt_Altar extends Item implements Event{
	
	private String trigger1 = "lege";
	private String trigger2	= "alle";
	private String trigger3	= "Altar";
	private String triggerItem = "Flusen";
	private int triggerItemAnzahl = 4;
	
	private String endText = "";
	
	private boolean depleted = false;
	
	private Item TrankPuzzleBelohnung = new Heiltrank();
	
	public evt_Altar() {
		super();
		this.setItemID(30);
		this.setName("evt_Altar");
		this.setBeschreibung("");
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
		if (this.depleted == false) {
			Spiel.setEventItem(this);
			//System.out.println(this.getBeschreibung());
		}
	}

	@Override
	public void leaveEffect() {
		Spiel.setEventItem(null);
	}

	@Override
	public boolean triggerEffect(String befehl) {
		
		if (befehl.contains(trigger1.toUpperCase()) &&
				befehl.contains(trigger2.toUpperCase()) &&
				befehl.contains(triggerItem.toUpperCase()) &&
				befehl.contains(trigger3.toUpperCase()) &&
				this.inventarCheck() == triggerItemAnzahl) {
			System.out.println(this.endText);
			Spiel.getMap()[Held.getPosX()][Held.getPosY()].addItemToRoom(TrankPuzzleBelohnung);
			this.depleted = true;
			return true;
		}else {
			return false;
		}
	}
	
	public int inventarCheck() {
		int count = 0;
		for (int i = 0; i < Held.getInventar().size(); i++) {
			if (Held.getInventar().get(i).getName() == triggerItem) {
				count++;
			}
		}
		return count;
	}
	
}
