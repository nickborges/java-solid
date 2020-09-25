package design_patterns.criational.abstractfactory;

public interface AbstractFactory<T> {

    T create(String type);

}
