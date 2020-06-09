package events;
import game.Held;
import game.Spiel;
import items.Item;
import items.Schluessel;

public class evt_ArmFallenPuzzle extends Item implements Event{

	private String richtigeAntwort = "AF";
	private String falscheAntwort1 = "2C";
	private String falscheAntwort2 = "B7";
	private String falscheAntwort3 = "D8";
	private String falscheAntwort4 = "15";
	
	private String endText = "Verweis bitte hier einfügen";
	private String fehlerText = "Verweis bitte hier einfügen";
	
	private boolean depleted = false;
	
	private Item ArmFallenPuzzleBelohnung = new Schluessel();
	
	public evt_ArmFallenPuzzle() {
		super();
		this.setItemID(28);
		this.setName("evt_ArmFallenPuzzle");
		this.setBeschreibung("An der rechten Wand steht ein Tresor, er ist mit Eisen beschlagen und wirkt sehr massiv.\n" + 
				"Gegenüberliegend steht an der Wand gemeißelt:\n" + 
				"\"Alle 100011 (35) Männer einer Oase sind verheiratet und haben jeder 11 (3) Kinder.\n" + 
				"Wieviele Menschen leben an der Oase?\"\n" + 
				"Unter dem Schriftzug sind 5 Steinplatten in die Wand eingelassen, jede davon mit einem armdicken Loch in der Mitte.\n" + 
				"Die Steinplatten sind folgendermaßen beschriftet:\n" + 
				"- 2C\n" + 
				"- B7\n" + 
				"- D8\n" + 
				"- AF\n" + 
				"- 15\n" + 
				"An der letzten Steinplatte hängt ein Skelett, dessen Arm noch immer in dem Loch der Platte steckt.");
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
		if(befehl.contains(this.richtigeAntwort)) {
			System.out.println(this.endText);
			Spiel.getMap()[Held.getPosX()][Held.getPosY()].addItemToRoom(ArmFallenPuzzleBelohnung);
			this.depleted = true;
			return true;
		}else if (befehl.contains(this.falscheAntwort1.toUpperCase()) ||
				befehl.contains(this.falscheAntwort2.toUpperCase()) ||
				befehl.contains(this.falscheAntwort3.toUpperCase()) ||
				befehl.contains(this.falscheAntwort4.toUpperCase())){
			System.out.println(this.fehlerText);
			Held.setAlive(false);
			return true;
		}else {
			return false;
		}
	}
	
	
}
