package Date_22_07;

public class parameterised {

	double pi=3.14;
	public void getArea(double radius) {
		double area = pi*radius*radius;
		System.out.println(area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameterised obj =new parameterised();
		obj.getArea(5.34);
	}

}