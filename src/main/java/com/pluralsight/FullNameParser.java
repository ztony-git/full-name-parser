package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String middleName = "";
        String lastName;

        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine();

        int firstSpace = fullName.indexOf(" ");
        firstName = fullName.substring(0, firstSpace);
        fullName = fullName.substring(firstSpace + 1);
        int lastSpace = fullName.lastIndexOf(" ");

        if (lastSpace == -1) {
            lastName = fullName;
        } else {
            middleName = fullName.substring(0, lastSpace);
            lastName = fullName.substring(lastSpace + 1);
        }

        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + (middleName.isEmpty() ? "(none)" : middleName.charAt(0) + "."));
        System.out.println("Last Name: " + lastName);
    }
}
