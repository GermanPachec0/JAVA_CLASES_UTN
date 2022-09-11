package empresa;

import java.util.Scanner;

public class Carga {

	
	public static void main(String[] args) {
	String tipo_emp;
	int i=0;
	int opc;
	int dni;
	String nombre;
	String apellido;
	String email;
	double sueldoBase;
	Empleado[] unEmple = new Empleado[20];
	Scanner lector = new Scanner(System.in);
	
	do {
	
	  System.out.println("Ingresar empleado A: Administrativo / V: Vendedor");
	  tipo_emp = lector.nextLine();
	  System.out.println("Ingresar Dni:");
	  dni = Integer.parseInt(lector.nextLine());
	  System.out.println("Ingresar Nombre");
	  nombre= lector.nextLine();
	  System.out.println("Ingresar Apellido");
	  apellido= lector.nextLine();
	  System.out.println("Ingresar email");
	  email = lector.nextLine();
	  System.out.println("Ingresar sueldo Base");
	  sueldoBase = Double.parseDouble(lector.nextLine());
	
	 
	  if(tipo_emp.equalsIgnoreCase("A")) {
		   
		   unEmple[i]= new Administrativo();
		   hacerSets(i, dni, nombre, apellido, email, sueldoBase, unEmple);
		   System.out.println("Ingresar Horas Extras");
		   ((Administrativo)unEmple[i]).setHsExtra(Double.parseDouble(lector.nextLine()));
		   System.out.println("Ingresar Horas Mes");
		   ((Administrativo)unEmple[i]).setHsMes(Double.parseDouble(lector.nextLine()));
		 
		   
		   
	  } 
	  
	  if(tipo_emp.equalsIgnoreCase("V")) {
		  
		  unEmple[i]= new Vendedor();
		  hacerSets(i, dni, nombre, apellido, email, sueldoBase, unEmple);
		   System.out.println("Ingresar Porcentaje de comision");
		   ((Vendedor)unEmple[i]).setPorcenComision(Integer.parseInt(lector.nextLine()));
		   System.out.println("Ingresar Total de Ventas");
		   ((Vendedor)unEmple[i]).setTotalVentas(Integer.parseInt(lector.nextLine()));
		  
	  }
	  
	  
	  
	  i++;
	  
	  System.out.println("Presione 1 para salir o 0 para continuar");
	  opc = Integer.parseInt(lector.nextLine());
		
		
	}while ((opc != 1) && (i <=20));
	
	lector.close();

	mostrarEmpleados(unEmple);
	}

	public static void mostrarEmpleados(Empleado[] unEmple) {
		for(int i=0;i<20;i++) {
			if(unEmple[i]!= null) {
			System.out.println("Apellido: "+unEmple[i].getApellido());
			System.out.println("Nombre: "+unEmple[i].getNombre());
			System.out.println("DNI: "+unEmple[i].getDni());
			System.out.println("Sueldo: "+ unEmple[i].getSueldo());
			}

		}
	}
	
	public static void hacerSets(int i, int dni, String nombre, String apellido, String email, double sueldoBase,
			Empleado[] unEmple) {
		unEmple[i].setDni(dni);
		   unEmple[i].setApellido(apellido);
		   unEmple[i].setNombre(nombre);
		   unEmple[i].setEmail(email);
		   unEmple[i].setSueldoBase(sueldoBase);
	}
}
