package nl.javacodingspot.common.services;

import java.util.List;

import nl.javacodingspot.common.domain.Person;

/**
 * Interface for the OSGi service to find people.
 * 
 * @author Merlin Weemaes
 *
 */
public interface PeopleFinder {
	
	/**
	 * The OSGi service that searches for people by surname.
	 *  
	 * @param surname
	 * @return The list of persons with that surname
	 */
	List<Person> findPeopleBySurname(String surname);
}
