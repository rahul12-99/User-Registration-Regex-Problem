package com.userregistrationusingregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProblem {

    void mobileNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mobile number");
        String mobileNumber = sc.nextLine();
        // pattern for mobile number and country code followed by space and 10-digit number;
        Pattern p = Pattern.compile("^(91)[\\s][0-9]{10}$");
        Matcher m = p.matcher(mobileNumber);
        boolean b = m.matches();
        System.out.println(b);
    }

    public static void main(String[] args) {
        RegexProblem regex = new RegexProblem();
        regex.mobileNumber();
    }
}
