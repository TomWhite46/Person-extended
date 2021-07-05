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
		System.out.println(": \"Woof!\".");
	}

}
