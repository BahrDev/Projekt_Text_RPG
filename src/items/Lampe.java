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
	public void use(String befehl) {
		super.use(befehl);
		this.useEffect();
	}

	@Override
	public void dropEffect() {
		super.dropEffect();
		this.isOn = false;
		Held.setHasSight(false);
		System.out.println("Die Lampe geht aus, es wird dunkel.");
	}

	@Override
	public void useEffect() {
		super.useEffect();
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
	
	@Override
	public void useFromExternal() {
		if (this.isOn) {
			System.out.println("Das Feuer deiner Lampe erlischt, es wird dunkel.");
			Held.setHasSight(false);
			this.isOn = false;
		}else {
			Held.setHasSight(true);
			System.out.println("Deine Lampe entzündet sich, das Licht erhellt die Dunkelheit grade genug, damit du deine Umgebung erkennen kannst.");
			this.isOn = true;
		}	
	}
	
	
	
	


	
}
