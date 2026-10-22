package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone2 = new CellPhone(55543212, "Galaxy S26", "AT&T", "917-724-5533", "Max Payne");

        System.out.print("What is the serial number? ");
        String input1 = scanner.nextLine();
        long serialNumber = Long.parseLong(input1);

        System.out.print("What model is the phone? ");
        String phoneModel = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        CellPhone cellPhone1 =  new CellPhone(serialNumber, phoneModel, carrier, phoneNumber, owner);
//        System.out.print("\n---\n*Customer Information*\n");
//        System.out.printf("Serial Number: %d\n", cellPhone1.getSerialNumber());
//        System.out.printf("Model: %s\n", cellPhone1.getModel());
//        System.out.printf("Carrier: %s\n", cellPhone1.getCarrier());
//        System.out.printf("Phone Number: %s\n", cellPhone1.getPhoneNumber());
//        System.out.printf("Owner: %s\n", cellPhone1.getOwner());
//        System.out.println("---");

        // Test dial
        System.out.print("---Testing\n");
        cellPhone1.dial("666-666-1234");

        // Test display
        display(cellPhone1);
        display(cellPhone2);

    }

    public static void display(CellPhone phone){
        System.out.print("\n---\n*Customer Information*\n");
        System.out.printf("Serial Number: %d\n", phone.getSerialNumber());
        System.out.printf("Model: %s\n", phone.getModel());
        System.out.printf("Carrier: %s\n", phone.getCarrier());
        System.out.printf("Phone Number: %s\n", phone.getPhoneNumber());
        System.out.printf("Owner: %s\n", phone.getOwner());
        System.out.println("---");
    }
}
