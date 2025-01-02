package ShoppingApplication;
import java.util.ArrayList;
import java.util.HashMap;

public class LoginUser {
	String userName;
	String password;
	
	public LoginUser(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public void authenticateUser () {
		HashMap<String, ArrayList<String>> user = RegisterUser.getUser();    // HashMap
		if (!(user.containsKey(userName)) || (user.get(userName).get(0) != password)) {
			System.out.println("Login Successful..");
			return;
		}
		else {
			System.out.println("Login unsuccessful..");
		}
	}
}