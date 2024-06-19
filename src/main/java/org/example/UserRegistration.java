package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class  UserRegistration{
    public  static String firstName(String firstname){
        Pattern pattern=Pattern.compile("[A-Z][a-z]{3,}");
        Matcher match= pattern.matcher(firstname);
        boolean ismatch= match.matches();
        if(ismatch){
            System.out.println("Valid input");
            return "Valid";
        }else {
          return   "Invalid";
        }
    }

    public static String lastName(String lastname){
        Pattern pattern=Pattern.compile("[A-Z][a-z]{3,}");
        Matcher match= pattern.matcher(lastname);
        boolean ismatch= match.matches();
        if(ismatch){
            System.out.println("Valid input");
            return "Valid";

        }else {
            return "Invalid";
        }
    }

    public static String emailId(String emailid){
        Pattern pattern=Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher match= pattern.matcher(emailid);
        boolean ismatch= match.matches();
        if(ismatch){
            return "Valid";
        }else {
            return "Invalid";

        }
    }

    public static String phoneNo(String phoneno){
        Pattern pattern=Pattern.compile("^\\+[0-9]{0,2}\\s[1-9][0-9]{9}$");
        Matcher match= pattern.matcher(phoneno);
        boolean ismatch= match.matches();
        if(ismatch){
            System.out.println("Valid input");
            return "Valid";
        }else {
            return "Invalid";
        }
    }

    public static String Password(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%&])[A-Za-z0-9!@#$%&]{8,}$");
        Matcher match = pattern.matcher(password);
        boolean ismatch = match.matches();
        if (ismatch) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter emailid");
        String email=sc.nextLine();
        System.out.println(emailId(email));
        System.out.println("enter Password");
        String password=sc.nextLine();
        System.out.println(Password(password));


    }
}