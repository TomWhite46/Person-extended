package person.extended;

public class Pet {

	private String name;
	private int age;
	private String colour;

	public Pet(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	public void speak() {
		System.out.println("How do you do?");
	};

	public String getChildName() {
		return this.getClass().getSimpleName();
	}

//	print deets
	public void printDeets() {
		System.out.print("\tName: ");
		System.out.println(this.getName());
		System.out.print("\tAge: ");
		System.out.println(this.getAge());
		System.out.print("\tColour: ");
		System.out.println(this.getColour());
	}

//	Setters/getters

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
