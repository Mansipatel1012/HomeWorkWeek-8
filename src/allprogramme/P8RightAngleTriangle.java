package allprogramme;

/* 8. Display right angle triangle of @ using nested for loops.
*   @
    @@
    @@@
    @@@@
    @@@@@ */


import java.util.Scanner;

public class P8RightAngleTriangle {

    public static void main(String[] args) {
     m1();
    }
    public static void m1() {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int size = scanner.nextInt();
        System.out.println("Angle triangle");

        for (int i = 1; i <= 5; i++) {
            for (int m = 1; m <= i; m++) {
                System.out.print('@');
            }
            System.out.println(" ");
        }
    }
}