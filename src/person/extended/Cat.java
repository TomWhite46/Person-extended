package person.extended;

public class Cat {

	private String name;
	private int age;
	private String colour;

	public Cat(String name, int age, String colour) {
		this.setName(name);
		this.setAge(age);
		this.setColour(colour);
	}

	public void speak() {
		System.out.print(this.name);
		System.out.println(": Meow!");
	}

//	Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

//	Getters
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getColour() {
		return this.colour;
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
