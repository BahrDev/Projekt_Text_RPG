
public class Lampe extends Item{

	private boolean isOn = false;
	
	
	public Lampe(int itemID, String name, String beschreibung, int weight) {
		super(itemID, name, beschreibung, weight);
		this.setDropEffekt(true);
	}

	@Override
	public void Use(String befehl) {
		super.Use(befehl);
		this.UseEffect();
	}

	@Override
	public void DropEffect() {
		super.DropEffect();
		this.isOn = false;
		Held.hasSight = false;
		System.out.println("Die Lampe geht aus, es wird dunkel.");
	}

	@Override
	public void UseEffect() {
		super.UseEffect();
		if (this.isOn) {
			System.out.println("Du löscht das Feuer deiner Lampe, es wird dunkel.");
			Held.hasSight = false;
			this.isOn = false;
		}else {
			Held.hasSight = true;
			System.out.println("Du zündest die Lampe an, das Licht erhellt die Dunkelheit grade genug, damit du deine Umgebung erkennen kannst.");
			this.isOn = true;
		}		
	}
	
	
	
	
	


	
}
