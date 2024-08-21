/*
2. Write a program to create an integer array and initialize it with values `{51, 100, 2, 8 , 45, 7}`. Print the size of array using length property of array and also calculate and print the sum and average of all the elements of the array.
*/
package arrays_practice;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {51, 100, 2, 8 , 45, 7};
        int sum=0;
        for(int values:arr){
            sum+=values;
        }
        System.out.println("Length of array : "+arr.length);
        System.out.println("Sum is : "+sum);
        int average = sum/arr.length;
        System.out.println("Average : "+average);
    }
}
/*
Length of array : 6
Sum is : 213
Average : 35
*/