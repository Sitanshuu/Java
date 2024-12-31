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
		HashMap<String, ArrayList<String>> user = RegisterUser.getUser();
		if ((user.containsKey(this.userName))){
			if (user.get(this.userName).get(0) == this.password){
				System.out.println("Login Successful..");
				return;
			}
			else {
				System.out.println("Login Unsuccessful..");							
			}
		}
		else {
			System.out.println("Login Unsuccessful..");
		}
//		System.out.println(RegisterUser.getUser().containsKey(this.userName));
//		System.out.println();
//		System.out.println(RegisterUser.getUser().get(this.userName).get(0).getClass());
//		System.out.println(this.password.getClass());
//		System.out.println();
//		System.out.println(this.password.getClass());
	}

}