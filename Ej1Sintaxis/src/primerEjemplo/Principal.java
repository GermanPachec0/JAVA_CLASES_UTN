package primerEjemplo;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Primer Ejemplo");
		int n1;
		int n2 =3;
		Integer n3=5;
		String texto;
		String texto2 = "bienvenido";
	
		Scanner lector = new Scanner(System.in);
		
		//variableEifs(n2, texto2, lector);
		iterar(lector);
		lector.close();
		String despedida= JOptionPane.showInputDialog("Ingrese Saludo Final");
		JOptionPane.showMessageDialog(null, despedida);
		
	}
	
	private static void iterar(Scanner lector)
	{
		String[] palabras = new String[3];
		
		for(int i= 0 ; i<palabras.length; i++)
		{
			System.out.println("Ingrese la palabra " + (i+1));
			palabras[i] = lector.nextLine();
		}
		System.out.println("Iterar con for");
		for(int i = 0 ; i < palabras.length; i++)
		{
			System.out.println("palabras["+i+"]: "+palabras[i]);
		}
		System.out.println("iterar con for invertido");
		for(int i = palabras.length -1 ; i >=0; i--)
		{
			System.out.println("palabras["+i+"]: "+palabras[i]);
		}
		System.out.println("iterar con foreach");
		
		for (String palabrita : palabras) {
			System.out.println(palabrita);
		}
		
	}

	public static void variableEifs(int n2, String texto2, Scanner lector) {
		int n1;
		Integer n3;
		String texto;
		n1 =2;
		n3 = n1 + n2;
		
		System.out.println("Ingrese un texto: ");
		texto = lector.nextLine();
		System.out.println("Ingrese un nro: ");
		n3 = Integer.parseInt(lector.nextLine());
		
		System.out.println("Texto: " + texto);
		System.out.println("Nro: " + n3);

		if (n3 ==  n2 + n1) {
			System.out.println("Nros Iguales");
		} else {
			System.out.println("NrosDistintos");
		}
		if (texto.equals(texto2)) {
			System.out.println("TextosIguales");
		} else {
			System.out.println("Textos Distintos");
		}
		if (texto.equalsIgnoreCase(texto2)) {
			System.out.println("TextosIguales");
		} else {
			System.out.println("Textos Distintos");
		}
		
		
	}

}
