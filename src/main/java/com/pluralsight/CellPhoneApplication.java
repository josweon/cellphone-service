package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone myCellPhone = new CellPhone();

        System.out.print("What is the serial number? ");
        String input = scanner.nextLine();
        long serialNumber = Long.parseLong(input);
        myCellPhone.setSerialNumber(serialNumber);

        System.out.println(myCellPhone.getSerialNumber());

    }
}
