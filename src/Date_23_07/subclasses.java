package Date_23_07;

class Animal {
	public void eat() {
		System.out.println("Animals eats food");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("Dog barking");
	}
}

class Cat extends Animal{
	public void meow() {
		System.out.println("Cat meows");
	}
}
class Cow extends Animal{
	public void moose() {
		System.out.println("Cow mooses");
	}
}

public class subclasses{
	public static void main(String args[]) {
		Animal obj=new Animal();
		obj.eat();
		Dog obj2=new Dog();
		obj2.bark();
		Cat obj3=new Cat();
		obj3.meow();
		Cow obj4=new Cow();
		obj4.moose();
		obj4.eat();
	}
}
