
public class Heiltrank extends Item implements Cloneable{
	
	public Heiltrank(int itemID, String name, String beschreibung, int weight) {
		super(itemID = 2, name = "Heiltrank", "Verweis Einfügen!", weight = 1);
		this.setVerbrauchsItem(true);
	}
	
	public Heiltrank() {
		super();
		this.setItemID(2);
		this.setName("Heiltrank");
		this.setBeschreibung("Verweiß bitte hier einfügen!");
		this.setWeight(1);
		this.setVerbrauchsItem(true);
	}
	

	@Override
	public void Use(String befehl) {
		super.Use(befehl);
		if(Held.leben < Held.lebenMax) {
			this.UseEffect();
			Held.inventar.remove(this);
		}else {
			System.out.println("Du bist bereits bei voller Gesundheit.");
		}
				
		
	}

	@Override
	public void UseEffect() {
		super.UseEffect();
		Held.Heilung(1);
	}


	@Override
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	
	
	
}
