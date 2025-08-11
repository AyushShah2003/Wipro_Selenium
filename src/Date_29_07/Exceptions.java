package Date_29_07;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
//			System.out.println(100/0);
			String str = null;
			System.out.println(str.length());
		} catch (ArithmeticException | NullPointerException e) {
			// only message to print
			System.out.println(e.getMessage());
			// the exception to print
			System.out.println(e);
			// the exception to print with its path where the exception
			e.printStackTrace();
		} finally {
			//closing the scanner classes, browser, database connections
		}
	}

}
