package items;
import game.*;

public class Schluessel extends Item{

	

	
	public Schluessel(int itemID, String name, String beschreibung, int weight) {
		super(itemID, name, beschreibung, weight);
		this.setVerbrauchsItem(true);
	}
	
	public Schluessel() {
		super();
		this.setItemID(1);
		this.setName("Schlüssel");
		this.setBeschreibung("Verweiß bitte hier einfügen!");
		this.setWeight(1);
		this.setVerbrauchsItem(true);
	}

	@Override
	public void use(String befehl) {
		super.use(befehl);
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
	public void dropEffect() {
		super.dropEffect();
	}

	public void UseEffect(int zielraumX, int zielraumY) {
		if(Spiel.tuerTargetter(Held.getPosX() + zielraumX, Held.getPosY() + zielraumY).isSimpleLocked()) {
			Spiel.tuerTargetter(Held.getPosX() + zielraumX, Held.getPosY() + zielraumY).setSimpleLocked(false);
			System.out.println("Die Tür wurde entriegelt, dein Schlüssel bricht dabei ab.");
			Held.getInventar().remove(this);		// Prüfen ob dies so funktioniert
		}else {
			System.out.println("Diese Tür ist nicht verschlossen.");
		}
	}

	
	@Override
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	
	
	
	

	
	
	
	
	
}
