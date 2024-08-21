// Implement a program that computes the factorial of a given number N using a loop and print the factorial. Accept the number N from user.
package while_loop_practice;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        int temp = number;
        int factorial = 1;
        while(number!=1){
            factorial*=number;
            number--;
        }
        System.out.println("factorial of "+temp+" = " + factorial);
    }
}
/*
Enter the number : 5
factorial of 5 = 120
*/