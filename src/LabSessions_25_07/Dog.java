package LabSessions_25_07;

public class Dog implements Animal{
	@Override
	public void bark() {
		System.out.println("Dog is barking");
	}

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.bark();
	}

}