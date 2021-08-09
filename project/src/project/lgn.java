package project;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class lgn {
	public static boolean login() {
		System.out.println("Hi!");

		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("Please choose one of the Option:");

		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter Username:");
		String username = scan.nextLine();
		System.out.println("Enter Password");
		String password = scan.nextLine();

		switch (option) {
		case 1:
			if(User.verifyLogin(username, password)) {
				return true;
			}
			break;

		case 2:
			String userrole;
			boolean userRoleExists = false;
			do {
				System.out.println("Choose any Role: admin/user/manager : ");
				userrole = scan.nextLine();
				userRoleExists = User.checkIfRoleExists(userrole);
				if(userRoleExists) {
					System.out.println("Role already exists Please select a new Role ");
					userRoleExists = true;
				}else {
					userRoleExists = false;
				}
				
			}while(userRoleExists);
			System.out.println("User Created");
			return false;
		default:
			return false;
		}
		return false;

	}
}


class User {
	protected String usertype;
	protected String username;
	protected String password;
	
	public User() {
		
	}
	
	public User(String username,String password,String usertype) {
		this.username = username;
		this.password = password;
		this.usertype = usertype;
		
	}
	
	protected static boolean checkIfRoleExists(String role) {
		
	
		Map<Integer, User> users = UserDataStore.userData();
		for(Map.Entry<Integer, User> user: users.entrySet()) {
			if(user.getValue().usertype.equals(role)) {
				return true;
			}
		}
		return false;
	}
	
	protected static boolean verifyLogin(String username,String password) {
		Map<Integer, User> users = UserDataStore.userData();
		for(Map.Entry<Integer, User> user: users.entrySet()) {
			if(user.getValue().username.equals(username) && user.getValue().password.equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
