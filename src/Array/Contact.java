package Array;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        //factory pattern, could be other sub class as contact that extends from the same parent class as Contact
        //so the creating object can be centralized here, avoid duplicate code
        //split out the creation and use of object
        //suitable for those case when creating object requires preparing many parameters, db query...
        return new Contact(name, phoneNumber);
    }
}
