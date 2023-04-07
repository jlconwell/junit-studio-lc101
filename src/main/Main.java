package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string with with as many brackets as you want, but make sure '[' always has a matching ']'");
        String userString = input.next();

        while (!BalancedBrackets.hasBalancedBrackets(userString)) {
            System.out.println("String entered does not contain proper bracketing.  Please enter another string with '[' and ']' to match");
            userString = input.next();
        }

        if (BalancedBrackets.hasBalancedBrackets(userString)) {
            System.out.println("Great! Your string follows the instructions.  You should get a cookie!");
        }

        input.close();

    }
}
