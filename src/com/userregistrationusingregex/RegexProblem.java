package com.userregistrationusingregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProblem {


    public void verifyEmailSamples() {
        String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};

        String[] inValidEmails = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

        System.out.println("For valid emails");

        for (int i = 0; i < validEmails.length; i++) {
            System.out.println("Result for emails : " + (i + 1) + " "
                    + Pattern.matches("[a-z-+0-9]+[.]?[a-z0-9]+[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}", validEmails[i]));
        }
        System.out.println();
        System.out.println("For Invalid Emails ");
        for (int i = 0; i < inValidEmails.length; i++) {
            System.out.println("Result for emails : " + (i + 1) + " "
                    + Pattern.matches("[a-z-+0-9]+[.]?[a-z0-9]+[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}", inValidEmails[i]));
        }
    }

    public static void main(String[] args) {
        RegexProblem regex = new RegexProblem();
        regex.verifyEmailSamples();
    }
}
