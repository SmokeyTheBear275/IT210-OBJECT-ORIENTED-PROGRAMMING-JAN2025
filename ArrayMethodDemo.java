import java.util.ArrayList;
import java.util.List;

/**
 * Hayden Ross
 * M6.4 Programming Assignment 6
 * Establish an array with 10 integers
 * Establish 5 methods to display in order, display in reverse order, display sum,
 * display all values based upon an argument, display all values higher than average value
 * Then create another array with 5 integers
 * make another method that checks both arrays for matching values and display them or lack of them
 */


public class ArrayMethodDemo {

    public static void main(String[] args) {

        //Establish first array of 10 integers
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Call the 5 methods for displaying array 1 and title before each display
        System.out.print("Array\n");
        printArray(array1);
        System.out.print("\n\nArray Reversed\n");
        printArrayReverse(array1);
        System.out.print("\n\nArray Sum\n");
        printArraySum(array1);
        System.out.print("\nArray Values Less Than 6\n");
        printArrayLessThan(array1, 6);
        System.out.print("\n\nArray Values higher than average\n");
        printArrayHigherThanAvg(array1);

        //Establish second array of 5 integers that don't match any of array 1
        int[] array2 = {20, 30, 40, 50, 60};

        //Call the method to check arrays against each other to see if they share any values
        System.out.print("\n\nArray Values that match in both arrays\n");
        printArrayCommonInt(array1, array2);

    }
        //First method print array in order
        public static void printArray ( int[] array){
            for (int num : array) {

                System.out.print(num + " ");
            }
        }


        //Second method print array in reverse
        public static void printArrayReverse ( int[] array){
            for (int i = array.length - 1; i >= 0; i--) {

                System.out.print(array[i] + " ");

            }
        }

        //Third method print sum of array
        public static void printArraySum ( int[] array){
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            System.out.println("The sum of the array is: " + sum);
        }

        //Fourth method print array values less than set number
        public static void printArrayLessThan ( int[] array, int limit){
            for (int num : array) {
                if (num < limit) {
                    System.out.print(num + " ");
                }
            }
        }

        //Fifth method to calculate sum, then average from sum and array length, then display numbers over that average
        public static void printArrayHigherThanAvg ( int[] array){
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            double average = (double) sum / array.length;
            for (int num : array) {
                if (num > average) {
                    System.out.print(num + " ");
                }
            }
        }

        //Last method to check both arrays for shared integers and display them or display if there are no shared values
        public static void printArrayCommonInt ( int[] array1, int[] array2){
            List<Integer> CommonInt = new ArrayList<Integer>();
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        CommonInt.add(array1[i]);
                    }
                }
            }
            if (CommonInt.isEmpty()) {
                System.out.println("No Common Integer Found");
            }
            else {
                System.out.println("Common Int: " + CommonInt);
            }
        }



}
