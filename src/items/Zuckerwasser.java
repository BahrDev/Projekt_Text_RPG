package items;

import game.Held;

public class Zuckerwasser extends Item{
	
	public Zuckerwasser() {
		super();
		this.setItemID(8);
		this.setName("Flasche");
		this.setBeschreibung("Mhhh, lecker Zuckerwasser.");
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
