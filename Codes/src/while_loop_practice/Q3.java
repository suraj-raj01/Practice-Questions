// Write a program that calculates the sum of all even numbers from 1 to a given number N and print the sum. Accept the number N from user.
package while_loop_practice;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        int sum=0;
        while (number>0){
            if(number%2==0){
                sum+=number;
                System.out.print(number);
                if(number>2){
                    System.out.print(" + ");
                }
            }
            number--;
        }
        System.out.print(" = "+sum);
    }
}
/*
Enter the number : 15
14 + 12 + 10 + 8 + 6 + 4 + 2 = 56
*/