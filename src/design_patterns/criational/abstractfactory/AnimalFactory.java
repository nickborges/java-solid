package design_patterns.criational.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal>{

    @Override
    public Animal create(String type) {
        if("Dog".equals(type)){
            return new Dog();
        } else if("Duck".equals(type)){
            return new Duck();
        } else if("Bear".equals(type)){
            return new Bear();
        }
        return null;
    }
}
