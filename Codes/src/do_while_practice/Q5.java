/*
5. Write a program to accept number from user, until user press 0 to exit. Print the count of all the entered even
   number exclude 0.
*/
package do_while_practice;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int input;
        int count=0;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer number, Press 0 to exit");
            input = scanner.nextInt();
            if(input%2==0){
                if(input==0){
                    continue;
                }
                count++;
            }
        }while (input>0);
        System.out.println("Count : "+count);
    }
}
