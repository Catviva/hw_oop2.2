public class Bicycle extends Transport implements OrderService, TyreService {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда ");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем велосипед " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}