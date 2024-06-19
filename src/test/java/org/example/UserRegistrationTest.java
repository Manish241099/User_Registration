package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
    @Test
    void ValidateFirstName(){


       Assertions.assertEquals(UserRegistration.firstName("Swapnil"),"Valid");
    }

    @Test
    void validateLastName(){

        Assertions.assertEquals(UserRegistration.firstName("Khanphate"),"Valid");


    }

    @Test
    void validateName(){
        
        Assertions.assertEquals(UserRegistration.lastName("Khanphate"),"Valid");

    }

    @Test
    void validateemailId(){
        Assertions.assertEquals(UserRegistration.emailId("swapniyl543@gmail.com"), "Valid");

    }

    @Test
    void validatePhoneNo(){
        Assertions.assertEquals(UserRegistration.phoneNo("+91 9757400321"), "Valid");

    }
    @Test
    void validatePassword(){
        Assertions.assertEquals(UserRegistration.Password("Sanvi123#"), "Valid");

    }





}