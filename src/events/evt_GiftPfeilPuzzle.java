package events;
import game.Held;
import game.Spiel;
import items.Item;
import items.Schluessel;

public class evt_GiftPfeilPuzzle extends Item implements Event{
	
	private String[] richtigeAntwort = {"2", "3", "7"};
	private String[] altRichtigeAntwort = {"zwei", "drei", "sieben"};
	private String[] falscheAntwort = {"1", "4", "5", "6", "8", "9"};
	private String[] altFalscheAntwort = {"eins", "vier", "fünf", "sechs", "sieben", "acht"};
	
	private String endText = "Verweis bitte hier einfügen";
	private String fehlerText = "Verweis bitte hier einfügen";
	
	private boolean depleted = false;
	
	private Item GiftPfeilPuzzleBelohnung = new Schluessel();
	
	public evt_GiftPfeilPuzzle() {
		super();
		this.setItemID(27);
		this.setName("evt_GiftPfeilPuzzle");
		this.setBeschreibung("In diesem Raum gibt es an der rechten Wand in einer Reihe neun Hebel.\n" + 
				"An der gegenüberliegenden Wand gibt es nur einen einzigen Hebel.\n" + 
				"Es gibt kleine Löcher an den Wänden die scheinbar wahllos im Raum verteilt sind.\n" + 
				"Sie sind grade Groß genug damit dort 1-2 Finger hinein passen würden.\n" + 
				"An der Decke hängt ein Gitterkäfig in dem du einen Schlüssel funkeln sehen kannst.\n" + 
				"Über dem einsamen Hebel steht in den Stein gemeißelt:\n" + 
				"\"Wieviel Gliedmaße haben die sieben mal sieben Freunde des einarmigen Alrik?\"\n" +
				"Welche Hebel möchtest du also nach unten ziehen?");
		this.setEventItem(true);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public void use(String trigger) {
		super.use(trigger);
		if (trigger == "Enter") {
			this.enterEffect();
		}else if (trigger == "Leave") {
			this.leaveEffect();
		}else {
			this.triggerEffect(trigger);
		}
	}
	
	@Override
	public void enterEffect() {
		if (this.depleted == false) {
			Spiel.setEventItem(this);
			System.out.println(this.getBeschreibung());
		}
	}

	@Override
	public void leaveEffect() {
		Spiel.setEventItem(null);
	}

	@Override
	public boolean triggerEffect(String befehl) {
		int richtigeHebel = 0;
		boolean fail = false;
		// ---------- Hebelprüfung -----------
		for (int i = 0; i < falscheAntwort.length; i++) {
			if (befehl.contains(this.falscheAntwort[i].toUpperCase())) {
				fail = true;
				break;
			}
		}
		if (fail == false) {
			for (int i = 0; i < altFalscheAntwort.length; i++) {
				if (befehl.contains(this.altFalscheAntwort[i].toUpperCase())) {
					fail = true;
					break;
				}
			}
			if (fail == false) {
				for (int i = 0; i < richtigeAntwort.length; i++) {
					if (befehl.contains(this.richtigeAntwort[i].toUpperCase())) {
						richtigeHebel++;
					}
				}
				if(richtigeHebel == 0) {
					for (int i = 0; i < altRichtigeAntwort.length; i++) {
						if(befehl.contains(this.altRichtigeAntwort[i].toUpperCase())) {
							richtigeHebel++;
						}
					}
				}
			}
		}
		// ---------- Ergebnisprüfung -----------
		if(fail) {
			System.out.println(this.fehlerText);
			Held.schaden(1);
			return true;
		}else if(fail == false && richtigeHebel < 3) {
			System.out.println(this.fehlerText);
			Held.schaden(1);			
			return true;
		}else if(fail == false && richtigeHebel == 3) {
			System.out.println(this.endText);
			Spiel.getMap()[Held.getPosX()][Held.getPosY()].addItemToRoom(GiftPfeilPuzzleBelohnung);
			this.depleted = true;
			return true;
		}else {
			return false;
		}
	}

}
