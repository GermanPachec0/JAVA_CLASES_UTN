package empresa;

public class Vendedor extends Empleado {
	float porcenComision;
	int totalVentas;
	
	public float getPorcenComision() {
		return porcenComision;
	}
	public void setPorcenComision(float porcenComision) {
		this.porcenComision = porcenComision;
	}
	public int getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(int totalVentas) {
		this.totalVentas = totalVentas;
	} 
	
	public double getSueldo() {
		return getSueldoBase() + (porcenComision * totalVentas/100);
	}
	
	
}
