package allprogramme;

/*10. Write a program to input any number and check if it Armstrong number or not
        153 = (1*1*1)+(5*5*5)+(3*3*3)
        where:
        (1*1*1)=1
        (5*5*5)=125
        (3*3*3)=27
        So:
        1+125+27=153. */

import java.util.Scanner;

public class P10Armstrong {

        public static void main(String[] args) {
     armstrong();
    }
    public static void armstrong(){
        // scanner declaration
        try (Scanner scanner = new Scanner(System.in)) {
            int temp, total = 0;
            System.out.println("Ënter 3 Digit Number : ");
            int num = scanner.nextInt();
            int number = num;

            for (; number != 0; number /= 10) {
                temp = number % 10;
                total = total + temp * temp * temp;
            }

            if (total == num) {
                System.out.println(num + " is an Armstrong number");
            } else {
                System.out.println(num + " is not an Armstrong number");
            }
        }
    }
}

