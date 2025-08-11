package LabSessions_28_07;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class stream2 {

    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("src/write.txt");
            BufferedWriter bw = new BufferedWriter(fw))
        {
            String user = "admin ";
            String pas = "java ";
            String msg = " this is simple char stream write operation";

            String data = user+pas+msg;

            bw.write(data);

            bw.flush();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Data writes");
    }
}