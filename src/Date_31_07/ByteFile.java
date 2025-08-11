package Date_31_07;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteFile {
	public static void inputData() {
		try {
			byte[] array = {1,2,3,4,5,6};
			ByteArrayInputStream input = new ByteArrayInputStream(array);
			for(int i=0;i<array.length;i++) {
				int data = input.read();
				System.out.print(data);
			}
			input.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void outputData() {
		try {
			byte[] array = {1,2,3,4,5,6};
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			output.write(array);
			for(int i=0;i<10;i++) {
				output.write(i);
			}
			output.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputData();
		outputData();
		
	}

}