/**
 * Hayden Ross
 * M5.4 Programming Assignment 5
 * Define needed variables
 * print out a formated header to make sense of data
 * print out formated data in a loop until conditions meet
 * print out amount of times FOR loop ran as years
 */

public class Population_for {
    public static void main(String[] args) {
    //Define Variables for initial population, growth rates, and year
    double popMexico = 121000000;
    double popUSA = 315000000;
    double popJapan = 127000000;
    double growthMexico = 1.0105;
    double growthUSA = 0.9984;
    double growthJapan = 1.0101;
    double year = 0;

    //Print formated header for ease of viewing data prior to loop
    System.out.printf("%8s%22s%22s%22s\n","Year","USA Population","Mexico Population","Japan Population");

    //FOR loop for population change until USA pop is lowest of all
    for (;popUSA > popMexico && popUSA > popJapan; year++) {

        //Change populations
        popUSA *= growthUSA;
        popMexico *= growthMexico;
        popJapan *= growthJapan;

        //Print formated numbers
        System.out.printf("%8.0f%,22.0f%,22.0f%,22.0f\n",year,popUSA,popMexico,popJapan);
    }

    //Upon completion of loop print out amount of years after an extra line space for ease of viewing
    System.out.printf("\nIt took %2.0f years for Mexico and Japan to surpass the American population ",year);

}
}

