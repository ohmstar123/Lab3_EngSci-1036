import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {

        //Declare a new scanner
        Scanner scanner = new Scanner(System.in);

        //Writes down number that user inputs in a double variable
        double number = scanner.nextDouble();

        //Converts double variable to an int variable
        int b = (int) number;

        //Does the math in order to figure out the number after the decimal point
        double point = (10 * number - 10 * b) / 10;

        //Print the output
        System.out.printf(b + "\n" + point);
    }
}
