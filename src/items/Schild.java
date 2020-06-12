package items;
import game.*;

public class Schild extends Item{
	
	private boolean isEquiped = false;
	private int armor = 1;
	
	public Schild() {
		super();
		this.setItemID(3);
		this.setName(Texte.itemName3);
		this.setBeschreibung(Texte.itemBeschreibung3);
		this.setWeight(2);
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
		if (this.isEquiped) {
			Held.setArmor(-armor);
			this.isEquiped = false;
		}
		System.out.println(Texte.item3Drop);
	}

	@Override
	public void useEffect() {
		super.useEffect();
		if (this.isEquiped) {
			Held.setArmor(-armor);
			this.isEquiped = false;
			System.out.println(Texte.item3DeEquip);
		}else {
			Held.setArmor(+armor);
			this.isEquiped = true;
			System.out.println(Texte.item3Equip);
		}
	}


}
