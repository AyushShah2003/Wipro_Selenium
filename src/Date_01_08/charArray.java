package Date_01_08;


import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class charArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CharArrayWriter cw = new CharArrayWriter();
		cw.write("This is char array writer");
		cw.writeTo(new FileWriter("WiproBatch2/Files/file.txt"));
		//read the data
		CharArrayReader cr = new CharArrayReader(cw.toCharArray());
		int i;
		while((i=cr.read())!=-1) {
			System.out.print((char)i);
		}
		cw.close(); 
	}

}