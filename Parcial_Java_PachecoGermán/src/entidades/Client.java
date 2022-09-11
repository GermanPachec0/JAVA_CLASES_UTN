package entidades;

import java.util.LinkedList;

public class Client {
	
	private String firstName;
	private String lastName;
	private LinkedList <Event> eventos = new LinkedList<Event>();
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/*public double getEventsBill()
	{
		
	}*/ // Metodo no implementado
	
	

}
