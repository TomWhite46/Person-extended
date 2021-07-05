package person.extended;

import java.util.ArrayList;

public class Person {

//	vals
	public String name;
	public int age;
	public String jobTitle;
	ArrayList<Cat> catList = new ArrayList<>();
	ArrayList<Dog> dogList = new ArrayList<>();

//	constructor
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

//	add/remove cats:
	public void addCat(Cat pet) {
		this.catList.add(pet);
		System.out.print(this.name);
		System.out.print(" is now the owner of the cat ");
		System.out.println(pet.name);
	}

	public void removeCat(Cat pet) {
		this.catList.remove(pet);
		System.out.print(this.name);
		System.out.print(" has abandoned the cat ");
		System.out.print(pet.name);
		System.out.println(" to its fate");
	}

	public void removeCatByName(String nomen) {
		for (Cat pet : catList) {
			if (pet.name.equals(nomen)) {
				catList.remove(pet);
				System.out.print(name);
				System.out.print(" has abandoned the cat ");
				System.out.print(pet.name);
				System.out.println(" to its fate");
				break;
			}
		}

	}

//	add/remove dogs
	public void addDog(Dog pet) {
		this.dogList.add(pet);
		System.out.print(this.name);
		System.out.print(" is now the owner of the dog ");
		System.out.println(pet.name);
	}

	public void removeDog(Dog pet) {
		this.dogList.remove(pet);
		System.out.print(this.name);
		System.out.print(" has abandoned the dog ");
		System.out.print(pet.name);
		System.out.println(" to its fate");
	}

//	lists
	public void showCats() {
		System.out.print(name);
		System.out.print(" owns the following cats: ");
		for (Cat cat : catList) {
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
