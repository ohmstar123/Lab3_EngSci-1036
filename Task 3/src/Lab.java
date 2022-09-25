import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {

        //Declare a new scanner
        Scanner scanner = new Scanner(System.in);

        //Places the inputted number by the user in the variable d
        int d = scanner.nextInt();
        //Takes the modulus of d when it is divided by 10
        int firstNumber = d % 10;
        //Divides d by 10
        int secondNumber = d / 10;

        //Prints the number with the two digits swapped around
        System.out.print(firstNumber + " <-> " + secondNumber);
    }
}
