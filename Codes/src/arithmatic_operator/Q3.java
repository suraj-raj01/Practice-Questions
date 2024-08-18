/*
3. Write a program to accept `int length` and `int breadth` of rectangle from user. Calculate `int area` and
   `int perimeter` of rectangle. Print the `area` and `perimeter` on the console.
    ```
        Formula to calculate area of square -> length * breadth
        Formula to calculate area of square -> 2 * (length + breadth)
    ```
*/
package arithmatic_operator;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int length,breadth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");
        length = scanner.nextInt();
        System.out.println("Enter the breadth of rectangle : ");
        breadth = scanner.nextInt();
        int areaRectangle = length*breadth;
        int perimeterRectangle = 2 * (length+breadth);
        System.out.println("Area of rectangle : "+areaRectangle);
        System.out.println("Perimeter of rectangle : "+perimeterRectangle);
    }
}
