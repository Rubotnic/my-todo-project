package se.lexicon.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class TodoItemTaskTest {

    Person testPersonOne = new Person(1, " Bertil", " Bertilsson", " bertil@mail.com");
    TodoItem testItemOne = new TodoItem(3, " Change tires one", "Further information 1.", LocalDate.now(), true, testPersonOne);
    TodoItemTask testTodoTaskOne = new TodoItemTask(5, true, testItemOne, testPersonOne);

    @Test
    void getId() {

        int getId = testTodoTaskOne.getId();
        Assertions.assertEquals(5,getId);
    }

}
