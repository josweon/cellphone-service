package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();

        // Get
        System.out.print("What is the serial number? ");
        String input1 = scanner.nextLine();
        long serialNumber = Long.parseLong(input1);
        cellPhone1.setSerialNumber(serialNumber);

        System.out.print("What model is the phone? ");
        String phoneModel = scanner.nextLine();
        cellPhone1.setModel(phoneModel);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone1.setOwner(owner);

        // Set
        System.out.print("\n---\n*Customer Information*\n");
        System.out.printf("Serial Number: %d\n", cellPhone1.getSerialNumber());
        System.out.printf("Model: %s\n", cellPhone1.getModel());
        System.out.printf("Carrier: %s\n", cellPhone1.getCarrier());
        System.out.printf("Phone Number: %s\n", cellPhone1.getPhoneNumber());
        System.out.printf("Owner: %s\n", cellPhone1.getOwner());
        System.out.println("---");

        // Test dial
        System.out.print("---Testing\n");
        cellPhone1.dial("666-666-1234");

    }
}
