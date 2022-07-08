package se.lexicon.item;

import se.lexicon.person.Person;
import java.time.LocalDate;

public class TodoItem {

        private int id;
        private String title;
        private String taskDescription;
        private LocalDate deadline;
        private Boolean done;
        private Person creator;
        private static int unicId = 1;

        public TodoItem(int id, String title, String taskDescription, LocalDate deadline, Boolean done, Person creator) {
                this.id = id;
                this.title = title;
                this.taskDescription = taskDescription;
                this.deadline = deadline;
                this.done = done;
                this.creator = creator;
                this.id = unicId ++;
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

        public Boolean isDone() {
                return done;
        }

        public void setDone(Boolean done) {
                this.done = done;
        }

        public Person getCreator(String summery) {
                return creator;
        }

        public void setCreator(Person creator) {
                this.creator = creator;
        }

        public boolean isOverdue(boolean b) {
                if (this.deadline.isAfter(LocalDate.parse("2022-07-07"))) {
                        return true;
                } else {
                        return false;
                }
        }

        public String getSummery() {
                return "id:" + id + ", title:" + title + " Taskdescription " + taskDescription + ", Deadline:" + deadline + ", Done:" + done + ", Creator";
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
}
