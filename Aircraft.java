public class Aircraft extends Vehicle implements Flyable {

    public int maxAltitude;
    protected boolean isFlying;

    public Aircraft (int id, String brand, String model, int year, int maxAltitude) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxAltitude = maxAltitude;
        this.isFlying = false;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Идентификатор самолета: " + id +
                "\n Марка самолета: " + brand +
                "\n Модель самолета: " + model +
                "\n Год выпуска: " + year +
                "\n Максимальная высота полета: " + maxAltitude +
                "\n Самолет в воздухе: " + isFlying);
    }

    @Override
    public void startEngine() {
        if (isFlying == true) System.out.println("Cамолет уже в воздухе!");
        else System.out.println("Запуск двигателя самолета");
    }

    @Override
    public void stopEngine() {
        if (isFlying == true) System.out.println(" Warning! Cамолет в воздухе!");
        else System.out.println("Остановка двигателя самолета");
    }

    @Override
    public void takeOff () {
        if (isFlying == false) {
        System.out.println("Взлет самолета");
        isFlying = true;
        }
    }

    @Override
    public void land () {
        if (isFlying == true) {
        System.out.println("Посадка самолета");
        isFlying = false;
        }
    } 
}
