import java.sql.*;
import java.util.LinkedList;
import java.util.Scanner;



public class Principal {
	
	public static void main(String[] args) throws SQLException {
		new Menu().start();
		LinkedList <Producto> producto= new LinkedList<>();
		ConectarBD nuevaCon = new ConectarBD();

		Scanner lector = new Scanner (System.in);
		nuevaCon.coneccion();
		nuevaCon.crearConeccion("jdbc:mysql://localhost/ejercicio_07", "java","himitsu" , "SELECT * FROM product");
		

		while(nuevaCon.getRs().next()) {
			
			Producto p = new Producto();
			p.setId(nuevaCon.rs.getInt("id"));
			p.setName(nuevaCon.rs.getString("name"));
			p.setPrice(nuevaCon.rs.getDouble("price"));
			producto.add(p);
			
		}
		
	
		
		System.out.println("LISTADO DE PRODUCTOS");
		for (Producto produ: producto) {
			System.out.println(produ);
		
		}
		
		System.out.println("\nIngresar ID de producto");
		int id =Integer.parseInt(lector.nextLine());
		
		nuevaCon.crearConeccion2("jdbc:mysql://localhost/ejercicio_07", "java","himitsu" , "SELECT * FROM product where id=?",id);
		Producto prod = new Producto();
		if(nuevaCon.getRs().next()) {
			
			prod.setId(nuevaCon.rs.getInt("id"));
			prod.setName(nuevaCon.rs.getString("name"));
			prod.setPrice(nuevaCon.rs.getDouble("price"));
	
		}
		nuevaCon.cerrarConeccion();
		
		System.out.println(prod);
		
		
	
		
		
	}

	
	
	
	
	

}
