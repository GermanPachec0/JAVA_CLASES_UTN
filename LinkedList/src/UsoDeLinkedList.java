import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class UsoDeLinkedList {

	public static void main(String[] args) {
			
		//Creacion
		LinkedList <String> mamals = new LinkedList<>();
		
		//Agregar elementos al final
		
		mamals.add("Dog");
		mamals.add("Horse");
		mamals.addFirst("Cat");
		mamals.addLast("Lion");
		
		//Agregar elementos en una ubicación
		
		System.out.println("Lista inicial");
		System.out.println(mamals);
		System.out.println();
		System.out.println();
		
		System.out.println("Original: "+mamals);
		mamals.add(1, "Cat");
		mamals.add(3,"Lion");
		System.out.println("Actual "+mamals);
		System.out.println();
		System.out.println();
		
		//Recuperar elementos sin alterar la coleccion
		System.out.println("Recuperar elementos");
		System.out.println("get(): "+mamals.get(2));
		System.out.println("getFirst(): "+ mamals.getFirst());
		System.out.println("getLast(): "+ mamals.getLast());
		System.out.println("peek(): "+mamals.peek());
		System.out.println("peekFirst(): "+ mamals.peekFirst());
		System.out.println("peekLast():"+ mamals.peekLast());
		System.out.println();
		System.out.println();

		//Remover primer y ultimo elemento
		
		System.out.println("Remover primero y ultimo elemento");
		System.out.println("Original: "+ mamals);
		String primerElemento = mamals.removeFirst();
		String ultimoElemento = mamals.removeLast();
		System.out.println("Actual: "+ mamals);
		System.out.println("Primero" + primerElemento + ", Ultimo "+ ultimoElemento);
		System.out.println(); System.out.println();
		
		//Recuperar el tamaño de un LinkedList
		System.out.println("Tamaño del LinkedList");
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
		System.out.println("¿El LinkedList contiene zebra?" + mamals.contains("Zebra"));
		System.out.println();System.out.println();
		
		//Obtener el indice de un elemento
		System.out.println("¿El indice de Dog?: "+ mamals.indexOf("Dog"));
		System.out.println("¿El indice de Cow?: "+mamals.indexOf("Cow"));
		System.out.println();System.out.println();
		
		//Agregar multiples elementos
		LinkedList<String> animals = new LinkedList<>();
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
		
		
		System.out.println((System.currentTimeMillis());
		
		
	}
}


