package items;

import game.*;

public class Kompass extends Item{
	
	public Kompass() {
		super();
		this.setItemID(5);
		this.setName(Texte.itemName5);
		this.setBeschreibung(Texte.itemBeschreibung5);
		this.setWeight(1);
	}

	@Override
	public void use(String befehl) {
		super.use(befehl);
		if (Held.isHasSight()) {
			this.useEffect();
		}else {
			System.out.println(Texte.item5ToDark);
		}
	}

	@Override
	public void useEffect() {
		super.useEffect();
		System.out.println(Texte.item5Use + ": x=" + Held.getPosX() + " y=" + Held.getPosY());
	}

	
	
	
	
	
	
	
}
