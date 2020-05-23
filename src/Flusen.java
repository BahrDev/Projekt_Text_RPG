
public class Flusen extends Item{
	
	

	public Flusen(int itemID, String name, String beschreibung, int weight) {
		super(itemID, name, beschreibung, weight);
	}
	
	public Flusen() {
		super();
		this.setItemID(4);
		this.setName("Flusen");
		this.setBeschreibung("Verweiß bitte hier einfügen!");
		this.setWeight(0);
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
