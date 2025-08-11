package Date_01_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int roll;
	String name;
	Student(String name, int roll){
		this.name = name;
		this.roll = roll;
	}
}
public class serialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//converting objects into byte stream
		Student s1 = new Student("Mayank",101);
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("WiproBatch2/Files/serialize.txt"));
		obj.writeObject(s1);    // serialize
		obj.flush();
		obj.close();
		ObjectInputStream inp = new ObjectInputStream(new FileInputStream("WiproBatch2/Files/serialize.txt"));
		Student data = (Student)inp.readObject();  //deserialize
		inp.close();
		System.out.println(data.name+" , "+data.roll);
		
	}
}
