/*
Write a program to check if a given three-digit number N is an Armstrong number if yes, print Armstrong number otherwise print Not an Armstrong number. Accept the three-digit number N from user.
*/
package while_loop_practice;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three-digit number : ");
        int number = scanner.nextInt();
        int temp=number;
        int sum=0;
        while (temp!=0){
            int remain = temp%10;
            sum+= remain*remain*remain;
            temp/=10;
        }
        if(sum==number){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
/*
Enter three-digit number : 371
Armstrong number

"OR"

Enter three-digit number : 543
Not an Armstrong number
*/