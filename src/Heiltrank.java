
public class Heiltrank extends Item{

	public Heiltrank(int itemID, String name, String beschreibung, int weight) {
		super(itemID, name, beschreibung, weight);
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

	
	
	
	
	
}
