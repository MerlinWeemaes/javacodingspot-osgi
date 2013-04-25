package nl.javacodingspot.server.services;

import java.util.List;

import nl.javacodingspot.common.domain.Person;
import nl.javacodingspot.common.services.PeopleFinder;
import nl.javacodingspot.server.dao.PeopleDao;

/**
 * Implementation of the OSGi service to find people.
 * 
 * @author Merlin Weemaes
 *
 */
public class PeopleFinderImpl implements PeopleFinder {

	/* (non-Javadoc)
	 * @see nl.javacodingspot.common.services.PeopleFinder#findPeopleBySurname(java.lang.String)
	 */
	public List<Person> findPeopleBySurname(String surname) {
		return PeopleDao.findPersonBySurname(surname);
	}

}
