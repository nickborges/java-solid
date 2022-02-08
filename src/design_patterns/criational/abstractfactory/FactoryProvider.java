package design_patterns.criational.abstractfactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String factory){
        if("Animal".equalsIgnoreCase(factory)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(factory)){
            return new ColorFactory();
        }

        return null;
    }
}
