import java.util.Scanner;

public class Main {
    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer:");
        int MPG = scanner.nextInt();
        if (MPG <= 100 && MPG > 0)
            System.out.print("");
        else {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            System.exit(0);
        }
        System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number:");
        double tankCapacity = scanner.nextDouble();
        if (tankCapacity > 0)
            System.out.print("");
        else {
            System.out.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ARE ACCEPTED FOR TANK CAPACITY!!!");
            System.exit(0);
        }
        System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%)");
        double percentage= scanner.nextDouble();
        if (percentage >=0 && percentage <= 100)
            System.out.print("");
        else {
            System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER BETWEEN 0 AND 100 (INCLUSIVE)");
            System.exit(0);
        }
        double rawRange = (MPG * tankCapacity * (percentage * .01));
        if (rawRange <= 25)
        System.out.println("Attention! Your current estimated range is running low: " + (int)rawRange + " miles left!!!");
        else {
            System.out.println("Keep driving! Your current estimated range is " + (int)rawRange + " miles!");
        }
    }

}