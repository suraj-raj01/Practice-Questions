// Write a program to print sum of all the digits of the given number. Accept number as input from user.
package while_loop_practice;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int sum=0;
        while(number!=0){
            int remain = number%10;
            sum+=remain;
            number/=10;
        }
        System.out.println("Sum of digit : "+sum);
    }
}
