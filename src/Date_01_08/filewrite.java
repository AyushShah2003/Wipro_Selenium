package Date_01_08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("WiproBatch2/Files/fw.txt");
		fw.write("This is my reader writer file\nThis is the file");
		fw.close();
		
		FileReader fr = new FileReader("WiproBatch2/Files/fw.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	}

}