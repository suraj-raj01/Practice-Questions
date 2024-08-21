package arrays_practice;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        // input value
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        // logic for print index of maxElement and minElement
        int min=arr[0];
        int max=0;
        int indexOfMinElement=0;
        int indexOfMaxElement=0;
        for(int i=0; i<size; i++){
            if(arr[i]>max){
                max = arr[i];
                indexOfMaxElement = i;
            }
            if(arr[i]<min){
                min = arr[i];
                indexOfMinElement = i;
            }
        }
        System.out.println("indexOfMaxElement = " + indexOfMaxElement);
        System.out.println("indexOfMinElement = " + indexOfMinElement);
    }
}

/*
Enter the size of array : 10
45 68 2 75 48 35 21 43 60 71
indexOfMaxElement = 3
indexOfMinElement = 2
*/