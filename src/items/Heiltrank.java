package items;
import game.*;

public class Heiltrank extends Item{
	
	private int heilBonus = 1;
	
	public Heiltrank() {
		super();
		this.setItemID(2);
		this.setName(Texte.itemName2);
		this.setBeschreibung(Texte.itemBeschreibung2);
		this.setWeight(1);
		this.setVerbrauchsItem(true);
	}
	
	
	@Override
	public void use(String befehl) {
		super.use(befehl);
		if(Held.getLeben() < Held.getLebenMax()) {
			this.useEffect();
			Held.getInventar().remove(this);
		}else {
			System.out.println(Texte.item2FullHealth);
		}
	}

	@Override
	public void useEffect() {
		super.useEffect();
		Held.heilung(this.heilBonus);
	}



	@Override
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	
	
	
}
