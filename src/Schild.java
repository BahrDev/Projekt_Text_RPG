
public class Schild extends Item{
	
	private boolean isEquiped = false;

	public Schild(int itemID, String name, String beschreibung, int weight) {
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
		if (this.isEquiped) {
			Held.armor -= 1;
			this.isEquiped = false;
		}
		System.out.println("Du l�sst den Schild fallen, nun f�hlst du dich ein wenig schutzlos.");
	}

	@Override
	public void UseEffect() {
		super.UseEffect();
		if (this.isEquiped) {
			Held.armor -= 1;
			this.isEquiped = false;
			System.out.println("Du nimmst das Schild aus deiner Hand und h�ngst es an deinen Rucksack.");
		}else {
			Held.armor += 1;
			System.out.println("Du streifst das Schild �ber deinen Unterarm, es f�hlt sich robust an.");
		}
	}

	
	
	

}
