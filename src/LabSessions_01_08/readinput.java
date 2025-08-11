package LabSessions_01_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class readinput {
	public static void filecontent() throws IOException {
		FileInputStream file = new FileInputStream("WiproBatch2/Files/file.txt");
		int data;
		while((data=file.read()) != -1) {
			System.out.print((char)data);
		}
		file.close();
	}
	
	public static void displaylist() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("Serialize.txt"));
		ArrayList<String> list = new ArrayList<>();
		list.add("Raman"); list.add("Geeta");
		list.add("Mayank"); list.add("Gaurav");
		obj.writeObject(list);
		ObjectInputStream inp = new ObjectInputStream(new FileInputStream("Serialize.txt"));
		System.out.println("\n"+inp.readObject());
		obj.close();
		inp.close();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		System.out.println("The inputted number is : "+num);
		sc.close();
		
		filecontent();
		displaylist();
	}

}
