package allprogramme;
/* 7. First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value
Example input/output
* sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
* sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
* sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
 gives us 0+0 and the sum is 0.
* sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
 gives us 5+5 and the sum is 10.
* sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.*/

import java.util.Scanner;

public class P7FirstAndLastDigitSum {

public static void main(String[] args){
    //Scanner declaration for reading input form console
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number :");
    int n1 = scanner.nextInt();

    P7FirstAndLastDigitSum programme7FirstLastDigitSum = new P7FirstAndLastDigitSum();
    int result = programme7FirstLastDigitSum.sumFirstAndLastDigit(n1);
    System.out.println("The sum of the first and last digit number is  " +result);
    // closing scanner
    scanner.close();
}
                    //instance method with return with parameter
    public int sumFirstAndLastDigit(int number)
    {
        //if condition
        if (number < 0)
        {
            return -1;
        }
        int lastNumber = number % 10;
        int firstNumber = number;

        //while loop
        while (firstNumber >= 10)
        {
            firstNumber = firstNumber / 10;
        }

        int result;
        result = firstNumber + lastNumber;
        return result;
    }
}




