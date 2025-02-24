/**
 * Hayden Ross
 * M7.4 Programming Assignment 7
 * Define CollegeCourse class
 * Establish data fields
 * Establish constructor
 * Establish display method
 */

public class CollegeCourse {

    //Establish data fields
    private String dept;
    private int courseNum;
    private int credits;
    public double fee;

    //Establish Constructor
    public CollegeCourse(String dept, int courseNum, int credits) {
        this.dept = dept;
        this.courseNum = courseNum;
        this.credits = credits;
        this.fee = credits * 120;
    }

    //Establish display parent method
    public void display() {
        System.out.println("\n Department: " + dept);
        System.out.println("\n Course Number: " + courseNum);
        System.out.println("\n Credits: " + credits);
        System.out.println("\n Fee: $" + fee);
    }


}
