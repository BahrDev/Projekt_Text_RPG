
public class Kompass extends Item{

	public Kompass(int itemID, String name, String beschreibung, int weight) {
		super(itemID, name, beschreibung, weight);
	}
	
	public Kompass() {
		super();
		this.setItemID(5);
		this.setName("Kompass");
		this.setBeschreibung("Verweiß bitte hier einfügen!");
		this.setWeight(1);
	}

	@Override
	public void Use(String befehl) {
		super.Use(befehl);
		if (Held.hasSight) {
			this.UseEffect();
		}else {
			System.out.println("Es ist zu dunkel um zu erkennen was dein Kompass anzeigt.");
		}
	}

	@Override
	public void UseEffect() {
		super.UseEffect();
		System.out.println("Deine Koordinaten: x=" + Held.posX + " y=" + Held.posY);
	}

	
	
	
	
	
	
	
}
