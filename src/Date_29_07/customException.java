package Date_29_07;

public class customException{
	
	public void checkAge(int age) throws Exception {
		if(age<=17) {
			throw new Exception("Age must be greater than 17");
		} else System.out.println("Eligible for vote");
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		customException obj = new customException();
		obj.checkAge(45);
		obj.checkAge(14);
	}

}
/* some questions answers
Try is for writing code that might contain exception and catch block will handle those exception
throw keyword is use for thowing exception in the code with the given message and throws used at the end of class for checked exception
finally is used after the try catch block excecution, to run irrespective of both and final is keyword used for initializing varibles that can not be change further
*/