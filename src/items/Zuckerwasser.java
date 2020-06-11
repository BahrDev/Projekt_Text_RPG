package items;

import game.Held;
import game.Texte;

public class Zuckerwasser extends Item{
	
	public Zuckerwasser() {
		super();
		this.setItemID(8);
		this.setName(Texte.itemName8);
		this.setBeschreibung(Texte.itemBeschreibung8);
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
		System.out.println(this.getBeschreibung());
	}


	@Override
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
	

}
