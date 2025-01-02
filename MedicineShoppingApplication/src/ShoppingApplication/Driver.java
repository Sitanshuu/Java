package ShoppingApplication;
import java.util.*;

public class Driver {
	static Scanner Sc = new Scanner(System.in);
	static void login (){
		System.out.print("Enter Username: ");
		String userName = Sc.next();
		
		System.out.print("Enter Password: ");
		String password = Sc.next();
		
		LoginUser loginCredentials = new LoginUser(userName, password);
		loginCredentials.authenticateUser();
	}
	
	static void register (){		
		System.out.print("Enter Username: ");
		String userName = Sc.next();
		
		System.out.print("Enter Password: ");
		String password = Sc.next();
		
		System.out.print("Enter EmailId: ");
		String emailId = Sc.next();
		
		RegisterUser newUser = new RegisterUser(userName, password, emailId);
	}
	
	static void browseMedicine (){
		BrowseMedicine bm = new BrowseMedicine();
		bm.getMedList();
		bm.addToCart();
	}
	
	static void viewCart (){
		ViewCart vc = new ViewCart();		
	}
	
	static void checkout (){
		Checkout co = new Checkout();
	}
	
	static void exit (){
		System.out.println("Thank you for using Online Medicine Shopping System!");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		while (true){
			Scanner Sc1 = new Scanner(System.in);
			System.out.println("\n==== Online Medicine Shopping System ====");
	        System.out.println("1. Login");
	        System.out.println("2. Register");
	        System.out.println("3. Browse Medicines");
	        System.out.println("4. View Cart");
	        System.out.println("5. Checkout");
	        System.out.println("6. Exit");
	        System.out.print("Enter Your Choice: ");
	            
	        int choice = Sc1.nextInt();
	        switch (choice) {
	        	case 1:
	        		login();
	        		break;
	        	case 2:
	        		register();
	        		break;
	        	case 3:
	        		browseMedicine();
	        		break;
	        	case 4:
	        		viewCart();
	        		break;
	        	case 5:
	        		checkout();
	        		break;
	        	case 6:
	        		exit();
	        		break;
	        	default:
	        		System.out.println("Invalid input! Try again!!");
	        		break;
	        }
		}
	}
}