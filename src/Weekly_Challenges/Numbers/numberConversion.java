package Weekly_Challenges.Numbers;

import java.util.Scanner;

public class numberConversion {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number");
        long number = keyboard.nextLong();
        int smallerNumber;
        short evenSmallerNumber;
        byte smallestNumber;

        if (number > Byte.MAX_VALUE || number < Byte.MIN_VALUE)
        {
            if (number > Short.MAX_VALUE || number < Short.MIN_VALUE)
            {
                if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE)
                {
                    System.out.println("Well that can't be any smaller. It's Long.");
                } else {
                    smallerNumber = (int)number;
                    System.out.println(smallerNumber + " is an Integer.");
                }
            } else {
                evenSmallerNumber = (short)number;
                System.out.println(evenSmallerNumber + " is a Short.");
            }
        } else {
            smallestNumber = (byte)number;
            System.out.println(smallestNumber + " is a Byte.");
        }
    }
}
