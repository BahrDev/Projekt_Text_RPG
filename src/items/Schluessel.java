package items;
import game.*;

public class Schluessel extends Item{

	
	public Schluessel() {
		super();
		this.setItemID(1);
		this.setName(Texte.itemName1);
		this.setBeschreibung(Texte.itemBeschreibung1);
		this.setWeight(1);
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
			System.out.println(Texte.item1WhichDoor);
		}
	}

	@Override
	public void dropEffect() {
		super.dropEffect();
	}

	public void UseEffect(int zielraumX, int zielraumY) {
		if(Spiel.tuerTargetter(Held.getPosX() + zielraumX, Held.getPosY() + zielraumY).isSimpleLocked()) {
			Spiel.tuerTargetter(Held.getPosX() + zielraumX, Held.getPosY() + zielraumY).setSimpleLocked(false);
			System.out.println(Texte.item1Success);
			Held.getInventar().remove(this);
		}else {
			System.out.println(Texte.item1NotLocked);
		}
	}

	
	@Override
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	
	
	
	

	
	
	
	
	
}
