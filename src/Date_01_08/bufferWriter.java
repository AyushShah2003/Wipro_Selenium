package Date_01_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bufferWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new FileWriter("WiproBatch2/Files/fw.txt",true));
		bw.write("I am buffered writer");
		bw.close();
		// read file
		BufferedReader br = new BufferedReader(new FileReader("WiproBatch2/Files/fw.txt"));
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}

}
