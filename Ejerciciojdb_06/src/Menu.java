import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);
	public void start() {
		String rta=null;
		
		do {
			rta = inputCommand();
			switch(rta) { 
			case "list":
				break;
			case "search":
				break;
			case "new":
				break;
			case "update":
				break;
			case "delete":
				
				break;
			case "exit":
				close();
				break;
				default: 
					System.out.println("Invalid command,try again");
					break;
			}
			
		}while(!rta.equals("exit"));
		
	}

	private void close() {
		scan.close();
		System.out.println("Sore ja, mata ne, bye");
		
	}

	private String inputCommand() {
		System.out.println("Please input command: (list/search/new/update/delete/exit)");
		return scan.nextLine();
	}

}
