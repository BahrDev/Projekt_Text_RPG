package items;
import game.*;

public class Heiltrank extends Item{
	
	private int kraftBonus = 5;
	
	public Heiltrank() {
		super();
		this.setItemID(9);
		this.setName("Heiltrank");
		this.setBeschreibung("Verwei� bitte hier einf�gen!");
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
	}


	@Override
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	
	
	
}
