/*
6. Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and
   displays the result. The formula for the conversion is as follows:
    ```
        Fahrenheit = (9 / 5) * celsius + 32
        Hint: In Programming, 9 / 5 is 1, but 9.0 / 5 is 1.8.
    ```
    ```
    Sample Run
    Input
    Enter a degree in Celsius: 43
    Output
    43 Celsius is 109.4 Fahrenheit
    ```
*/
package arithmatic_operator;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius:");
        float celsius = scanner.nextInt();
        float fahrenheit = (9/5f)*celsius+32;
        System.out.println(celsius+" Celsius is equal to "+ fahrenheit+" Fahrenheit");
    }
}
