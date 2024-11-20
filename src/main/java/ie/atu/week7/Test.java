package ie.atu.week7;

public class Test {
    public static void main(String[] args) {
        PreferredCustomer preferredCustomer1 = new PreferredCustomer("Mia", "Ballymote Road, Tuam", "123-456-789", "062", true, 500);
        System.out.println(preferredCustomer1);

        preferredCustomer1.addLoyaltyPoints(600);
        System.out.println(preferredCustomer1);

        preferredCustomer1.addLoyaltyPoints(1500);
        System.out.println(preferredCustomer1);

        System.out.println(" ");

        PreferredCustomer preferredCustomer2 = new PreferredCustomer("Abigail", "Bohermore, Galway", "987-654-321", "145", false, 250);
        System.out.println(preferredCustomer2);

        preferredCustomer2.addLoyaltyPoints(1300);
        System.out.println(preferredCustomer2);
    }
}
