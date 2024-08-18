/*
2. Write a program to accept `int side` of a Square from user. Calculate `int area` and `int perimeter` of square. Print
   the `area` and `perimeter` on the console.
    ```
        Formula to calculate area of square -> side * side
        Formula to calculate area of square -> 4 * side
    ```
*/
package arithmatic_operator;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side : ");
        int side = scanner.nextInt();
        int areaSquare = side*side;
        int perimeter = 4*side;
        System.out.println("Area of square : "+areaSquare);
        System.out.println("Area of Perimeter : "+perimeter);
    }
}
