package design_patterns.criational.abstractfactory;

public class Dog implements Animal{

    @Override
    public String getType() {
        System.out.print("Dog");
        return "Dog";
    }

    @Override
    public String makeSound() {
        System.out.print("-Bark");
        return "Bark";
    }

}
