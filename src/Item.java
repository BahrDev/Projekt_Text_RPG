public class Item implements Cloneable{
	
	// Attribute
	private Integer itemID;
	private String name;
	private String beschreibung = "";
	private int weight;
	private boolean eventItem = false;
	private boolean verbrauchsItem = false;
	private boolean dropEffekt = false;
	
	// Konstruktoren
	
	public Item(int itemID, String name, String beschreibung, int weight) {
		super();
		this.itemID = itemID;
		this.name = name;
		this.beschreibung = beschreibung;
		this.weight = weight;
		if(this.name.contains("evt_")) {
			this.eventItem = true;
		}
	}
	
	public Item() {
	}
	
	@Override
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	
	
	// Methoden
	public void Use (String befehl) {
	}
	
	public void Denied() {
		System.out.println("Dies hat keine Auswirkungen.");
	}
	
	
	public void DropEffect () {
		
	}
	
	public void UseEffect () {
		
	}


	
	
	
	// Getter und Setter
	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isEventItem() {
		return eventItem;
	}

	public void setEventItem(boolean eventItem) {
		this.eventItem = eventItem;
	}

	public boolean isVerbrauchsItem() {
		return verbrauchsItem;
	}

	public void setVerbrauchsItem(boolean verbrauchsItem) {
		this.verbrauchsItem = verbrauchsItem;
	}

	public boolean isDropEffekt() {
		return dropEffekt;
	}

	public void setDropEffekt(boolean dropEffekt) {
		this.dropEffekt = dropEffekt;
	}





	
	
	
	
}
