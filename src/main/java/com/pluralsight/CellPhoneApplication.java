package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone myCellPhone = new CellPhone();

        // Get
        System.out.print("What is the serial number? ");
        String input1 = scanner.nextLine();
        long serialNumber = Long.parseLong(input1);
        myCellPhone.setSerialNumber(serialNumber);

        System.out.print("What model is the phone? ");
        String phoneModel = scanner.nextLine();
        myCellPhone.setModel(phoneModel);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        myCellPhone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        myCellPhone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        myCellPhone.setOwner(owner);

        // Set
        System.out.print("\n---\n*Customer Information*\n");
        System.out.printf("Serial Number: %d\n", myCellPhone.getSerialNumber());
        System.out.printf("Model: %s\n", myCellPhone.getModel());
        System.out.printf("Carrier: %s\n", myCellPhone.getCarrier());
        System.out.printf("Phone Number: %s\n", myCellPhone.getPhoneNumber());
        System.out.printf("Owner: %s\n", myCellPhone.getOwner());
        System.out.println("---");
    }
}
