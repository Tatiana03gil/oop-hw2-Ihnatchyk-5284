public interface Swimmable {
    
    default void startSwimming() {
        System.out.println("Начало плавания");
    };

     default void stopSwimming() {
        System.out.println("Конец плавания");
     };
}
