package principal;

import java.util.ArrayList;
import java.util.Collections;

public class UsoArrayList {

	public static void main(String[] args) {
		//Creacion
		ArrayList <String> mamals = new ArrayList();
		
		//Agregar elementos al final
		
		mamals.add("Dog");
		mamals.add("Horse");
		
		//Agregar elementos en una ubicación
		
		System.out.println("Lista inicial");
		System.out.println(mamals);
		System.out.println();
		System.out.println();
		
		System.out.println("Original: "+mamals);
		mamals.add(1, "Cat");
		mamals.add(1,"Perro");
		mamals.add(3,"Lion");
		System.out.println("Actual "+mamals);
		System.out.println();
		System.out.println();
		
		//Recuperar elementos
		System.out.println("Primer elemento");
		System.out.println(mamals.get(0));
		System.out.println();
		System.out.println();
		
		//Recuperar el tamaño de un arraylist
		System.out.println("Tamaño del ArrayList");
		System.out.println(mamals.size());
		System.out.println();
		
		//Reemplazar elementos:
		System.out.println("Reemplazando elementos");
		mamals.set(2, "Zebra");
		System.out.println("Actual: "+ mamals);
		System.out.println();
		
		//Remover Elementos
		System.out.println("Remover por Indice");
		System.out.println("Original: "+ mamals);
		String cat = mamals.remove(1);
		System.out.println("Actual: "+ mamals);
		System.out.println("Removido: "+mamals);
		System.out.println();
		
		//Remover por objeto
		
		System.out.println("Remover por objeto");
		System.out.println("Original: "+mamals);
		boolean lionRemoved = mamals.remove("Lion");
		boolean gorilaRemoved = mamals.remove("Gorila");
		System.out.println("Actual: "+ mamals);
		System.out.println("¿Lion fue removido?: "+ lionRemoved);
		System.out.println("¿Gorila fue removido?: "+gorilaRemoved);
		System.out.println(); System.out.println();
		
		//Revisar si un elemento se encuentra en la coleccion
		System.out.println("¿El Arraylist contiene zebra?" + mamals.contains("Zebra"));
		System.out.println();System.out.println();
		
		//Obtener el indice de un elemento
		System.out.println("¿El indice de Dog?: "+ mamals.indexOf("Dog"));
		System.out.println("¿El indice de Cow?: "+mamals.indexOf("Cow"));
		System.out.println();System.out.println();
		
		//Agregar multiples elementos
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Cocodrile");
		animals.addAll(mamals);
		
		System.out.println("Agregar varios Elementos");
		System.out.println(animals);
		System.out.println(); System.out.println();
		
		//Remover varios elementos
		System.out.println("Remover todos los elementos de otro ArrayList");
		animals.removeAll(mamals);
		System.out.println(animals);
		System.out.println(); System.out.println();
		
		//Remover todos los elementos
		animals.clear();
		System.out.println("Vaciar un ArrayList");
		System.out.println(animals);
		System.out.println(); System.out.println();
		
		//Iterar con for
		System.out.println("Iterar con for");
		for(int i = 0 ; i < mamals.size(); i++)
		{
			System.out.print(mamals.get(i));
			System.out.print(", ");
		}
		System.out.println(); System.out.println();
		
		//Iterar con foreach
		
		System.out.println("Iterar con foreach");
		for(String animal : mamals)
		{
			System.out.print(animal);
			System.out.print(", ");
		}
		System.out.println(); System.out.println();
		
		//Ordenar elementos
		mamals.add("Cow");
		mamals.add("Cat");
		System.out.println("Ordenar Elementos");
		System.out.println("Original: "+mamals);
		Collections.sort(mamals);
		System.out.println("Actual: "+mamals);
		
		
		
	}

}
