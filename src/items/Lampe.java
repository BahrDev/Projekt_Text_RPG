package items;
import game.*;

public class Lampe extends Item{

	private boolean isOn = false;
	
	
	public Lampe(int itemID, String name, String beschreibung, int weight) {
		super(itemID, name, beschreibung, weight);
		this.setDropEffekt(true);
	}
	
	public Lampe() {
		super();
		this.setItemID(6);
		this.setName("Lampe");
		this.setBeschreibung("Verweiß bitte hier einfügen!");
		this.setWeight(1);
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
		Held.setHasSight(false);
		System.out.println("Die Lampe geht aus, es wird dunkel.");
	}

	@Override
	public void UseEffect() {
		super.UseEffect();
		if (this.isOn) {
			System.out.println("Du löscht das Feuer deiner Lampe, es wird dunkel.");
			Held.setHasSight(false);
			this.isOn = false;
		}else {
			Held.setHasSight(true);
			System.out.println("Du zündest die Lampe an, das Licht erhellt die Dunkelheit grade genug, damit du deine Umgebung erkennen kannst.");
			this.isOn = true;
		}		
	}
	
	
	
	
	


	
}
