import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        int principle = scanner.nextInt();
        System.out.println("Your principle is £" + principle);

        System.out.print("Annual Interest rate: ");
        float interest = scanner.nextFloat();
        System.out.println("Your annual interest rate is " + interest + "%");

        System.out.print("Mortage period (years): ");
        int years = scanner.nextInt();
        System.out.println("Mortgage spread over " + years + " years");

        byte monthsInYear = 12;
        int numberOfPayments = years * monthsInYear;
        float monthlyInterest = interest / 100 / monthsInYear;

        double topline = monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments);
        double bottomline = Math.pow(1 + monthlyInterest, numberOfPayments) - 1;
        double mortgage = principle * (topline / bottomline);

        System.out.print("Your mortgage will be £" + mortgage);
        System.out.flush();
    }
}