package person.extended;

import java.util.ArrayList;

public class PersonManager {

	public static ArrayList<Person> personList = new ArrayList<>();

	public static boolean addPerson(Person person) {
		boolean added = personList.add(person);
		System.out.print(person.name);
		System.out.println(" added to system.");
		return added;
	}

	public static boolean removePerson(Person person) {
		boolean removed = personList.remove(person);
		System.out.print(person.name);
		System.out.println(" has been removed from the system.");
		return removed;
	}

	public static Person findPersonByName(String name) {

		System.out.print("Search results for string '");
		System.out.print(name);
		System.out.println("':");

		for (Person person : personList) {

			if (person.name.contains(name)) {
				return person;
			}

		}

		return null;

	}

	public static void listPeople() {
		System.out.print("The following people are currently logged: ");
		for (Person person : personList) {
			System.out.print(person.name);
			System.out.print(", ");
		}
		System.out.println();
	}

}
