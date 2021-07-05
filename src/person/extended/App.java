package person.extended;

public class App {

	public static void main(String[] args) {

		Person person1 = new Person("Jeff Goldblum", 34, "Chaotician");
		Person person2 = new Person("Sam Neill", 36, "Palaeontologist");
		Person person3 = new Person("Laura Dern", 32, "Palaeobotanist");
		Person person4 = new Person("Samuel L Jackson", 40, "Computer guy");

		person1.addDog(new Dog("T. rex", 82, "green"));
		person1.addCat(new Cat("Fluffy", 24, "white"));
		person2.addDog(new Dog("Velociraptor", 23, "green"));
		person2.addCat(new Cat("Mr Cat", 44, "ginger"));
		person3.addDog(new Dog("Triceratops", 4, "green"));
		person3.addCat(new Cat("Darth Maul", 14, "green"));
		person4.addDog(new Dog("Dilophosaurus", 99, "green"));
		person4.addCat(new Cat("The Mouth of Sauron", 7, "brown"));

		person1.removeCatByName("Fluffy");

		PersonManager.addPerson(person1);
		PersonManager.addPerson(person2);
		PersonManager.addPerson(person3);
		PersonManager.addPerson(person4);

		System.out.println();
		PersonManager.findPersonByName("Sam");
		System.out.println();
		PersonManager.listPeople();
		System.out.println();
		PersonManager.removePerson(person2);
		System.out.println();
		PersonManager.listPeople();

	}
}
