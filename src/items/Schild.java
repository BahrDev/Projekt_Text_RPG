package items;
import game.*;

public class Schild extends Item{
	
	private boolean isEquiped = false;

	public Schild(int itemID, String name, String beschreibung, int weight) {
		super(itemID, name, beschreibung, weight);
		this.setDropEffekt(true);
	}
	
	public Schild() {
		super();
		this.setItemID(3);
		this.setName("Schild");
		this.setBeschreibung("Verwei� bitte hier einf�gen!");
		this.setWeight(2);
	}

	@Override
	public void use(String befehl) {
		super.use(befehl);
		this.useEffect();
	}

	@Override
	public void dropEffect() {
		super.dropEffect();
		if (this.isEquiped) {
			Held.setArmor(Held.getArmor() - 1);
			this.isEquiped = false;
		}
		System.out.println("Du l�sst den Schild fallen, nun f�hlst du dich ein wenig schutzlos.");
	}

	@Override
	public void useEffect() {
		super.useEffect();
		if (this.isEquiped) {
			Held.setArmor(Held.getArmor() - 1);
			this.isEquiped = false;
			System.out.println("Du nimmst das Schild aus deiner Hand und h�ngst es an deinen Rucksack.");
		}else {
			Held.setArmor(Held.getArmor() + 1);
			System.out.println("Du streifst das Schild �ber deinen Unterarm, es f�hlt sich robust an.");
		}
	}

	
	
	

}
