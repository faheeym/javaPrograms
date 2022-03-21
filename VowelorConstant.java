/*
        (Vowel or Consonant) Write a program that will ask the user to enter a letter and check whether the letter is a vowel or a consonant. If the user enters something that is not a letter, display that it is an invalid input. Here are a few sample runs:
        Enter a letter: A
        A is a vowel

        Enter a letter: b
        b is a consonant

        Enter a letter: ?
        ? is an invalid input
*/
import java.util.*;
public class index {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            char a;
            System.out.print("Enter a letter: ");
            a = input.next().charAt(0);
            while (!Character.isAlphabetic(a)) {
                System.out.println(a + " is an invalid input");
                a = input.next().charAt(0);
            }
            if (a == 'a' || a == 'A') {
                System.out.println("Its a vowel!");
            } else if (a == 'e' || a == 'E') {
                System.out.println("Its a vowel!");
            } else if (a == 'i' || a == 'I') {
                System.out.println("Its a vowel!");
            } else if (a == 'o' || a == 'O') {
                System.out.println("Its a vowel!");
            } else if (a == 'u' || a == 'U') {
                System.out.println("Its a vowel!");
            } else {
                System.out.println("Its a constant");
            }


    }
}
