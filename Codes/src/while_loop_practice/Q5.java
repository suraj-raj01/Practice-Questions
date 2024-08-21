/*
Write a program that checks if a given integer inputNumber is prime number, if yes print inputNumber is
prime number otherwise print inputNumber is not a prime number. Accept the inputNumber from user.
*/
package while_loop_practice;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        int temp = number;
        int count=0;
        if(number<=1){
            System.out.println("not prime number");
            return;
        }
        while (number>1){
            if(temp%number==0){
                count++;
            }
            number--;
        }
        if(count==1){
            System.out.println("prime number");
        }else{
            System.out.println("not prime number");
        }
    }
}
/*
Enter the number : 43
prime number
*/