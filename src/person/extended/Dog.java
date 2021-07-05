package person.extended;

public class Dog {

	public String name;
	public int age;
	public String colour;

	public Dog(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;

	}

	public void speak() {
		System.out.print(this.name);
		System.out.println(": Woof!");
	}

//	print deets
	public void printDeets() {
		System.out.print("\tName: ");
		System.out.println(name);
		System.out.print("\tAge: ");
		System.out.println(age);
		System.out.print("\tColour: ");
		System.out.println(colour);
	}

}
