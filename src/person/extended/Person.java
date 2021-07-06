package person.extended;

import java.util.ArrayList;

public class Person {

//	vals
	private String name;
	private int age;
	private String jobTitle;
	private String saying;

	private ArrayList<Pet> petList = new ArrayList<>();

//	constructor
	public Person(String name, int age, String jobTitle, String saying) {
		this.setName(name);
		this.setAge(age);
		this.setJobTitle(jobTitle);
		this.setSaying(saying);
	}

	public void speak() {
		System.out.print(name);
		System.out.print(": ");
		System.out.println(saying);
	}

	// add/remove pets:
	public boolean addPet(Pet pet) {
		boolean added = this.petList.add(pet);
		System.out.print(this.name);
		System.out.print(" is now the owner of the pet ");
		System.out.println(pet.getName());
		return added;
	}

	public boolean removePet(Pet pet) {
		boolean removed = this.petList.remove(pet);
		System.out.print(this.name);
		System.out.print(" has abandoned the pet ");
		System.out.print(pet.getName());
		System.out.println(" to its fate");
		return removed;
	}

	public void removePetByName(String nomen) {
		for (Pet pet : petList) {
			if (pet.getName().equals(nomen)) {
				petList.remove(pet);
				System.out.print(name);
				System.out.print(" has abandoned the pet ");
				System.out.print(pet.getName());
				System.out.println(" to its fate");
				break;
			}
		}

	}

//	lists
	public void showPets() {
		System.out.print(name);
		System.out.print(" owns the following cats: ");
		for (Pet pet : petList) {
			System.out.print(pet.getName() + ";");
		}
		System.out.println();
	}

	public void fire() {
		System.out.print(name);
		System.out.println(" has been fired.");
		setJobTitle(null);
	}

	// print deets
	public void printDeets() {
		System.out.print("Name: ");
		System.out.println(name);
		System.out.print("Age: ");
		System.out.println(age);
		System.out.print("Job: ");
		System.out.println(jobTitle);
		System.out.print("Phrase: ");
		System.out.println(saying);
	}

//	getters/setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name != "") {
			this.name = name;
		} else {
			System.out.println("The 'name' field cannot be empty!");
		}

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 200) {
			this.age = age;
		} else if (age < 0) {
			System.out.print(this.name);
			System.out.println(" must be at least 0 years old!");
		} else {
			System.out.print(this.name);
			System.out.println(" cannot be over 200 years old!");
		}
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		if (jobTitle != null && jobTitle != "") {
			this.jobTitle = jobTitle;
		} else {
			this.jobTitle = "Unemployed";
		}
	}

	public String getSaying() {
		return saying;
	}

	public void setSaying(String saying) {
		this.saying = saying;
	}

	public ArrayList<Pet> getPetList() {
		return petList;
	}

}
