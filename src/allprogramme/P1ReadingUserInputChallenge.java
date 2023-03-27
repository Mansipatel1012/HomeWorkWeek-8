package allprogramme;
/*1. Read 10 numbers from the console entered by the user and print the sum of those
        numbers.
        -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
        -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
        10 numbers.
        -Use the nextInt() method to get the number and add it to the sum.
        -Before the user enters each number, print the message Enter number #x: where x represents the
        count, i.e. 1, 2, 3, 4, etc.
        -For example, the first message printed to the user would be Enter number #1:, the next Enter number
        #2:, and so on.*/


import java.util.Scanner;

public class P1ReadingUserInputChallenge {

    public static void main(String[] args) {
        input();          // static method calling in main method
    }

    public static void input() {     // static method
        // Scanner Declaretion
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int counter = 1;
        while (counter <= 10) {   // while loop syntax
            System.out.println("Enter 10 number # " + counter + " = ");
            if (input.hasNextInt()) {
                sum += input.nextInt();
                counter++;
            } else {
                System.out.println("invalid number");
            }
            input.nextLine();
        }
        int count = counter - 1;
        System.out.println("The total sum " + sum);
        System.out.println("You have enter " + count + "number");
        input.close();
    }
}

