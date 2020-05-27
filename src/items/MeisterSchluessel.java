package items;

import game.Held;
import game.Spiel;

public class MeisterSchluessel extends Item{
	

	

	
	public MeisterSchluessel(int itemID, String name, String beschreibung, int weight) {
		super(itemID, name, beschreibung, weight);
		this.setVerbrauchsItem(true);
	}
	
	public MeisterSchluessel() {
		super();
		this.setItemID(7);
		this.setName("Meister-Schlüssel");
		this.setBeschreibung("Verweiß bitte hier einfügen!");
		this.setWeight(1);
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
		if(Spiel.tuertargetting(Held.getPosX() + zielraumX, Held.getPosY() + zielraumY).isMasterLocked()) {
			Spiel.tuertargetting(Held.getPosX() + zielraumX, Held.getPosY() + zielraumY).setMasterLocked(false);
			System.out.println("Du drehst den enormen Schlüssel in der massiven Tür. Der Boden bebt, als sich die Tür nach innen öffnet.");
			Held.getInventar().remove(this);
		}else {
			System.out.println("Diese Tür ist nicht verschlossen.");
		}
	}

	
	@Override
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
	
	

}
