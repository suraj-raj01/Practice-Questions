/*
5. Write a program to create an integer array by accepting the size of the array from user. Initialize the array by
   accepting values from user.
   Find the maximum element from the array and print it on console.
    ```text
    Sample run
    int[] numbers = {51, 100, 2, 8 , 45, 7};
    maximum = 100
    ```
*/
package arrays_practice;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        int max=0;
        for(int i=0; i<size; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Number : "+max);
    }
}
/*
Enter the size of an array : 10
55 41 68 78 21 43 50 73 64 79
Maximum Number : 79
*/