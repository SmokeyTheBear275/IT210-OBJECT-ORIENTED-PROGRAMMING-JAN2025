import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Hayden Ross
 * M2.4 Programming Assignment 2
 * intake name, material cost, and hours to build
 * using this information calculate retail price with a discount
 * I set the numbers in all the math to variables so they can be easily changed like discount percentage
 * I also added error checks to input because I was curious how to do it
 */

public class CraftPricing
{
    public static void main(String[] args)
    {
        //define variables
        double costOfMaterial;
        double hoursOfWork;
        double hourlyWage = 14;
        double discountPercentage = 25;
        double retailPrice;
        double shippingCost = 6;
        String productName;

        //create scanner
        Scanner keyboard = new Scanner(System.in);

        //get product name
        System.out.println("Enter the product name: ");
        productName = keyboard.nextLine();

        //get material cost and determine it is a double / integer then re-ask for proper input
        while (true) {
            System.out.println("Enter the material cost: ");
            try {
                costOfMaterial = Double.parseDouble(keyboard.nextLine());
                break;
            }
            catch (NumberFormatException ignore) {
                System.out.println("Error not a number");
            }
        }

        //get hours of work and determine it is a double / integer then re-ask for proper input
        while (true) {
            System.out.println("Enter the hours of work: ");
            try {
                hoursOfWork = Double.parseDouble(keyboard.nextLine());
                break;
            }
            catch (NumberFormatException ignore) {
                System.out.println("Error not a number ");
            }
        }


        retailPrice = calculateCost(costOfMaterial, hoursOfWork, hourlyWage, discountPercentage, shippingCost);

        //define decimal format to look like money for display to user
        DecimalFormat money = new DecimalFormat(".00");

        System.out.println("The price of " + productName + " is $" + money.format(retailPrice));

    }

    static double calculateCost(double costOfMaterial, double hoursOfWork, double hourlyWage,
                                double discountPercentage, double shippingCost)
    {
        return (((100 - discountPercentage) / 100) * (costOfMaterial + (hourlyWage * hoursOfWork))) + shippingCost;
    }
    
}
