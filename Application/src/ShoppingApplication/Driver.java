/*
 * TODO:
 * -----
 * 1. Create Browse Medicine feature
 * 2. Create Add To Cart feature
 * 3. Create Checkout feature
 * 4. Fix Login feature
 */


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
		System.out.println(newUser.getUser());
	}
	
	static void browseMedicine (){
		BrowseMedicine bm = new BrowseMedicine();
		bm.getMedList();
	}
	
	static void viewCart (){
		
	}
	
	static void checkout (){
		
	}
	
	static void exit (){
		
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
	        System.out.println(choice);
	        
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