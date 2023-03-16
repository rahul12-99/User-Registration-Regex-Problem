package com.userregistrationusingregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProblem {

    void email(){
        /* Pattern E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co)
         and 2 optional (xyz & in) with precise @ and . positions */

        Pattern p = Pattern.compile("[a-z0-9+.+a-z]+@+[bl+.+co+.+in]{2,}");
        // Matcher for giving input.
        Matcher m = p.matcher("abc.xyz@bl.co.in");
        // boolean value for check matching or not.
        boolean b = m.matches();
        System.out.println(b);
    }

    public static void main(String[] args) {
        RegexProblem regex = new RegexProblem();
        regex.email();
    }
}
