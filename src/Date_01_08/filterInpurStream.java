package Date_01_08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;

public class filterInpurStream {
	
	public static void write() {
		try {
			FileOutputStream file = new FileOutputStream("WiproBatch2/Files/file.txt",true); // append mode true
			FilterOutputStream filter = new BufferedOutputStream(file); // wrap above with buffered input stream
			// write the file content
			String text = "This is apple, banana";
			filter.write(text.getBytes());
			filter.flush();
			filter.close();
		} catch (Exception e) {
			System.out.println(e);
		} 
	}
	public static void read() {
		try {
			FileInputStream file = new FileInputStream("WiproBatch2/Files/file.txt"); // creating file input stream for it
			FilterInputStream filter = new BufferedInputStream(file); // wrap above with buffered input stream
			// read and print the file content
			int data;
			while((data = filter.read()) != -1) {
				System.out.print((char)data);
			}
			file.close();
			filter.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
	public static void main(String[] args) {
		write();
		read();
	}
}