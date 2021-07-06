package person.extended;

public class Cat extends Pet {

	public Cat(String name, int age, String colour) {
		super(name, age, colour);
	}

	@Override
	public void speak() {
		System.out.print(this.getName());
		System.out.println(": Meow!");
	}

}
