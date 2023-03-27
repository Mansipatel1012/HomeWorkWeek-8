package allprogramme;
/* 13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 */

import java.util.Scanner;

public class P13ShareDigit {
    public static void main(String[] args) {
                                           //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int fnumber = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        int sNumber = scanner.nextInt();
        System.out.println(hasSharedDigit(fnumber, sNumber));
                                           //closing the scanner object
        scanner.close();
    }
                                           //static method with return with parameter
    public static boolean hasSharedDigit(int n1, int n2) {
        int modulN1 = n1 % 10;
        int modulN2 = n2 % 10;
        int divisionN1 = n1 / 10;
        int divisionN2 = n2 / 10;
                                          //if statement
        if ((n1 < 10 || n1 > 99) || (n2 < 10 || n2 > 99)) {
            return false;
        }
        if (modulN1 == modulN2 || divisionN1 == divisionN2 || divisionN1 == modulN2 || divisionN2 == modulN1) {
            return true;
        } else {
            return false;
        }
    }
}


