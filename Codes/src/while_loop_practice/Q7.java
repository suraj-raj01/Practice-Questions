//Write a program to print the sum of first N numbers in the Fibonacci sequence. Accept the number N from user. Constrain N >= 0 and N <= 20. (keep value of N small. )
package while_loop_practice;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        int first=0;
        int second=1;
        System.out.print(first+" + "+second+" + ");
        int third;
        int sum=first+second;
        int i=2;
        while(i<number){
            third = first+second;
            System.out.print(third);
            if(i<number-1){
                System.out.print(" + ");
            }
            sum+=third;
            first = second;
            second = third;
            i++;
        }
        System.out.print(" = "+sum);
    }
}
/*
Enter the number : 8
0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 = 33
*/