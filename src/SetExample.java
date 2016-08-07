import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		
		//elementy NIE UPORZADKOWANE (kolejnosæ nie znana)
		System.out.println("Hash set");
		Set<String> names = new HashSet<>(); //LinkedHashSet, TreeSet
		names.add("Jan");
		names.add("Jan");
		names.add("Kasia");
		names.add("Kasia");
		names.add("Adam");
		names.add("Aneta");
		names.add("Zenek");
		
		names.forEach(System.out::println);
		
//		for(String name: names){
//			System.out.println(name);
//		}
		System.out.println("\nLinked hash Set");
		//elementy s¹ w takiej kolejnoœæi w jakiej je doda³aœ
		Set<String> namesLHS = new LinkedHashSet<>(); //LinkedHashSet, TreeSet
		namesLHS.add("Jan");
		namesLHS.add("Jan");
		namesLHS.add("Kasia");
		namesLHS.add("Kasia");
		namesLHS.add("Adam");
		namesLHS.add("Aneta");
		namesLHS.add("Zenek");
		namesLHS.forEach(System.out::println);
		
		System.out.println("\ntreeSet");
		//elementy przechowuje POSORTOWANE u¿ywaj¹c komparatora klasy.
		Set<String> namesTS = new TreeSet<>(); //LinkedHashSet, TreeSet
		namesTS.add("Jan");
		namesTS.add("Jan");
		namesTS.add("Kasia");
		namesTS.add("Kasia");
		namesTS.add("Adam");
		namesTS.add("Aneta");
		namesTS.add("Zenek");
		
		namesTS.forEach(System.out::println);
		
		System.out.println("\nPersonSet");
		//hashcode i equals
		Set<Person> personSet = new HashSet<>();
		personSet.add(new Person("A", 19, "C"));
		personSet.add(new Person("A", 19, "C"));
		personSet.add(new Person("A", 20, "D"));
		personSet.forEach(System.out::println);
		
		//du¿o pu³apek :) - pogadamy sobie...
		System.out.println(personSet.contains(new Person("A", 19, "C")));
	}
}
