package items;

import game.Held;

public class KraftTrank extends Item{

	public KraftTrank() {
		super();
		this.setItemID(9);
		this.setName("KraftTrank");
		this.setBeschreibung("Verweiß bitte hier einfügen!");
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
			System.out.println("Du bist bereits bei voller Gesundheit.");
		}
				
		
	}

	@Override
	public void useEffect() {
		super.useEffect();
		Held.heilung(1);
	}


	@Override
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
	
}
