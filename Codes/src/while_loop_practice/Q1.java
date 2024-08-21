// Write a program to print all the digits of a given number.
package while_loop_practice;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        while (number!=0){
            int remain = number%10;
            System.out.println(remain);
            number/=10;
        }
    }
}
/*
Enter the number : 65487
7
8
4
5
6
*/