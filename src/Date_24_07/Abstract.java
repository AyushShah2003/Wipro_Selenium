package Date_24_07;

abstract class Abstract {
	
	abstract void makeSound();
	
	Abstract(){
		System.out.println("Constructor called");
	}
	
	public void eat() {
		System.out.println("Animal eats food");
	}
	
	public static String animalName = "Lion";
	
	public final String animalSound = "Roar";

}
