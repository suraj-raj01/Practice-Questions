package arrays_practice;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        // input values
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        // search element
        System.out.print("Enter the search element : ");
        int search = scanner.nextInt();
        // search element logic
        for(int i=0; i<size; i++){
            if(arr[i]==search){
                System.out.println("Index : "+i);
                break;
            }
        }
    }
}
