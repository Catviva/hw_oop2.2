public interface TyreService {
    default void updateTyre() {
        System.out.println("Меняем покрышку ");
    }
}
