package LabSessions_28_07;

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        Scanner sc = null;
        try
        {
            System.out.print("test");
            System.out.println(12/0);

            System.out.println(args[0]);

            sc = new Scanner(System.in);

            sc.next();
        }
        catch(ArithmeticException ae)
        {

        }
        catch (ArrayIndexOutOfBoundsException aie) {
            // TODO: handle exception
        }
		catch(Exception e)
		{
			//getMessage() only exception message
			System.out.println(e.getMessage());

			//printing exception class object
			System.out.println(e);// exception class name and message

			e.printStackTrace();
		}
		finally
		{
			if(sc == null) {

			sc.close();
			}

			try {

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
    }
}