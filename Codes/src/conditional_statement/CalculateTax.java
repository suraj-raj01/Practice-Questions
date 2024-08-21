package conditional_statement;/*
11. Write a program to accept the annual income from the user and calculate tax based of the below conditions:

In each case provide standard deduction of 50,000 INR, calculate taxable income by subtracting 50,000 form annual income.
if the taxable income is:
less than equal to 3,00,000 INR tax rate will be 0%.
greater than 3,00,000 INR and less than or equal to 5,00,000 INR tax rate will be 5%.
greater than 5,00,000 INR and less than or equal to 10,00,000 INR tax rate will be 15%.
greater than 10,00,000 INR and less than or equal to 15,00,000 INR tax rate will be 20%.
greater than 15,00,000 INR and less than or equal to 25,00,000 INR tax rate will be 25%.
greater than 25,00,000 INR tax rate will be 30%.
On the basis of the condition calculate tax amount and print.
*/

import java.util.Scanner;

public class CalculateTax {
    public static void main(String[] args) {
        int anualIncome;
        float tax = 0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the AnualIncome: ");
        anualIncome = sc.nextInt();
        if(anualIncome<=300000)
        {
            tax = anualIncome*0.00f;
            anualIncome -= (int) tax;
            System.out.println("Tax amount : "+tax);
        }
        else if(anualIncome<=500000)
        {
            tax = anualIncome*0.05f;
            anualIncome -= (int) tax;
            System.out.println("Tax amount : "+tax);
        }
        else if(anualIncome<=1000000)
        {
            tax = anualIncome*0.15f;
            anualIncome -= (int) tax;
            System.out.println("Tax amount : "+tax);
        }
        else if(anualIncome<=1500000)
        {
            tax = anualIncome*0.20f;
            anualIncome -= (int) tax;
            System.out.println("Tax amount : "+tax);
        }
        else if(anualIncome<=2500000)
        {
            tax = anualIncome*0.25f;
            anualIncome -= (int) tax;
            System.out.println("Tax amount : "+tax);
        }
        else {
            tax = anualIncome*0.30f;
            anualIncome -= (int) tax;
            System.out.println("Tax amount : "+tax);
        }
        sc.close();
    }
}
