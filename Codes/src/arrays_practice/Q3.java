/*
3. Write a program to create an integer array and initialize it with values `{51, 100, 2, 8 , 45, 7}`. Print all the even element of the array.
*/
package arrays_practice;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {51, 100, 2, 8 , 45, 7};
        for(int values:arr){
            if(values%2==0){
            System.out.print(values+" ");
        }
    }
    }
}
/*
100 2 8
*/