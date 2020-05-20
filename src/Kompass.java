
public class Kompass extends Item{

	public Kompass(int itemID, String name, String beschreibung, int weight) {
		super(itemID, name, beschreibung, weight);
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
