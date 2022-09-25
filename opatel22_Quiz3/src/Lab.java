import java.util.Scanner;
/*
Name: Ohm Patel
Description: Converts feet to meters
 */
public class Lab {
    public static void main(String[] args) {

        //Declare a new scanner
        Scanner scanner = new Scanner(System.in);

        //Ask user to input a value for feet
        System.out.println("Enter a value for feet: ");
        double input = scanner.nextDouble();

        //Converts the inputted value for feet into meters
        double feetToMeters = input * 0.305;

        //Prints the conversion of feet to meters
        System.out.println(input + " feet is " + feetToMeters + " meters");


    }
}
