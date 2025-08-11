package Date_24_07;

public class AbstractChilds extends Abstract{
	
	void makeSound() {
		System.out.println("Animal makes Sound");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChilds obj=new AbstractChilds();
		obj.makeSound();
		obj.eat();
		System.out.println(animalName);
		System.out.println(obj.animalSound);
	}

}