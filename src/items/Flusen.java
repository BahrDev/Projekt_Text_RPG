package items;

import game.Texte;

public class Flusen extends Item{
	
	public Flusen() {
		super();
		this.setItemID(4);
		this.setName(Texte.itemName4);
		this.setBeschreibung(Texte.itemBeschreibung4);
		this.setWeight(0);
	}

	@Override
	public void use(String befehl) {
		super.use(befehl);
		this.useEffect();
	}

	@Override
	public void useEffect() {
		super.useEffect();
		System.out.println(this.getBeschreibung());
	}
	
	

}
