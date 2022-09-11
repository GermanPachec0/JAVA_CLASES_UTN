package entidades;

import java.time.LocalDateTime;
import java.util.LinkedList;

public abstract class Event {
	
	 private LocalDateTime eventDate;
	 private String Location;
	 private LinkedList<Service> servicios = new LinkedList<Service>();
	 private Client client;
	 
	 public LocalDateTime getEventDate() {
		return eventDate;
	}
	public void setEventDate(LocalDateTime eventDate) {
		this.eventDate = eventDate;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	public double getOveralCost()
	{
		double total=0.0;
		for (Service miServicio : servicios) {
			
			total = miServicio.getCost() + total;
		}
		return total;
	}
	
}
