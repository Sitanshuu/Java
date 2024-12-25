import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;


class Users{
    String userName;
    String password;
    String emailId;
    
    ArrayList <String> credentials = new ArrayList<>();
    HashMap <String, ArrayList<String>> users = new HashMap<>();

    public Users (String userName, String password, String emailId){
        this.userName = userName;
        this.password = password;
        this.emailId = emailId;

        credentials.add(password);
        credentials.add(emailId);

        users.put(emailId, credentials);
    }

    public HashMap<String, ArrayList<String>> getUsers (){
        return users;
    }
}

public class MedicineShoppingApplication {
    static Scanner Sc = new Scanner(System.in);
    static void login (){
        System.out.println(">> LOGIN PAGE");
    }

    static void register (){
        System.out.println(">> REGISTER PAGE");
        System.out.print("Enter Username: ");
        String userName = Sc.nextLine();
        // System.out.print("Enter Password: ");
        String password = Sc.nextLine();
        // System.out.print("Enter EmailId: ");
        String emailId = Sc.next();

        Users newUser = new Users(userName, password, emailId);
        System.out.println(newUser.getUsers());
    }

    static void browseMedicines (){
        System.out.println(">> BROWSE MEDICINES PAGE");
    }

    static void viewCart (){
        System.out.println(">> VIEW CART PAGE");
    }

    static void checkout (){
        System.out.println(">> CHECKOUT PAGE");
    }

    static void exit (){
        System.out.println(">> EXIT PAGE");
    }

    public static void main(String[] args) {
        while (true){
            System.out.println("\n==== Online Medicine Shopping System ====");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Browse Medicines");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");
            
            int choice = Sc.nextInt();
            System.out.println(choice);

            switch (choice){
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    browseMedicines();
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
                    System.out.println("Invalid Choice!! Please Try Again!!");
                    break; 
            }
        }    
    }   
}