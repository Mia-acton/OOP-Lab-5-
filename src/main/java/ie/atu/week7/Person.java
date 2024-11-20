package ie.atu.week7;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;

    public Person() { // default constructor
        this.name = null;
        this.address = null;
        this.phoneNumber = null;
    }

    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", address='" + address + '\'' +
                        ", phoneNumber='" + phoneNumber + '\''
                ;
    }
}
