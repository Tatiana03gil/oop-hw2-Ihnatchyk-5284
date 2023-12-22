public class Car extends Vehicle {

    public int fuelCapacity;
    public int currentFuelLevel;

    public Car (int id, String brand, String model, int year, int fuelCapacity, int currentFuelLevel) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public void displayInfo() {
        System.out.println("Идентификатор автомобиля: " + id +
                "\n Марка автомобиля: " + brand +
                "\n Модель автомобиля: " + model +
                "\n Год выпуска: " + year +
                "\n Емкость топливного бака: " + fuelCapacity +
                "\n Текущий уровень топлива: " + currentFuelLevel);
    }

    @Override
    public void startEngine() {
        System.out.println("Запуск двигателя автомобиля");
    }

    @Override
    public void stopEngine() {
        System.out.println("Остановка двигателя автомобиля");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Скорость увеличена на " + speed + " км/ч");
    }

    @Override
    public void brake() {
        System.out.println("Автомобиль остановился");
    }

    public void refuel(int liters) {
        if (currentFuelLevel + liters <= fuelCapacity) {
            System.out.println("Автомобиль заправлен на " + liters +" л");
            currentFuelLevel =+ liters;
        }
        else {
            System.out.println("Бак заполнен до предела! \n Осталось в запасе " + 
                                (currentFuelLevel + liters - fuelCapacity) + " л топлива");

        }
    }
}