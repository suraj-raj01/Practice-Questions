/*
9. Ravi and Shyam were playing a game. In the first turn of the game, Ravi will give an integer dividend and an integer
   divisor to Shyam. Then Shyam has to tell him the remainder of the division. In the second turn, Shyam will repeat the
   procedure.
   To help them, please write a program that accepts Dividend, and Divisor from the user and print the remainder on the
   console.

   ![hint](./resources/q8.jpg)
*/
package arithmatic_operator;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Dividend : ");
        int dividend = scanner.nextInt();
        System.out.print("Enter the Divisor : ");
        int divisor =  scanner.nextInt();
        int remainder = dividend%divisor;
        System.out.println("Remainder : "+remainder);
    }
}
