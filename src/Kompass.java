
public class Kompass extends Item{

	public Kompass(int itemID, String name, String beschreibung, int weight) {
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
		if (Held.hasSight) {
			System.out.println("Deine Koordinaten: x=" + Held.posX + " y=" + Held.posY);
		}else {
			System.out.println("Es ist zu dunkel um zu erkennen was dein Kompass anzeigt.");
		}
		
	}

	
	
	
	
	
	
	
}
