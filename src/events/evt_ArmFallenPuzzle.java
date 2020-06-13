package events;
import game.Held;
import game.Spiel;
import game.Texte;
import items.Item;
import items.Schluessel;

public class evt_ArmFallenPuzzle extends Item implements Event{

	private String richtigeAntwort = Texte.event28RichtigeAntwort;
	private String falscheAntwort1 = Texte.event28FalscheAntwort1;
	private String falscheAntwort2 = Texte.event28FalscheAntwort2;
	private String falscheAntwort3 = Texte.event28FalscheAntwort3;
	private String falscheAntwort4 = Texte.event28FalscheAntwort4;
	
	private String endText = Texte.event28EndText;
	private String fehlerText = Texte.event28FehlerText;
	
	private boolean depleted = false;
	
	private Item ArmFallenPuzzleBelohnung = new Schluessel();
	
	public evt_ArmFallenPuzzle() {
		super();
		this.setItemID(28);
		this.setName(Texte.eventName28);
		this.setBeschreibung(Texte.eventBeschreibung28);
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
			if(Held.isHasSight()) {
				System.out.println(this.getBeschreibung());
			}
			
		}
	}

	@Override
	public void leaveEffect() {
		Spiel.setEventItem(null);
	}

	@Override
	public boolean triggerEffect(String befehl) {
		if (this.depleted == false) {
			if(befehl.contains(this.richtigeAntwort)) {
				System.out.println(this.endText);
				Spiel.getMap()[Held.getPosX()][Held.getPosY()].addItemToRoom(ArmFallenPuzzleBelohnung);
				this.depleted = true;
			}else if (befehl.contains(this.falscheAntwort1.toUpperCase()) ||
					befehl.contains(this.falscheAntwort2.toUpperCase()) ||
					befehl.contains(this.falscheAntwort3.toUpperCase()) ||
					befehl.contains(this.falscheAntwort4.toUpperCase())){
				System.out.println(this.fehlerText);
				Held.setAlive(false);
			}
			return true;
		}else {
			return false;
		}
	}
	
	
}
