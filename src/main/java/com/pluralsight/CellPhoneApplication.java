package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone(
                55543212,
                "Galaxy S26",
                "AT&T",
                "917-724-5533",
                "Max Payne");

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

        // Display
        display(cellPhone1);
        display(cellPhone2);

        // Dial
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
        cellPhone1.dial(cellPhone2);

    }

    public static void display(CellPhone phone){
        System.out.print("\n---\n*Customer Information*\n");
        System.out.printf("Serial Number: %d\n", phone.getSerialNumber());
        System.out.printf("Model: %s\n", phone.getModel());
        System.out.printf("Carrier: %s\n", phone.getCarrier());
        System.out.printf("Phone Number: %s\n", phone.getPhoneNumber());
        System.out.printf("Owner: %s\n", phone.getOwner());
        System.out.print("---\n");
    }
}
