package arrays_practice;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        // input values
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        // logic for find minimum number from array
        int min=arr[0];
        for(int i=1; i<size; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element : "+min);
    }
}
/*
Enter the size of array : 10
87 4 56 78 14 25 71 65 14 27
Minimum element : 4
*/