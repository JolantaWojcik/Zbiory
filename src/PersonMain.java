import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Jola", 25, "Krakow"));
		persons.add(new Person("Ola", 30, "Krakow"));
		persons.add(new Person("Jan", 20, "Warszawa"));
		persons.add(new Person("Zenek", 35, "Warszawa"));

		// znaleŸæ najstarsz¹ osobê.

		// 1) zak³adasz ¿e najwiêsza jest pierwsza osoba na liœcie
		// do javy 1.8
		Person oldest = persons.get(0);
		for (Person p : persons) {
			if (oldest.getAge() < p.getAge()) {
				oldest = p;
			}
		}
		System.out.println("Oldest person: " + oldest);

		PersonService personService = new PersonService();

		Person oldest18 = personService.findOldest(persons);
		System.out.println("Oldest person: " + oldest18);

		List<Person> fromCracow = personService.findFromCity("Krakow", persons);
		System.out.println("Form cracow: " + fromCracow);

		List<Person> woman = personService.findWoman(persons);
		woman.forEach(System.out::println);

		
		//zbior to taki rodzaj kolekcji ktory:
		//- nie dopuszcza powtórzeñ
		//- "nie ma indeksów" (nie ma czegoœ takiego jak pierwszy/drugi itp element)
		Set<String> cities = persons.stream().map(p -> p.getCity()).collect(Collectors.toSet());
		cities.forEach(System.out::println);

	}

}
