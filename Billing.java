
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
        double price;
        int quantity;
        double couponValue;
        double weeklyDiscount;
        boolean ynQuantity; 
        boolean ynCouponValue;
        boolean ynWeeklyDiscount;

        //create scanner
        Scanner in = new Scanner(System.in);

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
        while (ynQuantity)
        {
            System.out.println("Enter the amount of books: ");
            try {
                quantity = Integer.parseInt(keyboard.nextLine());
                break;
            }
            catch (NumberFormatException ignore) {
                System.out.println("Error not a number");
            }
        }

        //ask if there is a coupon present
        System.out.println("Is there a coupon? y/n");
        while (true) {
        answer = in.nextLine().trim().toLowerCase();
        if (answer.equals("y")) {
            ynCouponValue = true;
            break;
            } 
        else if (answer.equals("n")) {
            ynCouponValue = false;
            break;
            } 
        else {
            System.out.println("Answer y/n");
            }
        }
        
        //If there is a coupon how much is it worth
        while (ynCouponValue)
        {
            System.out.println("Enter the coupon value: ");
            try {
                couponValue = Double.parseDouble(keyboard.nextLine());
                break;
            }
            catch (NumberFormatException ignore) {
                System.out.println("Error not a number");
            }
        }

        //ask if there is a weekly discount
        System.out.println("Is there a weekly discount? y/n");
        while (true) {
        answer = in.nextLine().trim().toLowerCase();
        if (answer.equals("y")) {
            ynWeeklyDiscount = true;
            break;
            } 
        else if (answer.equals("n")) {
            ynWeeklyDiscount = false;
            break;
            } 
        else {
            System.out.println("Answer y/n");
            }
        }

        //If there is a weekly discount how much is it worth
        while (ynWeeklyDiscount)
        {
            System.out.println("Enter the weekly discount: ");
            try {
                weeklyDiscount = Double.parseDouble(keyboard.nextLine());
                break;
            }
            catch (NumberFormatException ignore) {
                System.out.println("Error not a number");
            }
        }
        
        //define decimal format to look like money for display to user
        DecimalFormat money = new DecimalFormat(".00");

        //begin checking booleans to determine appropriate method and generate more flexibility in the code
        if (!ynQuantity && !ynCouponValue && !ynWeeklyDiscount) {
            System.out.println("The total price is $" + money.format(computeBill(price)));
        }
        
        if (!ynQuantity && ynCouponValue && !ynWeeklyDiscount) {
            System.out.println("The total price is $" + money.format(computeBill(price,1,couponValue)));
        }      

        if (!ynQuantity && ynCouponValue && ynWeeklyDiscount) {
            System.out.println("The total price is $" + money.format(computeBill(price,1,couponValue,weeklyDiscount)));
        }   
        
        if (!ynQuantity && !ynCouponValue && ynWeeklyDiscount) {
            System.out.println("The total price is $" + money.format(computeBill(price,1,0,weeklyDiscount)));
        }   
        
        if (ynQuantity && !ynCouponValue && !ynWeeklyDiscount) {
            System.out.println("The total price is $" + money.format(computeBill(price,quantity)));
        }        
        
        if (ynQuantity && ynCouponValue && !ynWeeklyDiscount) {
            System.out.println("The total price is $" + money.format(computeBill(price,quantity,couponValue)));
        }            

        if (ynQuantity && ynCouponValue && ynWeeklyDiscount) {
            System.out.println("The total price is $" + money.format(computeBill(price,quantity,couponValue,weeklyDiscount)));
        }   
        
        if (ynQuantity && !ynCouponValue && ynWeeklyDiscount) {
            System.out.println("The total price is $" + money.format(computeBill(price,quantity,0,weeklyDiscount)));
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
