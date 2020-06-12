package items;

import game.Held;
import game.Texte;

public class KraftTrank extends Item{

	private int kraftBonus = 5;
	
	public KraftTrank() {
		super();
		this.setItemID(9);
		this.setName(Texte.itemName9);
		this.setBeschreibung(Texte.itemBeschreibung9);
		this.setWeight(1);
		this.setVerbrauchsItem(true);
	}
	

	@Override
	public void use(String befehl) {
		super.use(befehl);
		this.useEffect();
		Held.getInventar().remove(this);
	}

	@Override
	public void useEffect() {
		super.useEffect();
		Held.setKraft(Held.getKraft() + kraftBonus);
		System.out.println(Texte.item9Use);
	}


	@Override
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
	
}
