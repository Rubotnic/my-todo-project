package se.lexicon.item;

import se.lexicon.person.Person;

public class TodoItemTask {

    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;
    private static int unicId = 1;

    public TodoItemTask(int id, boolean assigned, TodoItem todoItem, Person assigne) {
        this.id = id;
        this.assigned = assigned;
        this.todoItem = todoItem;
        this.assignee = assignee;
        this.id = unicId ++;
    }


    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        if (this.assigned = true) {
            return true;
        } else {
            return false;
        }
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public String getSummery() {
        return "id" + id + ", assigned:" + assigned + " TodoItem " + todoItem + ", assignee" + getAssignee();
    }

    @Override
    public String toString() {
        return "TodoItemTask{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", todoItem=" + todoItem +
                ", assignee=" + assignee +
                '}';
    }
}
