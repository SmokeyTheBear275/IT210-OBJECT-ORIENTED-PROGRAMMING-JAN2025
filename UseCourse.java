/**
 * Hayden Ross
 * M7.4 Programming Assignment 7
 * Define UseCourse
 * Take user input with scanner
 * utilize input to display correct data
 */

//Import Scanner
import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args) {

        //Establish Scanner as sc
        Scanner sc = new Scanner(System.in);

        //Ask user for input
        System.out.println("Enter course department (ENG, BIO, ETC): ");
        //Set input to all caps for string
        String dept = sc.nextLine().toUpperCase();
        System.out.println("Enter course number: ");
        int courseNum = sc.nextInt();
        System.out.println("Enter number of credits: ");
        int credits = sc.nextInt();

        //Establish course as an object of CollegeCourse
        CollegeCourse course;

        //Determine if LabCourse else call CollegeCourse
        if (dept.equals("BIO") || dept.equals("CHM") || dept.equals("CIS") || dept.equals("PHY")) {
            course = new LabCourse(dept, courseNum, credits);
        } else {
            course = new CollegeCourse(dept, courseNum, credits);
        }

        //Call display function from course which is either a LabCourse or CollegeCourse
        course.display();
    }
}
