package design_patterns.criational.factory;

public class Hay extends Food {

    public Hay(int quantity) {
        super(quantity);
    }

    public void consumed() {
        System.out.println("Hay eaten: " + getQuantity());
    }
}