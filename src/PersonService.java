import java.util.List;
import java.util.stream.Collectors;

//spearacja logiki 
//DOMENY (Person -> PersonController, Person, PersonService...)
public class PersonService {

	// persons.stream() <- strumienie na kolekcjach (od 1.8)
	// obiekt ktory pozwala dokonywaæ operacji "w locie" na kolekcji BEZ
	// MODYFIKACJI jej stanu

	// e -> e.getCity().equals("Krakow"); obiekt -> instrukcja "LAMBDA"

	// strumien()......collect(funkcja agreguj¹ca) przekszta³ca strumieñ na
	// "COS"
	// Collectors.toList() konwertuje Strumien na LISTe (ArrayList)
	public List<Person> findWoman(List<Person> source) {
		return source.stream().filter(p -> p.getName().endsWith("a")).collect(Collectors.toList());
	}

	// od javy 1.8
	// TODO: wyjaœniæ co to comparator (obiekty comparable) <- google
	// TODO: Optional<?> wyjaœniæ.
	public Person findOldest(List<Person> source) {
		return source.stream().collect(Collectors.maxBy((a, b) -> a.getAge() - b.getAge())).get();
	}

	public List<Person> findFromCity(String city, List<Person> source) {
		return source.stream().filter(p -> p.getCity().equals(city)).collect(Collectors.toList());
	}

	//TODO: Junit - jak pisaæ testy (TODO: maven/gradle - narzêdzie do budowania projektów)
	// teraz bez problemu mo¿emy napisaæ JUNIT dedykowany dla PersonService i
	// sprawdziæ ka¿d¹ z jego metod

}
