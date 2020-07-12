package design_patterns.factory;

public class FoodFactoryMain {

    public static void main(String[] args) {
        final Food food = FoodFactory.getFood("zebra");
        food.consumed();
    }

}
