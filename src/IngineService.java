public interface IngineService {
    default void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }
}
