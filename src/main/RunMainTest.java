package main;

import java.util.Scanner;

public class RunMainTest {

    public static String returnStatement(String str) {


        if (!BalancedBrackets.hasBalancedBrackets(str)) {
            return "String entered does not contain proper bracketing.  Please enter another string with '[' and ']' to match";
        }

        return "Great! Your string follows the instructions.  You should get a cookie!";
    }
}
