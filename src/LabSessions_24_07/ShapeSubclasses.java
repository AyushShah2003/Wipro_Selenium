package LabSessions_24_07;

class Rectangle extends Shape{
	@Override
	void calculateArea(double a,double b) {
		System.out.println("Area of the rectangle is :"+a*b);
	}
}

class Circle extends Shape{
	void calculateArea(double r,double pi) {
		System.out.println("Area of a circle is :"+pi*r*r);
	}
}

public class ShapeSubclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj1 = new Rectangle();
		Circle obj2 = new Circle();
		obj1.calculateArea(5, 10);
		obj2.calculateArea(7, 3.14);
		
	}

}