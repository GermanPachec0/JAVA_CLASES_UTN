package entidades;

import java.util.LinkedList;

public class Service {
	
	private String name;
	private Double cost;
	private LinkedList<Event> eventos = new LinkedList<Event>();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	
	

}
