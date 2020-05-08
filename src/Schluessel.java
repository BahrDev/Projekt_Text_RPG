
public class Schluessel extends Item{

	
	
	
	
	
	public Schluessel(int itemID, String name, String beschreibung, int weight) {
		super(itemID, name, beschreibung, weight);
		this.setVerbrauchsItem(true);
	}

	@Override
	public void Use(String befehl) {
		super.Use(befehl);
		if (befehl.toUpperCase().contains("WEST")) {
			this.UseEffect(-1, 0);
		}else if (befehl.toUpperCase().contains("OST")) {
			this.UseEffect(1, 0);
		}else if (befehl.toUpperCase().contains("NORD")) {
			this.UseEffect(0, -1);
		}else if (befehl.toUpperCase().contains("SÜD")) {
			this.UseEffect(0, 1);
		}else {
			System.out.println("Welche Tür möchtest du damit öffnen?");
		}
	}

	@Override
	public void DropEffect() {
		super.DropEffect();
	}

	public void UseEffect(int zielraumX, int zielraumY) {
		if(Spiel.tuertargetting(zielraumX, zielraumY).isSimpleLocked()) {
			Spiel.tuertargetting(zielraumX, zielraumY).setSimpleLocked(false);
			System.out.println("Die Tür wurde entriegelt, dein Schlüssel bricht dabei ab.");
			Held.inventar.remove(this);		// Prüfen ob dies so funktioniert
		}else {
			System.out.println("Diese Tür ist nicht verschlossen.");
		}
	}

	
	
	
	
	
	
	

	
	
	
	
	
}
