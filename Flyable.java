public interface Flyable {
    
    default void takeOff() {
        System.out.println("Взлет");
    };

    default void land() {
        System.out.println("Посадка");
    };

}
