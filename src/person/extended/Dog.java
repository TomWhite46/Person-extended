package person.extended;

public class Dog extends Pet {

	public Dog(String name, int age, String colour) {
		super(name, age, colour);
	}

	@Override
	public void speak() {
		System.out.print(this.getName());
		System.out.println(": Woof!");
	}

	public void fetch(String thing, int distance) {
		System.out.print(this.getName());
		System.out.print(" has retrieved your ");
		System.out.print(thing);
		System.out.print(" from ");
		System.out.print(distance);
		System.out.println(" metres away.");
	}

}