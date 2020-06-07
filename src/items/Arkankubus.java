package items;

import game.Held;
import game.Spiel;

public class Arkankubus extends Item{
	

	

	
	public Arkankubus(int itemID, String name, String beschreibung, int weight) {
		super(itemID, name, beschreibung, weight);
		this.setVerbrauchsItem(true);
	}
	
	public Arkankubus() {
		super();
		this.setItemID(7);
		this.setName("Arkankubus");
		this.setBeschreibung("Verwei� bitte hier einf�gen!");
		this.setWeight(2);
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
		}else if (befehl.toUpperCase().contains("S�D")) {
			this.UseEffect(0, 1);
		}else {
			System.out.println("Welche T�r m�chtest du damit �ffnen?");
		}
	}

	@Override
	public void dropEffect() {
		super.dropEffect();
	}

	public void UseEffect(int zielraumX, int zielraumY) {
		if(Spiel.tuerTargetter(Held.getPosX() + zielraumX, Held.getPosY() + zielraumY).isMasterLocked()) {
			Spiel.tuerTargetter(Held.getPosX() + zielraumX, Held.getPosY() + zielraumY).setMasterLocked(false);
			System.out.println("Du drehst den enormen Schl�ssel in der massiven T�r. Der Boden bebt, als sich die T�r nach innen �ffnet.");
			Held.getInventar().remove(this);
		}else {
			System.out.println("Diese T�r ist nicht verschlossen.");
		}
	}

	
	@Override
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
	
	

}
