package ie.atu.week7;

public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel;

    public PreferredCustomer() {
        super();
        this.loyaltyPoints = 0;
        this.discountLevel = 0;
    }

    public PreferredCustomer(String name, String address, String phoneNumber, String customerNumber, boolean mailingList, int loyaltyPoints) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        setDiscountLevel();
    }

    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
        setDiscountLevel();
    }

    private void setDiscountLevel() {
        if (loyaltyPoints >= 2000) {
            this.discountLevel = 10.0;
        } else if (loyaltyPoints >= 1500) {
            this.discountLevel = 7.0;
        } else if (loyaltyPoints >= 1000) {
            this.discountLevel = 6.0;
        } else if (loyaltyPoints >= 500) {
            this.discountLevel = 5.0;
        } else {
            this.discountLevel = 0.0;
        }
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    @Override
    public String toString() {
        return super.toString() +
                " loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel + "%}";
    }
}


