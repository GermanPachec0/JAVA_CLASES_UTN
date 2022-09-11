package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
	 

	
	/*	
	String[] palabra = new String[4];
	String unapal;
	for(int i = 0; i<=10; i++) {
		System.out.print(i);
		System.out.print(" ");
	}
		System.out.println();
		System.out.println("Numeros impares");
		for(int i = 0; i<=10; i++) {
			if(i%2 != 0) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
	*/
		
	/*2
		Scanner lector = new Scanner(System.in);
		
		for(int i = 0 ; i <= 3;i++) {
			System.out.println("Ingresar la palabra: "+(i+1));
			palabra[i] = lector.nextLine();
			
		}
		lector.close();
		
		System.out.println("--Palabras--");
		
		for(int i = palabra.length-1 ; i >= 0  ; i--) {
			
			System.out.println(palabra[i]);
			
		}
	
		*/
	/* 3
	Scanner lector = new Scanner(System.in);
	
	for(int i = 0 ; i <= 3;i++) {
		System.out.println("Ingresar la palabra: "+(i+1));
		palabra[i] = lector.nextLine();
		
	}
	
	System.out.println("Ingresar la palabra a buscar");
	unapal = lector.nextLine();
	
	boolean band=false;
	
	for(int i= 0 ; i < palabra.length; i++) {
		if(palabra[i].equalsIgnoreCase(unapal)) {
		 band = true;
	}
	}
	lector.close();
		if(band){
			System.out.println("La palabra:"+unapal+" esta en el arreglo");
		}else {
			System.out.println("La palabra: "+unapal+" NO esta en el arreglo");
		}
	
	}
	*//*
		int num;
		int[] colnum = new int [5];
		int[] colnum2 = new int[5];
		int j=0;
	Scanner lector = new Scanner(System.in);
	System.out.println("Ingresar un entero");
	num = Integer.parseInt(lector.nextLine());
	
   
	for(int i=0;i<5;i++) {
		System.out.println("Carga numero en la pos: "+i);
		colnum[i] = Integer.parseInt(lector.nextLine());
		if(colnum[i]>num) {
			colnum2[j] = colnum[i];
			j++;
		}
	}
	
	for(int i=0;i< j;i++) {
		 System.out.println(colnum2[i]);
	 
	}
	
	lector.close();
*/
		/*4ConARRAYLIST
		
		ArrayList<Integer> nums  = new ArrayList<Integer>();
		ArrayList<Integer> num2  = new ArrayList<Integer>();
		int num;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresar un entero");
		num = Integer.parseInt(lector.nextLine());
		

		for(int i= 0; i<=3;i++) {
			System.out.println("Ingresar numero");
			nums.add(Integer.parseInt(lector.nextLine()));
		}
		
		for (Integer unNum : nums) {
			if(unNum>num) {
				num2.add(unNum);
		
			}
			for (Integer unNum1 : num2) { System.out.println(unNum1);}
			
		}
		
		
		
		lector.close();
		
		*/
		
	
	}
	}
	
	
	
	
	
	



	

