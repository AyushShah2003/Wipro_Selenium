package LabSessions_29_07;

import java.util.Scanner;

class Book{
	String title;
	public Book(String title) throws InvalidBookException{
		if(title==null) {
			throw new InvalidBookException("Book title cannot be empty");
		}
	}
	public void display() {
		System.out.println("Title :"+title);
	}
}

class User{
	int id;
    String name;

    public User(int id, String name) throws InvalidUserException, InvalidIdException {
        if(id<=0){
            throw new InvalidIdException("User Id must be greater than 0.");
        }
        if(name==null || name.length()<3){
            throw new InvalidUserException("User name must be at least 3 characters.");
        }
        this.id = id;
        this.name = name;
    }
    public void display() {
        System.out.println("User Id :"+id+" Name :"+name);
    }
}

public class ExceptionsInherited {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the book title :");
		String title = sc.next();
		System.out.print("Enter the User Id :");
		int id = sc.nextInt();
		System.out.println("Enter the User name :");
		String name = sc.next();
		try {
			Book book = new Book(title);
			User user = new User(id,name);
			
		} catch (InvalidBookException | InvalidUserException | InvalidIdException e) {
			System.out.println("Exception Found : "+e.getMessage());
		}
		sc.close();
	}

}
