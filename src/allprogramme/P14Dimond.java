package allprogramme;

/* 14. Write a program in Java to display the pattern like a diamond */

import java.util.Scanner;

public class P14Dimond {

    public static void main(String[] args) {
        pattern();
    }

    public static void pattern() {
        //Scanner declaration for reading input form consol
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int size = scanner.nextInt();
                           //Closing scanner
        scanner.close();
                          //while loop
        int i = 1;
        int j;
        while (i <= size) {
            j = 1;
            while (j++ <= size - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        i = size - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= size - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
        scanner.close();
    }
}

