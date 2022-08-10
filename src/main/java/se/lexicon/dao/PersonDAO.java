package se.lexicon.dao;

import se.lexicon.model.Person;
import java.util.Collections;
import java.util.List;

public interface PersonDAO {

    //create
    public Person persist(Person person);

    //find
    Person findById(String id);

    //find
    Person findByEmail(String email);

    //find
    List<Person> findAll();

    //remove
    void remove(int id);

}
