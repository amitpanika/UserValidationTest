package com.bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Pattern;

public class UserValidationTest {

    /*
     *    variables..........................................
     */

    private String First_Name_Pattern = "^[A-Z]{1}[a-z]{3}$";
    private String Last_Name_Pattern = "^ [A-Z]{1}[a-z]{6}";
    private String Email = "^[A-Za-z0-9]+[@][a-z]+[.][a-z]";
    private String Pincode = "[0-9]{6}";
    private String PhoneNumber = "^[0-9]{2}[0-9]{10}";


    /*
     *   Test Method... For FirstName.........................
     */

    @Test
    public void givenFirstName_WhenProprr_shouldReturnTrue() {
        UserValidationTest Validator = new UserValidationTest();
        boolean result = Validator.ValidateFirstName("Amit");
        Assert.assertTrue(true);
    }

    /*
     *   Test Method... For FirstName.........................
     */

    @Test
    public void givenLastName_WhenProprr_shouldReturntrue() {
        UserValidationTest Validator = new UserValidationTest();
        boolean result = Validator.ValidateLastName("Panika");
        Assert.assertTrue(true);
    }

    /*
     *   Test Method... For FirstName.........................
     */

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidationTest Validator = new UserValidationTest();
        boolean result = Validator.Email("Ishmitpanika97@gmail.com");
        Assert.assertTrue(true);
    }

    /*
     *   Test Method... For FirstName.........................
     */

    @Test
    public void givenPincode_WhenProper_ShouldReturnTrue() {
        UserValidationTest Validator = new UserValidationTest();
        boolean result = Validator.Pincode(484555);
        Assert.assertTrue(true);
    }

    /*
     *   Test Method... For FirstName.........................
     */

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        UserValidationTest Validator = new UserValidationTest();
        boolean result = Validator.PhoneNumber(545785644);
        Assert.assertTrue(true);


    }
    /*
     *   method................................................
     */

    private boolean Email(String s) {
        Pattern pattern = Pattern.compile(Email);
        return pattern.matcher(s).matches();

    }

    /*
     *    method................................................
     */

    private boolean ValidateFirstName(String fname) {
        Pattern pattern = Pattern.compile(First_Name_Pattern);
        return pattern.matcher(fname).matches();
    }

    /*
     *    method................................................
     */

    private boolean ValidateLastName(String lname) {
        Pattern pattern = Pattern.compile(Last_Name_Pattern);
        return pattern.matcher(lname).matches();
    }


    private boolean Pincode(int i) {
        Pattern pattern = Pattern.compile(Pincode);
        return pattern.matcher(Pincode).matches();

    }


    private boolean PhoneNumber(int i) {
        Pattern pattern = Pattern.compile(PhoneNumber);
        return pattern.matcher(PhoneNumber).matches();

    }
}