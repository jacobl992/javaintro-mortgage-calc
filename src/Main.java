import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte MONTHS_IN_YEAR = 12;
        int principal = 0;
        float interest = 0;
        int years = 0;
        int numberOfPayments = 0;

        while (true) {
            System.out.print("Principle (1000 - 1000000): ");
             principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000_000) {
                break;
        } else {
                System.out.println("Enter a number between 1000 and 1000000");
            }
        }
        System.out.println("Your principle is £" + principal);

        while (true) {
            System.out.print("Annual Interest rate: ");
            interest = scanner.nextFloat();
            if (interest > 0 && interest <= 30) {
                break;
            } else {
                System.out.println("Enter a number between 0 and 30");
            }
        }
        System.out.println("Your annual interest rate is " + interest + "%");

        while (true) {
        System.out.print("Mortage period (years): ");
        years = scanner.nextInt();
            if (years > 0 && years <= 50) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            } else {
                System.out.println("Enter a number between 1 and 50");
            }
        }
        System.out.println("Mortgage spread over " + years + " years");

        float monthlyInterest = interest / 100 / MONTHS_IN_YEAR;
        double topline = monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments);
        double bottomline = Math.pow(1 + monthlyInterest, numberOfPayments) - 1;
        double mortgage = principal * (topline / bottomline);

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Your mortgage will be £" + df.format(mortgage));
        System.out.flush();
    }
}