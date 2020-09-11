package design_patterns.criational.factory.example1;

public class Pellets extends Food {

    public Pellets(int quantity) {
        super(quantity);
    }

    public void consumed() {
        System.out.println("Pellets eaten: " + getQuantity());
    }
}