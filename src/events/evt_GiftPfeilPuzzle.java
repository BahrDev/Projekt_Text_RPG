package events;
import game.Held;
import game.Spiel;
import game.Texte;
import items.Item;
import items.Schluessel;

public class evt_GiftPfeilPuzzle extends Item implements Event{
	
	private String[] richtigeAntwort = Texte.event27RichtigeAntwort;
	private String[] altRichtigeAntwort = Texte.event27AltRichtigeAntwort;
	private String[] falscheAntwort = Texte.event27FalscheAntwort;
	private String[] altFalscheAntwort = Texte.event27AltFalscheAntwort;
	
	private String endText = Texte.event27EndText;
	private String fehlerText = Texte.event27FehlerText;
	
	private boolean depleted = false;
	
	private Item GiftPfeilPuzzleBelohnung = new Schluessel();
	
	public evt_GiftPfeilPuzzle() {
		super();
		this.setItemID(27);
		this.setName(Texte.eventName27);
		this.setBeschreibung(Texte.eventBeschreibung27);
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
		if (this.depleted == false) {
			if(fail) {
				System.out.println(this.fehlerText);
				Held.schaden(1);
			}else if(fail == false && richtigeHebel < 3) {
				System.out.println(this.fehlerText);
				Held.schaden(1);			
			}else if(fail == false && richtigeHebel == 3) {
				System.out.println(this.endText);
				Spiel.getMap()[Held.getPosX()][Held.getPosY()].addItemToRoom(GiftPfeilPuzzleBelohnung);
				this.depleted = true;
			}
			return true;
		}else {
			return false;
		}
	}

}
