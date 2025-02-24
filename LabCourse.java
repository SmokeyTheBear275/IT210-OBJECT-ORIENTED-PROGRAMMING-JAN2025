/**
 * Hayden Ross
 * M7.4 Programming Assignment 7
 * Define LabCourse
 * subclass of CollegeCourse.Java
 * Establish fee based upon if lab required
 */

//Labcourse is set as a child of CollegeCourse
public class LabCourse extends CollegeCourse{

    //Reference parent constructor and adjust the fee for the lab
    public LabCourse(String dept, int courseNum, int credits) {
        super(dept, courseNum, credits)
        this.fee = (credits * 120) + 50;
    }

    //Override the display function if it is a lab course and display the accurate data
    @Override
    public void display() {
        super.display();
        System.out.println("\n Department: " + dept);
        System.out.println("\n Course Number: " + courseNum);
        System.out.println("\n Credits: " + credits);
        System.out.println("\n This is a lab course");
        System.out.println("\n Fee: $" + fee);
    }

}
