/*
2. Write a program print following menu to user:
   ```
     do_while.Q1 Menu:
     Press 1 for Addition,
     Press 2 for Subtraction,
     Press 3 for Multiplication,
     Press 4 fot Division,
     Press 0 to exit
     ```
*/
package do_while_practice;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int input;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                     Press 1 for Addition,
                     Press 2 for Subtraction,
                     Press 3 for Multiplication,
                     Press 4 fot Division,
                     Press 0 to exit""");
            System.out.println();
            System.out.print("Input : ");
            input = scanner.nextInt();
            System.out.print("Output : ");
            switch (input){
                case 1:
                    System.out.println("Addition\n");
                    break;
                case 2:
                    System.out.println("Subtraction\n");
                    break;
                case 3:
                    System.out.println("Multiplication\n");
                    break;
                case 4:
                    System.out.println("Division\n");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Enter valid number!!\n");
                    break;
            }
        }while(input>0);
    }
}
