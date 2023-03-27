package allprogramme;
/* 4. Digit Sum Challenge
Write a method with the name sumDigits that has one int parameter called number.
If the parameter is >= 10 then the method should process the number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working
correctly for valid and invalid values passed as arguments.*/

import java.util.Scanner;

public class P4DigitSumChallenge {

    public static void main(String[] args)
{                            //Scanner declaration for reading input form console
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter any Number : ");
    int n1 = scanner.nextInt();

                            //calling static object
    int result = sumDigits(n1);
    System.out.println("Number = " +n1 + " sum of all Digit is " +result);
                             //closing the scanner object
    scanner.close();
}                            //static method with return with parameter
    public static int sumDigits(int number)
    {
                             //if condition
        if (number < 10)
        {
            System.out.println("Invalid number");
            return -1;
        }

        int result = 0;

                             //while loop
        while ( number > 0)
        {
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}