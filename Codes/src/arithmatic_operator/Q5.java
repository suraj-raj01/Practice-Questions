/*
5. Write a program that reads in the radius and length of a cylinder and computes the area and volume using the
   following formulas:
    ```
        area = radius * radius * π
        volume = area * length

        value of π (PI) is  3.14
    ```
    ```
        Sample Run
        INPUT
        Enter the radius of a cylinder: 5.5
        Enter the length of a cylinder: 12

        OUTPUT
        The area is 95.0331
        The volume is 1140.4
    ```
*/
package arithmatic_operator;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
    float radius,length;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of cylinder : ");
        radius = scanner.nextFloat();
        System.out.print("Enter the length of cylinder : ");
        length = scanner.nextFloat();
        float area = (radius*radius*3.14f);
        float volume = area*length;
        System.out.println("Area : "+area);
        System.out.println("Volume : "+volume);
    }
}
