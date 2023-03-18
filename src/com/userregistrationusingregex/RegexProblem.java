package com.userregistrationusingregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProblem {

    void password(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password");
        String password = sc.nextLine();
        // pattern for password exactly 1 special char;
        Pattern p = Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+!=]*[@#$%^&+!=][^@#$%^&+!=]*$)).{8,}");
        Matcher m = p.matcher(password);
        boolean b = m.matches();
        System.out.println(b);
    }

    public static void main(String[] args) {
        RegexProblem regex = new RegexProblem();
        regex.password();
    }
}
