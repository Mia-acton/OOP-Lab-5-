package ie.atu.week7;

public class Customer extends Person{
    private String customerNumber;
    private boolean mailingList;

    public Customer() {
        this.customerNumber = null;
        this.mailingList = false;
    }

    public Customer(String name, String address, String phoneNumber, String customerNumber, boolean mailingList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() +
                " customerNumber='" + customerNumber + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}
