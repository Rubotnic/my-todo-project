package se.lexicon.dao;

import se.lexicon.model.TodoItemTask;

import java.util.ArrayList;
import java.util.List;

public class TodoItemTaskDaoCollection implements TodoItemTaskDAO{

    ArrayList<TodoItemTask> todoItemTasks = new ArrayList<>();

    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        return null;
    }

    @Override
    public TodoItemTask findById(String id) {
        return null;
    }

    @Override
    public List<TodoItemTask> findAll() {
        return null;
    }

    @Override
    public List<TodoItemTask> findByAssignedStatus() {
        return null;
    }

    @Override
    public List<TodoItemTask> findByPersonId() {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
