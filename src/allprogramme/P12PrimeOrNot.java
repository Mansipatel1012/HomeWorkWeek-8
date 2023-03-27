package allprogramme;
/*12. Write a programme to input any number and check if it is prime or not.
        (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
        prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
        17.... are the prime numbers.)*/

import java.util.Scanner;

public class P12PrimeOrNot {

    public static void main(String[] args) {  // main method
        Prime(10);
    }
    public static void Prime(int n){   // static method
        int i,m=0,flag=0;
        m=n/2;
                                      // Scanner Declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number");
        int num = scanner.nextInt();
        if (n==0||n==1){
            System.out.println(n+" is not prime number");

        }else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }
    }
}




