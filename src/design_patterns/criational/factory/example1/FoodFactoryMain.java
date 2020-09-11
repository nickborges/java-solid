package design_patterns.criational.factory.example1;

public class FoodFactoryMain {

    public static void main(String[] args) {
        final Food food = FoodFactory.getFood("zebra");
        food.consumed();
    }

}
