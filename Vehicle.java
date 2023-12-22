public abstract class Vehicle {
    
protected int id;
protected String brand;
protected String model;
protected int year;

public void startEngine() {};

public void stopEngine() {};

public void accelerate(int speed) {};

public void brake() {};

public abstract void displayInfo();
}
