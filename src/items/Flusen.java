package items;

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
	public void use(String befehl) {
		super.use(befehl);
		this.useEffect();
	}

	@Override
	public void useEffect() {
		super.useEffect();
		System.out.println("Die sind zu nicht zu gebrauchen.");
	}
	
	

}
