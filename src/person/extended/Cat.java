package person.extended;

public class Cat {

	public String name;
	public int age;
	public String colour;

	public Cat(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;

	}

	public void speak() {
		System.out.print(this.name);
		System.out.println(": Meow!");
	}

//	print deets
	public void printDeets() {
		System.out.print("Name: ");
		System.out.println(name);
		System.out.print("Age: ");
		System.out.println(age);
		System.out.print("Colour: ");
		System.out.println(colour);
		System.out.println();
	}
}
