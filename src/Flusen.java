
public class Flusen extends Item{
	
	

	public Flusen(int itemID, String name, String beschreibung, int weight) {
		super(itemID, name, beschreibung, weight);
	}

	@Override
	public void Use(String befehl) {
		super.Use(befehl);
		this.UseEffect();
	}

	@Override
	public void UseEffect() {
		super.UseEffect();
		System.out.println("Die sind zu nicht zu gebrauchen.");
	}
	
	

}
