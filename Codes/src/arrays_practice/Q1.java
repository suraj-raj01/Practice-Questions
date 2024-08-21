/*
1. Write a program to create an integer array to store 5 integers. Accept the five integer values from user and print them on console.
*/
package arrays_practice;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the 5 integer values : ");
        // input
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        // output
        for(int values:arr){
            System.out.print(values+" ");
        }
    }
}
/*
Enter the 5 integer values :
5 7 8 9 6
5 7 8 9 6
*/