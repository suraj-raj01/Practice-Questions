/*
1. Write a program to print `Hello World` on console, and ask user,
   `Do you want to continue? Press 1 to continue, Press 0 to exit`. Accept user choice.
   ```
     Sample:
        Hello World
        Do you want to continue? Press 1 to continue, Press 0 to exit
     input = 1
        Hello World
        Do you want to continue? Press 1 to continue, Press 0 to exit
     input = 0

     Explanation:
        Output is printed on screen, not get the user input, based on user input 1, we will continue to print again. When user input is 0, we stops repeating.
     ```
*/
package do_while_practice;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int input;
        do{
            System.out.println("Hello World!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to continue? Press 1 to continue, Press 0 to exit");
            input = scanner.nextInt();
        }while(input==1);
    }
}