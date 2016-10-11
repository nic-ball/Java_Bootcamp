package Day2.AddressBook;

/**
 * Created by nicholas.ball on 11/10/2016.
 */
public class Person {

    private String firstName;
    private String surname;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }
}
