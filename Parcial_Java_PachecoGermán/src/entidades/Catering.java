package entidades;

import java.util.LinkedList;

public class Catering extends Event {
	
	
	private Double fixedCost;
	private LinkedList<Menu> menu = new LinkedList<Menu>();
	
	public Double getFixedCost() {
		return fixedCost;
	}

	public void setFixedCost(Double fixedCost) {
		this.fixedCost = fixedCost;
	}
	
	
	@Override
	public double getOveralCost() {
		
		double total= 0.0;
		
		for (Menu miMenu : menu) {
			
			total = (miMenu.getQuantity() * miMenu.getUnitCost()) + total;

		}
		
		return super.getOveralCost() + total + this.fixedCost; 
		
	}

	
	

}
