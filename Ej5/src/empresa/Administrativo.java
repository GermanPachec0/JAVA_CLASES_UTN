package empresa;

public class Administrativo extends Empleado {
   private double hsExtra;
   private	double hsMes;
	
	public double getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(double d) {
		this.hsExtra = d;
	}
	public double getHsMes() {
		return hsMes;
	}
	public void setHsMes(double d) {
		this.hsMes = d;
	}
	
	public  double getSueldo() {
		return getSueldoBase() * (( hsExtra * 1.5)+hsMes) / hsMes;
		
	}


}
