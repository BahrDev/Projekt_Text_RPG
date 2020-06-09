package events;

import game.Held;
import game.Spiel;
import items.Arkankubus;
import items.Item;

public class evt_SphinxPuzzle extends Item implements Event{
	
	private String richtigeAntwort = "Lawine";

	
	private String endText = "Verweis bitte hier einf�gen";
	private String fehlerText = "Verweis bitte hier einf�gen";
	private String[] saveWords = {"GEH", "SCHAU", "HEB", "FALLEN", "HILF", "TEST", "EXIT"};
	
	private boolean depleted = false;
	
	private Item SphinxPuzzleBelohnung = new Arkankubus();
	
	public evt_SphinxPuzzle() {
		super();
		this.setItemID(29);
		this.setName("evt_SphinxPuzzle");
		this.setBeschreibung("Als du den ersten Schritt in den Raum hinein setzt, taucht hinter einer der S�ulen eine Sphinx auf die sich dir in den Weg stellt.\n" + 
				"Sie spricht zu dir mit einer hellen weiblichen Stimme:\n" + 
				"\"Ich bin die W�chterin dieses Schatzes, willst du ihn haben, musst du mein R�tsel l�sen.\n" + 
				"Antwortest du richtig, dann l�se ich das Siegel.\n" + 
				"Antwortest du falsch, dann fresse ich dich.\n" + 
				"Schweigst du, kannst du von dannen ziehen.\"\n" + 
				"Auf ihrem Gesicht zeichnet sich ein raubtierhaftes L�cheln ab.\n" + 
				"\"Ich br�lle. Ich t�te.\n" + 
				"Ich verschlinge am St�ck.\n" + 
				"Ich habe weder Z�hne und noch Zunge,\n" + 
				"und doch hast du kein Gl�ck.\n" + 
				"Was bin ich?\"");
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
		if (befehl.contains(this.richtigeAntwort.toUpperCase())) {
			System.out.println(this.endText);
			Spiel.getMap()[Held.getPosX()][Held.getPosY()].addItemToRoom(SphinxPuzzleBelohnung);
			this.depleted = true;
			return true;
		}else if(saveWordTest(befehl)) {
			return false;
		}else {
			System.out.println(this.fehlerText);
			Held.setAlive(false);
			return true;
		}
		
	}
	
	public boolean saveWordTest(String befehl) {
		boolean ret = false;
		for (int i = 0; i < saveWords.length; i++) {
			if (befehl.contains(this.saveWords[i])) {
				ret = true;
			}
		}
		return ret;
	}

}
