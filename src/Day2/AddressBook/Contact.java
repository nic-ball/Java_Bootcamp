package Day2.AddressBook;

/**
 * Created by nicholas.ball on 11/10/2016.
 */
public class Contact {

    private Person person;

    @Override
    public String toString() {
        return "Contact{" +
                "person=" + person +
                ", address=" + address +
                ", mobNum=" + mobNum +
                ", homNum=" + homNum +
                ", eMail='" + eMail + '\'' +
                '}';
    }

    private Address address;
    private int mobNum;
    private int homNum;
    private String eMail;

    public int getMobNum() {
        return mobNum;
    }

    public void setMobNum(int mobNum) {
        this.mobNum = mobNum;
    }

    public int getHomNum() {
        return homNum;
    }

    public void setHomNum(int homNum) {
        this.homNum = homNum;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
