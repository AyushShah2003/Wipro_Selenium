package LabSessions_25_07;

class libraryRecord{
	private String title, author;
	private boolean isAvailable = true;
	
	public void setBookDetails(String t,String a){
		this.title = t;
		this.author = a;
	}
	
	public void issueBook() {
		if(isAvailable) System.out.println("Book issued Successfully");
		else System.out.println("Book is not Available");
		isAvailable = false;
	}
	
	public void returnBook() {
		isAvailable = true;
		System.out.println("Book returned Successfully");
	}
	
	public void getBookInfo() {
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Available : "+isAvailable);
	}
}

public class LibraryEncapsule {

	public static  void main(String[] args) {
		libraryRecord obj = new libraryRecord();
		obj.setBookDetails("Harry Potter", "J. K. Rowling");
		obj.getBookInfo();
		obj.issueBook();
		obj.issueBook();
		obj.returnBook();
	}

}