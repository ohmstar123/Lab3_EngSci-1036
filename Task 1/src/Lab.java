import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter first integer");
        int a = scanner.nextInt();

        System.out.println("Enter second integer");
        int b = scanner.nextInt();


        System.out.println(Math.pow(a, 2) + Math.pow(b, 2));

    }
}
