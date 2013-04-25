package nl.javacodingspot.server.dao;

import java.util.ArrayList;
import java.util.List;

import nl.javacodingspot.common.domain.Person;

/**
 * A Fake DAO class that will return the Person from a list of static data.
 * 
 * @author Merlin Weemaes
 * 
 */
public class PeopleDao {
	private static List<Person> data;

	{
		data = new ArrayList<Person>();
		data.add(new Person("Foo", "Bar", "01012324287"));
		data.add(new Person("Fu", "Bar", "02024455662"));
		data.add(new Person("Foo", "FooBar", "03045464748"));
		data.add(new Person("Fu", "FooBar", "04057585950"));

	}

	public static List<Person> findPersonBySurname(String surname) {
		List<Person> list = new ArrayList<Person>();
		for (Person person : data) {
			if (person.getSurname().equals(surname)) {
				list.add(person);
			}
		}
		return list;
	}
}
