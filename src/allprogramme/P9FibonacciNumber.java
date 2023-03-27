package allprogramme;
/* 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)*/

import java.util.Scanner;

public class P9FibonacciNumber {

    public static void main(String[] args) {
     fibonacci();
    }
    public static void fibonacci() {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms to print the sequence: ");
        int n = scanner.nextInt();
        int s = 8, firstTerm = 1, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {            // using foreloop
            System.out.print(firstTerm + ", ");
                                              // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}




