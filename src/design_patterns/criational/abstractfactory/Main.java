package design_patterns.criational.abstractfactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory animal = FactoryProvider.getFactory("Animal");
        Dog dog = (Dog)animal.create("Dog");
        dog.getType();
        dog.makeSound();
    }
}
