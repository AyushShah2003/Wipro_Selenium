package LabSessions_23_07;

class Animal{
	public void makesound() {
		System.out.println("Animal sounds");
	}
}

class Cat extends Animal{
	public void makesound() {
		System.out.println("Cat meows");
	}
}

public class makeSound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj=new Cat();
		obj.makesound();
	}

}