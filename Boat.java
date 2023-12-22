public class Boat extends Vehicle implements Swimmable {

    public int maxSpeed;
    protected boolean isSailing;

    public Boat(int id, String brand, String model, int year, int maxSpeed) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.isSailing = false;
    }

    @Override
    public void displayInfo() {
        System.out.println("Идентификатор лодки: " + id +
                "\n Марка лодки: " + brand +
                "\n Модель лодки: " + model +
                "\n Год выпуска: " + year +
                "\n Максимальная скорость на воде: " + maxSpeed +
                "\n Движение по воде: " + isSailing);
    }

    @Override
    public void startEngine() {
        System.out.println("Запуск двигателя лодки");
    }

    @Override
    public void stopEngine() {
        System.out.println("Остановка двигателя лодки");
    }

    @Override
    public void startSwimming() {
        if (isSailing == false) {
            System.out.println("Начало плавания лодки");
            isSailing = true;
        }
    }

    @Override
    public void stopSwimming() {
        if (isSailing = true) {
            System.out.println("Конец плавания лодки");
            isSailing = false;
        }
    }
}
