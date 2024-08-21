// Write a program to calculate numberpower (number raised to the power) using a loop. Accept the number and power from user.
package while_loop_practice;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent : ");
        int exp = scanner.nextInt();
        int temp = exp;
        int answer=1;
        while(exp>0){
            answer*=base;
            exp--;
        }
        System.out.println(temp+" to the power "+base+" = "+answer);
    }
}
/*
Enter the base : 3
Enter the exponent : 3
3 to the power 3 = 27
*/