public class TestAutomobile {
    public static void main(String[] args) {
        //make custom automobiles
        Automobile car1 = new Automobile(1,"Ford","F250","Black",2015,"1FMZU73E0FFA69101",17,0 );
        Automobile car2 = new Automobile(12,"Subaru","WRX", "Silver", 2017, "JF1VA2V65H9808806", 30,0);
        Automobile car3 = new Automobile(123,"Chevrolet","Corvette","Dark Grey",2016,"1G1YM2D72G5116297",18,0);

        //Print current vehicles
        System.out.println( "CAR 1 ID:" + car1.idNumber + " Make:" +  car1.make + " Model:" +  car1.model + " Color:" +  car1.color + " Year:" +  car1.year + " VIN:" +  car1.vin + " MPG:" +  car1.mpg + " Speed:" + car1.speed);
        System.out.println( "CAR 2 ID:" + car2.idNumber + " Make:" +  car2.make + " Model:" +  car2.model + " Color:" +  car2.color + " Year:" +  car2.year + " VIN:" +  car2.vin + " MPG:" +  car2.mpg + " Speed:" + car2.speed);
        System.out.println( "CAR 3 ID:" + car3.idNumber + " Make:" +  car3.make + " Model:" +  car3.model + " Color:" +  car3.color + " Year:" +  car3.year + " VIN:" +  car3.vin + " MPG:" +  car3.mpg + " Speed:" + car3.speed);

        //Accelerate
        car1.accelerate(3);
        car2.accelerate();
        car3.accelerate(7);

        //Print speed
        System.out.println("Accelerating");
        System.out.println("Car 1 Speed:" + car1.speed);
        System.out.println("Car 2 Speed:" + car2.speed);
        System.out.println("Car 3 Speed:" + car3.speed);

        //Brake
        car1.brake(3);
        car2.brake();
        car3.brake(7);

        //Print speed
        System.out.println("Braking");
        System.out.println("Car 1 Speed:" + car1.speed);
        System.out.println("Car 2 Speed:" + car2.speed);
        System.out.println("Car 3 Speed:" + car3.speed);
    }
}
