package events;

import game.Held;
import game.Spiel;
import game.Texte;
import items.Item;
import items.KraftTrank;

public class evt_Altar extends Item implements Event{
	
	private String trigger1 = Texte.event30Trigger1;
	private String trigger2	= Texte.event30Trigger1;
	private String trigger3	= Texte.event30Trigger3;
	private String triggerItem = Texte.itemName4;		//Flusen
	private int triggerItemAnzahl = 4;
	
	private String endText = Texte.event30EndText;
	
	private boolean depleted = false;
	
	private Item TrankPuzzleBelohnung = new KraftTrank();
	
	public evt_Altar() {
		super();
		this.setItemID(30);
		this.setName(Texte.eventName30);
		this.setBeschreibung(Texte.eventBeschreibung30);
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
			this.removeFlusen();
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
	
	public void removeFlusen() {
		for (int i = 0; i < Held.getInventar().size(); i++) {
			if (Held.getInventar().get(i).getName() == triggerItem) {
				Held.getInventar().remove(i);
			}
		}
	}
	
}
