package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone myCellPhone = new CellPhone();

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

        // Test
        System.out.println(myCellPhone.getOwner());
    }
}
