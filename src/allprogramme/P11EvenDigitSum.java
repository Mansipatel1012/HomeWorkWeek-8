package allprogramme;
/*11. Even Digit Sum
        Write a method named getEvenDigitSum with one parameter of type int called number.
        The method should return the sum of the even digits within the number.
        If the number is negative, the method should return -1 to indicate an invalid value.
        EXAMPLE INPUT/OUTPUT:
        * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
        * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
        * getEvenDigitSum(-22); → should return -1 since the number is negative
        NOTE: The method getEvenDigitSum should be defined as public static */

public class P11EvenDigitSum {

    public void getEvenDigitSum(int number)
    {
        int originalNumber = number;
        int digit, sum = 0;

        while(number != 0)
        {
            digit = number % 10;

            if(digit % 2 == 0)
                sum = sum + digit;

            number = number / 10;
        }
        System.out.println("Sum of even digits of number "+originalNumber+ " is: "+sum);
    }

    public static void main(String args[]){   // main method
        P11EvenDigitSum eds = new P11EvenDigitSum(); //obj calling
        eds.getEvenDigitSum(123456789);
        eds.getEvenDigitSum(252);
        eds.getEvenDigitSum(-22);
    }
}
