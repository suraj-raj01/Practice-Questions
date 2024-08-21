/*
3. Write a program to accept number from user, until user press 0 to exit. Print the count of all the entered number
   exclude 0.
*/
package do_while;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int input;
        int count=0;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer number, Press 0 to exit");
            input = scanner.nextInt();
            count++;
        }while (input>0);
        System.out.println("Count : "+count);
    }
}
