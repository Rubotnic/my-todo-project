package se.lexicon.dao;

import se.lexicon.model.TodoItem;

import java.util.ArrayList;

import java.util.List;

public interface TodoItemDAO {

    ArrayList<TodoItem> todoitems = new ArrayList<>();

    //create
    public TodoItem persist(TodoItem todoItem);

    //find
    public TodoItem findById(int id);
    //find
    List<TodoItem> findAll();

    //find
    List<TodoItem> findAllByDoneStatus();

    //find
    List<TodoItem> findByTitleContaints();

    //find
    List<TodoItem> findByPersonId();

    //find
    List<TodoItem> findByDeadlineBefore();

    //find
    List<TodoItem> findByDeadlineAfter();

    //remove
    void remove(int id);

}
