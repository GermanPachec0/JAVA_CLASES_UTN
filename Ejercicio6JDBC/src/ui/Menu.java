package ui;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import entities.Product;
import data.DbHandler;

public class Menu {
	Scanner scan;
	DbHandler db = new DbHandler();
	private String dateFormat="dd/MM/yyyy";
	private String timeFormat="HH:mm:ss";
	private String dateTimeFormat = dateFormat+" "+timeFormat;
	public void start() {
		
		scan = new Scanner(System.in);
		String rta="";
		do {
			
		    rta=menu();
			
			switch (rta) {
			case "list": 
				list();
				break;
			
			case "search":
				search();
				break;
			
			case "new":
				newProduct();
				break;
			case "delete":
				delete();
				break;
				
			case "update":
				update();
				break;
				
			case "exit":
				System.out.println("Bye Bye");
			
			break;
				
			default:
				System.out.println("Command not found... try again");
				break;
			
			}
			
		}while(!rta.equals("exit") );
		
		
		scan.close();
		
		
		
	}
 
	
	private void update() {
		Product updprd= new Product();
		System.out.println("Input the if of the product to be modified: ");
		updprd.setId(Integer.parseInt(scan.nextLine()));
		System.out.println("Product"+updprd.getId()+"Current Data:");
		System.out.println(db.search(updprd));
		this.loadData(updprd);
		System.out.println();
		System.out.println();
		db.update(updprd);
		System.out.println();
		System.out.println(updprd);


		
	}


	private void delete() {
	Product delprd= new Product();
	System.out.println("Current products: ");
	this.list();
	System.out.println();
	System.out.println();
	System.out.println("Input to be deleted Product´s id:");
	delprd.setId(Integer.parseInt(scan.nextLine()));
	db.delete(delprd);
	
	
		
	}


	private void newProduct() {
		Product newprd = new Product();
		
		loadData(newprd);
		
		db.newProduct(newprd);
		
		System.out.println("Generated id: ");
		System.out.println(newprd.getId());
		
	}


	public void loadData(Product prd) {
		System.out.println("New Product data:");
		
		System.out.println("Name: ");
		prd.setName(scan.nextLine());
		System.out.println("description: ");
		prd.setDescription(scan.nextLine());
		System.out.println("price: ");
		prd.setPrice(Float.parseFloat(scan.nextLine()));
		System.out.println("stock: ");
		prd.setStock(Integer.parseInt(scan.nextLine()));
		
		System.out.println("is Shippng included(Y/N): ");
		prd.setShippingIncluded(scan.nextLine().trim().equalsIgnoreCase("Y"));
		
		DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern(dateTimeFormat);
		System.out.println("Disabled On: ");
		prd.setDisabledOn(LocalDateTime.parse(scan.nextLine(),dtFormat));
		
		DateTimeFormatter dFormat = DateTimeFormatter.ofPattern(dateFormat);
		System.out.println("Disabled Date: ");
		prd.setDisabledDate(LocalDate.parse(scan.nextLine(),dFormat));
		
		DateTimeFormatter tFormat = DateTimeFormatter.ofPattern(timeFormat);
		System.out.println("Disabled Time: ");
		prd.setDisabledTime(LocalTime.parse(scan.nextLine(),tFormat));
	}


	private void search() {
		Product p = new Product();
		System.out.println("Input search id: ");
		p.setId(Integer.parseInt(scan.nextLine()));
		Product prod= db.search(p);
		if(prod != null)
		
		System.out.println(prod);
		else {
			System.out.println("404 - not found");
		}
		
	}


	private void list() {
		for(Product p: db.list()) {
			
			System.out.println(p);
		}
		
	}
	
	

	private String menu() {
		System.out.println("Ingrese el comando a ejecutar: list/ search / new / delete / update / exit");
		return scan.nextLine();
	}
	

}
