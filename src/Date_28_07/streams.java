package Date_28_07;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class streams {

    public static void main(String[] args) {

        try(FileOutputStream fout = new FileOutputStream("sample.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout))
        {
            String msg = "Hi this simple try with resources example";

            bout.write(msg.getBytes());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("objects closed and msg printed in file");
    }
}