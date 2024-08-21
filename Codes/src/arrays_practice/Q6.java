/*
6. Write a program to create an integer array by accepting the size of the array from user. Initialize the array by accepting values from user.
   Accept `searchElement` form the user and search for `searchElement` in the array. If element present in array print
   found otherwise not found.
    ```text
    Sample run
    int[] numbers = {51, 100, 2, 8 , 45, 7};
    int searchElement = 7;

    Output
    Found
    ```
*/
package arrays_practice;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        // input values
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        // search element
        System.out.print("Enter the search element : ");
        int search = scanner.nextInt();
        // logic for search the element
        boolean response = false;
        for(int i=0; i<size; i++){
            if (arr[i] == search) {
                response = true;
                break;
            }
        }
        if(response){
            System.out.println("Data found!!");
        }else {
            System.out.println("Data not found!!");
        }
    }
}
/*
Enter the size of array : 5
7 4 9 6 5
Enter the search element : 6
Data found!!
*/