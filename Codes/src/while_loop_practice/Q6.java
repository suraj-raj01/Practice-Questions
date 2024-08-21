// Write a program to print the first N numbers in the Fibonacci sequence. Accept the number N from user. Constrain N >= 0 and N <= 20. (keep value of N small. )
package while_loop_practice;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        int first=0;
        int second=1;
        int third=0;
        System.out.print("Fibonacci Series : ");
        System.out.print(first+" ");
        System.out.print(second+" ");
        int i=2;
        while (i<=number){
            third = first+second;
            System.out.print(third+" ");
            first = second;
            second = third;
            i++;
        }
    }
}

/*
Enter the number : 10
Fibonacci Series : 0 1 1 2 3 5 8 13 21 34 55
*/