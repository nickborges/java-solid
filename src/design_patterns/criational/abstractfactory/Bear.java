package design_patterns.criational.abstractfactory;

public class Bear implements Animal{

    @Override
    public String getType() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "Roar";
    }
}
