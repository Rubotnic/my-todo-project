package se.lexicon.dao;

import se.lexicon.model.Person;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoCollection implements PersonDAO{

    ArrayList<Person> persons = new ArrayList<>();

    @Override
    public Person persist(Person person) {
        return null;
    }

    @Override
    public Person findById(String id) {
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        return null;
    }

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
