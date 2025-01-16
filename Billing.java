
/**
 * Hayden Ross
 * M3.4 Programming Assignment 2
 * Create four overloaded methods for computing price
 * 
 * I set the numbers in all the math to variables so they can be easily changed like discount percentage
 * I also added error checks to input because I was curious how to do it
 */

public class Billing
{
    public static void main(String[] args)
    {
        //define variables
        double price
        int quantity
        double couponValue
        double weeklyDiscount

        boolean ynQuantity
        boolean ynCouponValue
        boolena weeklyDiscount

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

        //ask if buying more than one and set a boolean based on answer.
        System.out.println("Are you buying more than one? y/n");
        while (true) {
        answer = in.nextLine().trim().toLowerCase();
        if (answer.equals("y")) {
            ynQuantity = true;
            break;
            } 
        else if (answer.equals("n")) {
            ynQuantity = false;
            break;
            } 
        else {
            System.out.println("Answer y/n");
            }
        }
        
        //If more than 1 book determine how many
        if (ynQuantity)
        {
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
        }
    }

    //Start of overload computeBill class
static double computeBill (double price)
    {
        return (price*1.085);
    }
static double computeBill (double price, int quantity)
    {
        return ((price*quantity)*1.085);
    }
static double computeBill (double price, int quantity, double couponValue)
    {
        return (((price*quantity)-couponValue)*1.085);
    }
static double computeBill (double price, int quantity, double couponValue, double weeklyDiscount)
    {
        return (((price*quantity)-(couponValue+weeklyDiscount))*1.085);
    }
