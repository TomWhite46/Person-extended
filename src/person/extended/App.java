package person.extended;

public class App {

	public static void main(String[] args) {

		Person person1 = new Person("Jeff Goldblum", 34, "Chaotician", "Life finds a way.");
		Person person2 = new Person("Sam Neill", 36, "Palaeontologist", "Don't move a muscle.");
		Person person3 = new Person("Laura Dern", 32, "Palaeobotanist",
				"Unless they've figured out how to open doors.");
		Person person4 = new Person("Samuel L Jackson", 40, "Computer guy", "Hold on to your butts!");

		person1.addDog(new Dog("T. rex", 82, "green"));
		person1.addCat(new Cat("Fluffy", 24, "white"));
		person2.addDog(new Dog("Velociraptor", 23, "green"));
		person2.addCat(new Cat("Mr Cat", 44, "ginger"));
		person3.addDog(new Dog("Triceratops", 4, "green"));
		person3.addCat(new Cat("Darth Maul", 14, "green"));
		person4.addDog(new Dog("Dilophosaurus", 99, "green"));
		person4.addCat(new Cat("The Mouth of Sauron", 7, "brown"));
		person3.addDog(new Dog("Brachiosaurus", 99, "green"));

		person1.removeCatByName("Fluffy");

		PersonManager.addPerson(person1);
		PersonManager.addPerson(person2);
		PersonManager.addPerson(person3);
		PersonManager.addPerson(person4);

		System.out.println();
		System.out.println(PersonManager.findPersonByName("Sam").name);
		System.out.println();
		PersonManager.listPeople();
		System.out.println();
//		PersonManager.removePerson(person2);
		System.out.println();
		PersonManager.listPeople();
		System.out.println();

		person4.printDeets();
		person4.catList.get(0).printDeets();

		System.out.println();
		person3.showDogs();
		person3.showCats();

		person4.catList.get(0).speak();
		person3.dogList.get(1).speak();
		person2.speak();
		person4.speak();
		person3.speak();
		person1.speak();

		System.out.println();
		PersonManager.printEverything();

	}

}
