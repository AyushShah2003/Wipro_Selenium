package Date_25_07;

public class Encapsulation {
	private String name = "Mayank";
	private int age = 23;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}

}