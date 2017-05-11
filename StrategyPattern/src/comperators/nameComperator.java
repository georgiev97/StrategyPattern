package comperators;

import interfaces.Person;

import java.util.Comparator;

/**
 * Created by valentin on 12.04.17.
 */
public class nameComperator implements Comparator<Person> {


    @Override
    public int compare(Person firstPerson, Person secondPerson) {

        int nameLenght = Integer.compare
                (firstPerson.getName().length(),
                        secondPerson.getName().length());
        int firstChar = Character.compare
                (firstPerson.getName().toLowerCase().charAt(0),
                        secondPerson.getName().toLowerCase().charAt(0));

        if(nameLenght == 0){
            return  firstChar;
        }
        return  nameLenght;
    }
}
