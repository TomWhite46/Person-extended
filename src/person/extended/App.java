package person.extended;

public class App {

	public static void main(String[] args) {

		Person person1 = new Person("Jeff Goldblum", 75, "Chaotician", "Life finds a way.");
		Person person2 = new Person("Sam Neill", 36, "Palaeontologist", "Don't move a muscle.");
		Person person3 = new Person("Laura Dern", 32, "Palaeobotanist",
				"Unless they've figured out how to open doors.");
		Person person4 = new Person("Samuel L Jackson", 40, "Computer guy", "Hold on to your butts!");

		person1.addPet(new Dog("T. rex", 82, "green"));
		person1.addPet(new Cat("Fluffy", 24, "white"));
		person2.addPet(new Dog("Velociraptor", 23, "green"));
		person2.addPet(new Cat("Mr Cat", 44, "ginger"));
		person3.addPet(new Dog("Triceratops", 4, "green"));
		person3.addPet(new Cat("Darth Maul", 14, "green"));
		person4.addPet(new Dog("Dilophosaurus", 99, "green"));
		person4.addPet(new Cat("The Mouth of Sauron", 7, "brown"));
		person3.addPet(new Dog("Brachiosaurus", 99, "green"));

		person3.removePet(person3.getPetList().get(1));
		person1.removePetByName("Fluffy");

		PersonManager.addPerson(person1);
		PersonManager.addPerson(person2);
		PersonManager.addPerson(person3);
		PersonManager.addPerson(person4);

		System.out.println();

		person1.fire();

		System.out.println();
		PersonManager.printEverything();

	}

}
