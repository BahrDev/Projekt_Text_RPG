
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
		System.out.println("Du lässt den Schild fallen, nun fühlst du dich ein wenig schutzlos.");
	}

	@Override
	public void UseEffect() {
		super.UseEffect();
		if (this.isEquiped) {
			Held.armor -= 1;
			this.isEquiped = false;
			System.out.println("Du nimmst das Schild aus deiner Hand und hängst es an deinen Rucksack.");
		}else {
			Held.armor += 1;
			System.out.println("Du streifst das Schild über deinen Unterarm, es fühlt sich robust an.");
		}
	}

	
	
	

}
