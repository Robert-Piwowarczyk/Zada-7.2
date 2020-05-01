public class Person {
    private String firstName;
    private String lastName;
    private String personNumber;
    private String address;

    public Person(String firstName, String lastName, String personNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personNumber = personNumber;
        this.address = address;
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

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String getInfo() {
        return firstName + " " + lastName + ", numer osobisty:" + personNumber + ", adres: " + address;
    }
}
