/*
4. Write a program to accept number from user, until user press 0 to exit. Print the average of all the entered number.
*/
package do_while_practice;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int input;
        int count=0;
        int sum=0;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer number, Press 0 to exit");
            input = scanner.nextInt();
            if(input>0){
                count++;
            }
            sum+=input;
        }while (input!=0);
        int average = (sum/count);
        System.out.println("Average : "+average);
    }
}
