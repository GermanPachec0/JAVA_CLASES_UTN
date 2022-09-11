package empresa1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		String tipo_emp;
		int i=0;
		int opc;
		int dni;
		String nombre;
		String apellido;
		String email;
		double sueldoBase;
		ArrayList<Empleado> emple = new ArrayList<>();
		
		Scanner lector = new Scanner (System.in);
		
		
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
			   
			   Administrativo A1 = new Administrativo();
			   
			   hacerSets1(dni, nombre, apellido, email, sueldoBase, A1);
			   System.out.println("Ingresar Horas Extras");
			   A1.setHsExtra(Double.parseDouble(lector.nextLine()));
			   System.out.println("Ingresar Horas Mes");
			   A1.setHsMes(Double.parseDouble(lector.nextLine()));
			   emple.add(A1);
			  
			   
		  } 
		  
		  if(tipo_emp.equalsIgnoreCase("V")) {
			  
			  
			   Vendedor A2 = new Vendedor();
			  
			   hacerSets2(dni, nombre, apellido, email, sueldoBase, A2);
			   System.out.println("Ingresar Porcentaje de comision");
			   A2.setPorcenComision(Double.parseDouble(lector.nextLine()));
			   System.out.println("Ingresar Total de Ventas");
			   A2.setTotalVentas(Integer.parseInt(lector.nextLine()));
			   emple.add(A2);
			  
		  }
		  
		  
		  
		  i++;
		  
		  System.out.println("Presione 1 para salir o 0 para continuar");
		  opc = Integer.parseInt(lector.nextLine());
			
			
		}while ((opc != 1) && (i <=20));
		
		lector.close();
		
		for (Empleado empleado : emple) {
			System.out.println("Apellido: "+empleado.getApellido());
			System.out.println("Nombre: "+empleado.getNombre());
			System.out.println("DNI: "+empleado.getDni());
			System.out.println("Sueldo: "+ empleado.getSueldo());
			
		}
		

	}

	public static void hacerSets2(int dni, String nombre, String apellido, String email, double sueldoBase,
			Vendedor A2) {
		   A2.setDni(dni);
		   A2.setApellido(apellido);
		   A2.setNombre(nombre);
		   A2.setEmail(email);
		   A2.setSueldoBase(sueldoBase);
	}

	public static void hacerSets1(int dni, String nombre, String apellido, String email, double sueldoBase,
			Administrativo A1) {
		   A1.setDni(dni);
		   A1.setApellido(apellido);
		   A1.setNombre(nombre);
		   A1.setEmail(email);
		   A1.setSueldoBase(sueldoBase);
	}

}
