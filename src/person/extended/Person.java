package person.extended;

import java.util.ArrayList;

public class Person {

//	vals
	public String name;
	public int age;
	public String jobTitle;
	public String saying;
	ArrayList<Cat> catList = new ArrayList<>();
	ArrayList<Dog> dogList = new ArrayList<>();

//	constructor
	public Person(String name, int age, String jobTitle, String saying) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.saying = saying;
	}

	public void speak() {
		System.out.print(name);
		System.out.print(": ");
		System.out.println(saying);
	}

//	add/remove cats:
	public boolean addCat(Cat pet) {
		boolean added = this.catList.add(pet);
		System.out.print(this.name);
		System.out.print(" is now the owner of the cat ");
		System.out.println(pet.name);
		return added;
	}

	public boolean removeCat(Cat pet) {
		boolean removed = this.catList.remove(pet);
		System.out.print(this.name);
		System.out.print(" has abandoned the cat ");
		System.out.print(pet.name);
		System.out.println(" to its fate");
		return removed;
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
	public boolean addDog(Dog pet) {
		boolean added = this.dogList.add(pet);
		System.out.print(this.name);
		System.out.print(" is now the owner of the dog ");
		System.out.println(pet.name);
		return added;
	}

	public boolean removeDog(Dog pet) {
		boolean removed = this.dogList.remove(pet);
		System.out.print(this.name);
		System.out.print(" has abandoned the dog ");
		System.out.print(pet.name);
		System.out.println(" to its fate");
		return removed;
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

	public void showDogs() {
		System.out.print(name);
		System.out.print(" owns the following dogs: ");
		for (Dog dog : dogList) {
			System.out.print(dog.name + ";");
		}
		System.out.println();
	}

//	print deets
	public void printDeets() {
		System.out.print("Name: ");
		System.out.println(name);
		System.out.print("Age: ");
		System.out.println(age);
		System.out.print("Job: ");
		System.out.println(jobTitle);
		System.out.print("Phrase: ");
		System.out.println(saying);
		System.out.println();
	}
}
