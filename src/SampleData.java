

import java.util.Arrays;
import java.util.List;

import model.Person;


public class SampleData {

	public static List<Person> getPersonData() {
		return Arrays.asList(
				new Person("Sara", "Female", 20), 
				new Person("Sara", "Female", 22),
				new Person("Bob", "Male", 20), 
				new Person("Paula", "Female", 32), 
				new Person("Paul", "Male", 32),
				new Person("Jack", "Male", 2), 
				new Person("Jack", "Male", 72), 
				new Person("Jill", "Female", 12));
	}
	
}
