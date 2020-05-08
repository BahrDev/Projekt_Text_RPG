
public class Tuer {
	
	private int raum1x;
	private int raum1y;
	private int raum2x;
	private int raum2y;
	private boolean simpleLocked;
	private boolean masterLocked;
	
	
	public Tuer(int raum1x, int raum1y, int raum2x, int raum2y, boolean simpleLocked, boolean masterLocked) {
		super();
		this.raum1x = raum1x;
		this.raum1y = raum1y;
		this.raum2x = raum2x;
		this.raum2y = raum2y;
		this.simpleLocked = simpleLocked;
		this.masterLocked = masterLocked;
	}

	
	

	public int getRaum1x() {
		return raum1x;
	}


	public void setRaum1x(int raum1x) {
		this.raum1x = raum1x;
	}


	public int getRaum1y() {
		return raum1y;
	}


	public void setRaum1y(int raum1y) {
		this.raum1y = raum1y;
	}


	public int getRaum2x() {
		return raum2x;
	}


	public void setRaum2x(int raum2x) {
		this.raum2x = raum2x;
	}


	public int getRaum2y() {
		return raum2y;
	}


	public void setRaum2y(int raum2y) {
		this.raum2y = raum2y;
	}


	public boolean isSimpleLocked() {
		return simpleLocked;
	}


	public void setSimpleLocked(boolean simpleLocked) {
		this.simpleLocked = simpleLocked;
	}


	public boolean isMasterLocked() {
		return masterLocked;
	}


	public void setMasterLocked(boolean masterLocked) {
		this.masterLocked = masterLocked;
	}
	
	
	
	
	

}
