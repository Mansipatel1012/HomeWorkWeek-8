package allprogramme;

/* 15. Display left angle triangle of * using nested for loops
        *
        * *
        * * *
        * * * *
        * * * * *. */
import java.util.Scanner;

public class P15LeftAngleTriangle {

    public static void main(String[] args) {
    triangle();                      // object calling
    }
    public static void triangle(){  // static method
        // Scanner Declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int size = scanner.nextInt();
        System.out.println("Left angle triangle");
        scanner.close();
                                  // for loop
        for(int i = 1; i <= 5; i++){
            for(int m = 1; m<= i; m++){
                System.out.print('*');
            }
            System.out.println(" ");
        }

    }
}
