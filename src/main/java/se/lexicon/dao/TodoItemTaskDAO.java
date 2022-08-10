package se.lexicon.dao;

import se.lexicon.model.TodoItemTask;
import java.util.List;

public interface TodoItemTaskDAO {

    //create
    public TodoItemTask persist(TodoItemTask todoItemTask);

    //find
    TodoItemTask findById(String id);

    //find
    List<TodoItemTask> findAll();

    //find
    List<TodoItemTask> findByAssignedStatus();

    //find
    List<TodoItemTask> findByPersonId();

    //remove
    void remove(int id);

}
