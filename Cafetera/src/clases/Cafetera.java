package clases;

public class Cafetera {
    //atributos
	int cantidadActual;
	int capacidadMaxima;

    //Metodo Constructor
    public Cafetera(int _capacidadMaxima,int _cantidadActual){
        capacidadMaxima = _capacidadMaxima;
        cantidadActual = _cantidadActual;
    }

    public void mostrarDatos (){
        System.out.println("La capacidad maxima es: "+capacidadMaxima);
        System.out.println("La cantidad actual es:"+cantidadActual);
    }
    
    public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
   
 }



