/*
10. Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the car in kilometer
    per liter, and the price per liter, and displays the cost of the trip.
    ***Please think of the formula to do calculation.***

    ```
    Sample Run
    Input
        Enter the driving distance: 900.5
        Enter kilometer per liter: 18.5
        Enter price per liter: 106.55
    Output
        The cost of driving is 5186.3932
    ```
*/
package arithmatic_operator;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the driving distance (km) : ");
        float distance = scanner.nextFloat();
        System.out.print("Enter km per liter (mileage) : ");
        float mileage = scanner.nextFloat();
        System.out.print("Enter price per liter : ");
        float price = scanner.nextFloat();
        float costOfDriving = (distance/mileage)*price;
        System.out.print("The cost of driving is : "+costOfDriving);
    }
}
