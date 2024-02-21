import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        int principle = scanner.nextInt();
        System.out.println("Your principle is " + principle);

        System.out.print("Annual Interest rate: ");
        float interest = scanner.nextFloat();
        System.out.println("Your annual interest rate is " + interest);

        System.out.print("Mortage period (years): ");
        int years = scanner.nextInt();
        System.out.println("Mortgage spread over " + years + " years");
    }
}