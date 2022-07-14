package se.lexicon.item;

import se.lexicon.person.Person;
import java.time.LocalDate;
import java.util.Objects;

public class TodoItem {

        private int id;
        String title;
        String taskDescription;
        LocalDate deadline;
        Boolean done;
        Person creator;
//        private static int unicId = 1;

        public TodoItem(int id, String title, String taskDescription, LocalDate deadline, Boolean done, Person creator) {
                this.id = id;
                this.title = title;
                this.taskDescription = taskDescription;
                this.deadline = deadline;
                this.done = done;
                this.creator = creator;
//                this.id = unicId ++;
        }


        public int getId() {
                return id;

        }

        public String getTitle(String book) {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getTaskDescription(String s) {
                return taskDescription;
        }

        public void setTaskDescription(String taskDescription) {
                this.taskDescription = taskDescription;
        }

        public LocalDate getDeadline() {
                return deadline;
        }

        public void setDeadline(LocalDate deadline) {
                this.deadline = deadline;
        }

        public void setDone(Boolean done) {
                this.done = done;
        }

        public Boolean isDone() {
                return done;
        }

        public Person getCreator(String summery) {
                return creator;
        }

        public void setCreator(Person creator) {
                this.creator = creator;
        }

        public boolean isOverdue() {
                return deadline.isBefore(LocalDate.parse("2022-12-12"));

        }

        @Override
        public String toString() {
                return "TodoItem{" +
                        "id=" + id +
                        ", title='" + title + '\'' +
                        ", taskDescription='" + taskDescription + '\'' +
                        ", deadline=" + deadline +
                        ", done=" + done +
                        ", creator=" + creator +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                TodoItem todoItem = (TodoItem) o;
                return id == todoItem.id && title.equals(todoItem.title) && taskDescription.equals(todoItem.taskDescription) && deadline.equals(todoItem.deadline) && done.equals(todoItem.done);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, title, taskDescription, deadline, done);
        }
}
