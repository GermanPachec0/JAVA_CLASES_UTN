package primerEjemplo;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Primer Ejemplo");
		int n1;
		int n2=3;
		Integer n3;
		String texto; 
		String texto2= "bienvenido";
		n1=2; 
		n3 = n1 + n2; 
	
		Scanner lector = new Scanner(System.in);
		//vaaribablesElfs(n1, n2, texto2, lector);
		iterar(lector);
		
		lector.close();
	}
	
	private static void iterar(Scanner lector){
		
		String[] palabras = new String [3];
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Ingrese la palabra" +(i+1));
			palabras[i]= lector.nextLine();
			
		}
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Ingrese la palabra["+i+"]:"+palabras[i] );
		
			
		}
		
		for(String palabra: palabras) {
			System.out.println(palabra);
		}
		
		
	}
	}

