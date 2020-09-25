package design_patterns.criational.abstractfactory;

public class Duck implements Animal{

    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squerks";
    }
}
