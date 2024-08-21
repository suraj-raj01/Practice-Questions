// Generate the multiplication table for a given number N up to 10. Accept the number N from user.
package while_loop_practice;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int table = scanner.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(table+" * "+i+" = "+i*table);
            i++;
        }
    }
}
/*
Enter the number : 14
14 * 1 = 14
14 * 2 = 28
14 * 3 = 42
14 * 4 = 56
14 * 5 = 70
14 * 6 = 84
14 * 7 = 98
14 * 8 = 112
14 * 9 = 126
14 * 10 = 140
*/