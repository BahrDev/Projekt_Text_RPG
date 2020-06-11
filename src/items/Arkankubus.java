package items;

import game.Held;
import game.Spiel;
import game.Texte;

public class Arkankubus extends Item{
	
	public Arkankubus() {
		super();
		this.setItemID(7);
		this.setName(Texte.itemName7);
		this.setBeschreibung(Texte.itemBeschreibung7);
		this.setWeight(2);
		this.setVerbrauchsItem(true);
	}

	@Override
	public void use(String befehl) {
		super.use(befehl);
		if (befehl.toUpperCase().contains(Texte.keyWordWest)) {
			this.UseEffect(-1, 0);
		}else if (befehl.toUpperCase().contains(Texte.keyWordEast)) {
			this.UseEffect(1, 0);
		}else if (befehl.toUpperCase().contains(Texte.keyWordNorth)) {
			this.UseEffect(0, -1);
		}else if (befehl.toUpperCase().contains(Texte.keyWordSouth)) {
			this.UseEffect(0, 1);
		}else {
			System.out.println(Texte.item7WhichDoor);
		}
	}

	@Override
	public void dropEffect() {
		super.dropEffect();
	}

	public void UseEffect(int zielraumX, int zielraumY) {
		if(Spiel.tuerTargetter(Held.getPosX() + zielraumX, Held.getPosY() + zielraumY).isMasterLocked()) {
			Spiel.tuerTargetter(Held.getPosX() + zielraumX, Held.getPosY() + zielraumY).setMasterLocked(false);
			System.out.println(Texte.item7Success);
			Held.getInventar().remove(this);
		}else {
			System.out.println(Texte.item7NotLocked);
		}
	}

	
	@Override
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
	
	

}
