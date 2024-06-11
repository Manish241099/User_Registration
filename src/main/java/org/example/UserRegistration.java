package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserRegistration {
    UserRegistration() {
    }
    public boolean validateFirstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter the First_Name");
        String firstName = sc.nextLine();
        String regex = "[A-Z][a-z A-Z 0-9]{5,10}";
        Pattern PT = Pattern.compile(regex);
        Matcher MT = PT.matcher(firstName);
        if (MT.matches()) {
            System.out.println("the firstname is Valid");
            return true;
        } else {
            System.out.println("the firstname is InvalidValid");
            return false;
        }
    }

    public boolean validateLastName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter the Last_Name");
        String lastName = sc.nextLine();
        String regex = "[A-Z][a-z A-Z 0-9]{3,10}";
        Pattern PT = Pattern.compile(regex);
        Matcher MT = PT.matcher(lastName);
        if (MT.matches()) {
            System.out.println("the lastname is Valid");
            return true;
        } else {
            System.out.println("the lastname is Invalid");
            return false;
        }
    }
    public static void main(String[] args) {
        UserRegistration UR = new UserRegistration();
        UR.validateFirstName();
        UR.validateLastName();
    }
}

