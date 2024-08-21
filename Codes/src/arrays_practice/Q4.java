/*
4. Write a program to create an integer array and initialize it with values `{51, 100, 2, 8 , 45, 7}`. Increase the value of all the odd elements of the array and decrease the value of all the even elements of the array.
*/
package arrays_practice;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {51, 100, 2, 8 , 45, 7};
        System.out.println("Original Array elements");
        for(int value:arr){
            System.out.print(value+" ");
        }
        System.out.println("\nAfter increasing value of odd numbers\nAnd Decreasing value of even numbers");
        for(int data:arr){
            if(data%2!=0){
                data++;
                System.out.print(data+" ");
            }else {
                data--;
                System.out.print(data + " ");
            }
        }
    }
}
/*
Original Array elements
51 100 2 8 45 7
After increasing value of odd numbers
And Decreasing value of even numbers
52 99 1 7 46 8
*/