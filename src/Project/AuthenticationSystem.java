package Project;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

class User{
	private String username;
	private String password;
	 
	User(String name, String pass){
		this.username = name;
		this.password = pass;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
}

public class AuthenticationSystem {
	private LinkedList<User> users;
	private Set<String> set;
	private Scanner scan;
	AuthenticationSystem(){
		users = new LinkedList<>();
		set = new HashSet<>();
	}
	
	public void register() {
		scan = new Scanner(System.in);
		int max = 5;
		String name = "";
		System.out.print("Enter your Name :");
		while(max-->0) {
			name = scan.next();
			if(!set.contains(name)) {
				set.add(name);
				break;
			}
			else System.out.println("Name already exists\nEnter again");
		}
		if(name.isEmpty()) {
			System.out.println("Try again after some time...");
			return;
		}
		System.out.print("Set your Password :");
		String pass = scan.next();
		users.add(new User(name,pass));
		System.out.println("Registered Successfully!, Thank you...");
	}
	
	public void login() {
		scan = new Scanner(System.in);
		System.out.print("Your Name :");
		String name = scan.next();
		System.out.print("Enter Password :");
		String pass = scan.next();
		int key = 0;
		for(User user:users) {
			if(user.getUsername().equals(name)){
				if(user.getPassword().equals(pass))	System.out.println("Login Successfully!");
				else {
					System.out.print("Entered wrong password\nEnter password again :");
					pass = scan.next();
					if(user.getPassword().equals(pass)) System.out.print("Login Successfully");
					else System.out.print("Attempt Exceed !");
				}
				key = 1;
				break;
			}
		}
		if(key==0) System.out.println("User Not Found!");
	}

	public static void main(String[] args) {
		AuthenticationSystem system = new AuthenticationSystem();
		Scanner sc = new Scanner(System.in);
		boolean loggedIn = false;
		while(!loggedIn) {
			System.out.println("Choose an Option");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.print("Enter operation :");
			int option = sc.nextInt();
			switch(option) {
			case 1:
				system.register();
				break;
			case 2:
				system.login();
				break;
			case 3:
				loggedIn = true;
				break;
			default:
				System.out.println("Invalid option");
			}
		}
		System.out.println("Logged Out Successfully!");
		sc.close();
	}

}
