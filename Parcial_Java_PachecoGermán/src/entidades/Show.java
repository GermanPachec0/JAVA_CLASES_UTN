package entidades;

public class Show extends Event{
	private String type;
	private String name;
	private Double durationHs;
	private Equipement equipamiento;
	private Artist artista; 
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getDurationHs() {
		return durationHs;
	}
	public void setDurationHs(Double durationHs) {
		this.durationHs = durationHs;
	}
	
	
	@Override
	public double getOveralCost() 
	{
		double total= 0.0;
		
		total = equipamiento.getCost() + (artista.getHour1yCost() * this.durationHs);
		
		return super.getOveralCost() + total;
		
	}
	
	

}
