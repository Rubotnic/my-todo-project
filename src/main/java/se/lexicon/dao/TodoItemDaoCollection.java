package se.lexicon.dao;

import se.lexicon.model.TodoItem;

import java.util.ArrayList;
import java.util.List;

public class TodoItemDaoCollection implements TodoItemDAO{

    ArrayList<TodoItem> todoItems = new ArrayList<>();

    @Override
    public TodoItem persist(TodoItem todoItem) {
        return null;
    }

    @Override
    public TodoItem findById(int id) {
        return null;
    }

    @Override
    public List<TodoItem> findAll() {
        return null;
    }

    @Override
    public List<TodoItem> findAllByDoneStatus() {
        return null;
    }

    @Override
    public List<TodoItem> findByTitleContaints() {
        return null;
    }

    @Override
    public List<TodoItem> findByPersonId() {
        return null;
    }

    @Override
    public List<TodoItem> findByDeadlineBefore() {
        return null;
    }

    @Override
    public List<TodoItem> findByDeadlineAfter() {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}