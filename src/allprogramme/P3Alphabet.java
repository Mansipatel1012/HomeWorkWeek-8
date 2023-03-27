package allprogramme;
/* Write a Java program that takes the user to provide a single character from the
        alphabet. Print Vowel of Consonant, depending on the user input. If the user input
        Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
        error message.
        For eg:
        Input an alphabet: p
        Expected Output:
        Input letter is Consonant */

import java.util.Scanner;

public class P3Alphabet {
    public static void main(String[] args) {     //main method
        alphabet();                            // Static object calling
    }
    public static void alphabet() {
                                  // scanner Declaration
        Scanner letter = new Scanner(System.in);
        System.out.println("Enter the alphabet:  ");
        int i = 0;
        char ch = letter.next().charAt(0);
                                       //char ch=sc.nextChar();
        switch (ch) {                 // Switch statement
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                i++;
                break;
        }
        if (i == 1)
            System.out.println("Entered character " + ch + " is  Vowel");
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Entered character " + ch + " is Consonent");
        else
            System.out.println("Not an alphabet");
    }
}
