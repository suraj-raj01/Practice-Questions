/*
7. Average acceleration is defined as the change of velocity divided by the time taken to make the change, as shown in
   the following formula:
    ```
        a = (v1 - v0) / t
    ```
   Write a program that prompts the user to enter the starting velocity v0 in meters/second, the ending velocity v1 in
   meters/second, and the time span t in seconds, and displays the average acceleration.

    ```
    Sample Run
    Input
    Enter v0 : 5.5
    Enter v1 : 50.9
    Enter t  : 4.5

    Output
    The average acceleration is 10.0889
    ```
*/
package arithmatic_operator;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting velocity (V0) in m/s : ");
        float startingVelocity = scanner.nextFloat();
        System.out.print("Enter the ending velocity (V1) in m/s : ");
        float endingVelocity = scanner.nextFloat();
        System.out.print("Enter the time in second : ");
        float time = scanner.nextFloat();
        float averageAcceleration = (endingVelocity-startingVelocity)/time;
        System.out.println("Average Acceleration : "+(averageAcceleration));
    }
}
