package LabSessions_23_07;

class Shape{
	public void getArea() {
		System.out.println("Area of the shape");
	}
}

class rectangle extends Shape{
	public void getArea(int a, int b) {
		System.out.println("Area of rectangle is :"+a*b);
	}
}

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle obj = new rectangle();
		obj.getArea(5,10);
	}

}