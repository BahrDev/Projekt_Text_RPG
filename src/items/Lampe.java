package items;
import game.*;

public class Lampe extends Item{

	private boolean isOn = false;
	
	public Lampe() {
		super();
		this.setItemID(6);
		this.setName(Texte.itemName6);
		this.setBeschreibung(Texte.itemBeschreibung6);
		this.setWeight(1);
		this.setDropEffekt(true);
	}

	@Override
	public void use(String befehl) {
		super.use(befehl);
		this.useEffect();
	}

	@Override
	public void dropEffect() {
		super.dropEffect();
		this.isOn = false;
		Held.setHasSight(false);
		System.out.println(Texte.item6DropEffect);
	}

	@Override
	public void useEffect() {
		super.useEffect();
		if (this.isOn) {
			System.out.println(Texte.item6UseOff);
			Held.setHasSight(false);
			this.isOn = false;
		}else {
			Held.setHasSight(true);
			System.out.println(Texte.item6UseOn);
			this.isOn = true;
		}		
	}
	
	@Override
	public void useFromExternal() {
		if (this.isOn) {
			System.out.println(Texte.item6ExtOff);
			Held.setHasSight(false);
			this.isOn = false;
		}else {
			Held.setHasSight(true);
			System.out.println(Texte.item6ExtOn);
			this.isOn = true;
		}	
	}

}
