package se.lexicon.item;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.lexicon.person.Person;

import java.time.LocalDate;

class TodoItemTest {

    Person testPersonOne = new Person(1, " Bertil", " Bertilsson", " bertil@mail.com");
    TodoItem testOneItem = new TodoItem(3, " Change tires one", "Further information 1.", LocalDate.now(), true, testPersonOne);


    @Test
    void getId() {

        int getId = testOneItem.getId();
        Assertions.assertEquals(3,getId);

    }
}