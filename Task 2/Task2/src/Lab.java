import java.util.Scanner;
/*
Name: Ohm Patel
Description: User enters value for n which is used in a math equation
 */
public class Lab {
    public static void main(String[] args) {

        //Declare a new scanner
        Scanner scanner = new Scanner(System.in);

        //User enters a value for n
        System.out.print("Enter a value for n");
        int n = scanner.nextInt();

        //Prints the equation with the use of n
        System.out.println("The answer to the equation is: ");
        System.out.println(((n + 1) * n + 2) * n + 3);
    }
}
