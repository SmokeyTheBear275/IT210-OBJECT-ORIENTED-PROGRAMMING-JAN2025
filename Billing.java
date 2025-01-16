
/**
 * Hayden Ross
 * M3.4 Programming Assignment 2
 * Create four overloaded methods for computing price
 * 
 * I set the numbers in all the math to variables so they can be easily changed like discount percentage
 * I also added error checks to input because I was curious how to do it
 */

public class CraftPricing
{
    public static void main(String[] args)
    {
        //define variables
        double price
        double quantity
        double couponValue
        double weeklyDiscount

        //create scanner
        Scanner keyboard = new Scanner(System.in);

        //get price and determine it is a double / integer then re-ask for proper input
        while (true) {
            System.out.println("Enter book cost: ");
            try {
                price = Double.parseDouble(keyboard.nextLine());
                break;
            }
            catch (NumberFormatException ignore) {
                System.out.println("Error not a price");
            }
          }

  
