package Lecture_Code;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bd3 = new BigDecimal("34.5678876");
        System.out.println(bd3);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.BYTES);
        System.out.println(Short.TYPE);

        // focus on this for challenge

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long response = keyboard.nextLong();

        if (response > Integer.MAX_VALUE || response < Integer.MIN_VALUE) {
            System.out.println("Nope, can't do it");
        } else {
            int smallerNumber = (int)response;
            System.out.println("We got to " + smallerNumber);
        }

        Integer i = 5;
        Double d = 1.2;

        Double f = i + d;

        ArrayList<Character> letters = new ArrayList<>();
        letters.add('c');
        letters.add('d');
        letters.add('A');
        letters.add('9');

        //////// More BigDecimal / BigInteger ////////

        BigDecimal test = new BigDecimal("42.1");
        System.out.println(test);

        BigDecimal bd4 = new BigDecimal("34.56789876");
        BigDecimal bd5 = new BigDecimal("34.2234");

        BigDecimal sum = bd4.add(bd5);

        if (bd4.equals(bd5)){
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
    }
}
