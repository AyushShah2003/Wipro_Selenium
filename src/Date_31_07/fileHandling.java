package Date_31_07;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileHandling {
	
	public static void inputData(String filename) {
		try {
			FileInputStream file = new FileInputStream(filename);
			System.out.println("Data in file");
			
			int i = file.read();
			while(i!=-1) {
				System.out.print((char)i);
				i = file.read();
			}
			file.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void writingData() {
		try {
			FileOutputStream out = new FileOutputStream("WiproBatch2/Files/file2.txt");
			String str = "This is my another file in which i am writing";
			out.write(str.getBytes());
			System.out.println("Data writed successfully!");
			out.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writingData();
		inputData("WiproBatch2/Files/file.txt");
	}

}
