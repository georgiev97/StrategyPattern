package comperators;

import interfaces.Person;

import java.util.Comparator;

/**
 * Created by valentin on 12.04.17.
 */
public class ageComperator implements Comparator<Person> {


    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        return firstPerson.getAge().compareTo(secondPerson.getAge());
    }
}

