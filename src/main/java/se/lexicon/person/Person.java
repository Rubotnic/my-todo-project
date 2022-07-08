package se.lexicon.person;

public class Person {


    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private static int unicId = 1;

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = unicId ++;
    }

    public int getId() {
        this.id = id;
        return 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSummery() {
        return "id:" + id + ", first name:" + firstName + " last name " + lastName + ", email:" + email;
    }
}