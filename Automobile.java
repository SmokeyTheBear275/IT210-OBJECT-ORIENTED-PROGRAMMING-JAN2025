import java.util.Scanner;

// define automobile and establish base variables, then create constructor with arguments for idnumber, year, and mpg

public class Automobile {

        // Define Variables and establish scanner

        Scanner sc = new Scanner(System.in);
        int idNumber;
        String make;
        String model;
        String color;
        int year;
        String vin;
        double mpg;
        double speed;

        //constructor
        public Automobile(int idNumber, String make, String model, String color, int year, String vin, double mpg, double speed) {
            this.idNumber = idNumber;
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.vin = vin;
            this.mpg = mpg;
            this.speed = 0;
                    if (idNumber < 0 || idNumber > 9999) {
                        idNumber = 0;
                    }
                    if (year < 2000 || year > 2017) {
                        year = 0;
                    }
                    if (mpg < 10 || mpg > 60) {
                        mpg = 0;
                    }
        }

        //accelerate and brake methods
        public void accelerate () {
            this.speed += 5;
        }
        public void accelerate(int increase){
            this.speed += increase;
        }
        public void brake () {
            this.speed -= 5;
        }
        public void brake(int decrease){
            this.speed -= decrease;
        }

}

