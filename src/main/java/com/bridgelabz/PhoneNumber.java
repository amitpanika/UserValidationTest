package com.bridgelabz;


import java.util.regex.Pattern;

public class PhoneNumber {

    private boolean PhoneNumber(String PhoneNumber) {


        PhoneNumber = "[0-9]{2}\s[0-9]{10}";
        Pattern pattern = Pattern.compile(PhoneNumber);
        return pattern.matcher(PhoneNumber).matches();

    }
}
