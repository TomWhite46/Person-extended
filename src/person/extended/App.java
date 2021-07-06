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

		System.out.println();
		Pet pet1 = new Dog("Pet the first", 5, "rainbow");
		Pet pet2 = new Cat("Pet the second", 20, "purple");
//		pet1.fetch();		//Does not function as pet1 is a 'Pet' rather than a Dog
		System.out.println(pet1.getClass() == person2.getPetList().get(1).getClass());

		Dog dog1 = (Dog) pet1;
		dog1.fetch("boomerang", 50);

		System.out.println(pet1 instanceof Dog);
		System.out.println(pet1 instanceof Pet);
		System.out.println(pet1 instanceof Object);
	}

}
