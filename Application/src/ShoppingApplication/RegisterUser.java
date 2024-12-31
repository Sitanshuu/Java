package ShoppingApplication;
import java.util.ArrayList;
import java.util.HashMap;


public class RegisterUser {
	ArrayList<String> credentials = new ArrayList<>();
	static HashMap<String, ArrayList<String>> users = new HashMap<>();
	
	public RegisterUser (String userName, String password, String emailId){
		if (users.containsKey(userName)) {
			System.out.println(userName+" already exists!! Please try with another username..");
			return;
		}
		credentials.add(password);
		credentials.add(emailId);
		users.put(userName, credentials);
		System.out.println("Registration Successful..");
	}
	
	public RegisterUser (String userName, String password){}

	public static HashMap<String, ArrayList<String>> getUser (){
		System.out.println(users);
		return users;
	}
}