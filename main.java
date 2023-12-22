public class main {

    public static void main(String[] args) {

        Car car = new Car(4554, "BMV", "X2 xDrive18d", 2022, 50, 30);
        car.displayInfo();
        car.startEngine();
        car.stopEngine();
        car.accelerate(20);
        car.refuel(10);

        /*Aircraft aircraft = new Aircraft(65268, "Boeing", "T7", 2020, 5000);
        aircraft.displayInfo();
        aircraft.startEngine();
        aircraft.takeOff();
        aircraft.stopEngine();
        aircraft.displayInfo();
        aircraft.land();
        aircraft.stopEngine();*/

        Boat boat = new Boat(45715, "Bavaria", "R40 Coupe", 2019, 350);
        boat.startEngine();
        boat.startSwimming();
        boat.stopSwimming();
        boat.stopSwimming();
        boat.displayInfo();

    }
}
