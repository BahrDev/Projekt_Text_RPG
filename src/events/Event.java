package events;


public interface Event {

	public void enterEffect();
	
	public void leaveEffect();
	
	public boolean triggerEffect(String befehl);
	
	
}
