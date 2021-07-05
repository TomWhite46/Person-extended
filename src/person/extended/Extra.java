package person.extended;

public class Extra {

//	prints all cats owned

	public static void showCats(Person person) {
		System.out.print(person.name);
		System.out.print(" owns the following cats: ");
		for (Cat cat : person.catList) {
			System.out.print(cat.name + ";");
		}
		System.out.println();
	}

	public static void showDogs(Person person) {
		System.out.print(person.name);
		System.out.print(" owns the following dogs: ");
		for (Dog dog : person.dogList) {
			System.out.print(dog.name + ";");
		}
		System.out.println();
	}
}
