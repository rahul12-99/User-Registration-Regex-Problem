package com.userregistrationusingregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProblem {

    void lastName(){
        // Pattern for Name start with cap and has minimum 3 char.
        Pattern p = Pattern.compile("[A-Z][a-z]{2,}");
        // Matcher for giving input.
        Matcher m = p.matcher("Kumar");
        // boolean value for check matching or not.
        boolean b = m.matches();
        System.out.println(b);
    }

    public static void main(String[] args) {
        RegexProblem regex = new RegexProblem();
        regex.lastName();
    }
}
