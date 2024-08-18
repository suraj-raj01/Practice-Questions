/*
4. Write a program that converts inches to centimeters. For example, if the user enters 16.9 for a `length` in inches,
   the output would be 42.926 cm. (One inch equals 2.54 centimeters). Select appropriate datatype to hold `length` in
   inches and `result` in centimeters. Accept `length` from user. And display the output as
   ```16.9 inches = 42.926 centimeters```
    ```
    Sample Run:
    input
    Enter length in inches: 16.9
    output
    16.9 inches = 42.926 centimeters.
    ```
*/
package arithmatic_operator;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in inches : ");
        float inch = scanner.nextFloat();
        float centimeter = inch*2.54f;
        System.out.println(inch+" inches = "+centimeter+" centimeter");
    }
}
