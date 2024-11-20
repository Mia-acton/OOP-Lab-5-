package ie.atu.week7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Please enter your address: ");
        String address = scan.nextLine();
        System.out.println("Please enter your phone number: ");
        String phoneNumber = scan.nextLine();
        System.out.println("Please enter your customer number: ");
        String customerNumber = scan.nextLine();
        System.out.println("Would you like to be on the mailing list? (Y/N): ");
        boolean list = scan.hasNextBoolean();

        Customer newCustomer = new Customer(name, address, phoneNumber, customerNumber, list);
    }
}

