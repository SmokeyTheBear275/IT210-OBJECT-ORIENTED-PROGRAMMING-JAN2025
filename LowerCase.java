import java.io.*;
import java.util.Scanner;

/**
 * Hayden Ross
 * M7.4 Programming Assignment 7
 * Define LabCourse
 * subclass of CollegeCourse.Java
 * Establish fee based upon if lab required
 */

public class LowerCase {
    public static void main(String[] args) throws IOException {

        //Identify input file and create file object for input
        File inputFile = new File("Input.txt");

        //Create output file
        File outputFile = new File("Output.txt");

        //Create buffered reader and file reader for input file object
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));

        //Create print writer and file writer to write the text to output file
        PrintWriter printWriter = new PrintWriter(new FileWriter(outputFile));

        //Create string variable to hold text from readers
        String text = null;

        //Create loop (while) to read until end of file (!= null) using the bufferedReader.
        while ((text = bufferedReader.readLine()) != null) {
            //Use printWriter to take input text and make lowercase
            printWriter.write(text.toLowerCase());
            //At end of each line printWriter will write a new line to maintain lines from original text
            printWriter.println();
        }

        //close reader, writer, and scanner
        bufferedReader.close();
        printWriter.close();

    }

}
