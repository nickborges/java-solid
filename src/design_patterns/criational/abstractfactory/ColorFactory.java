package design_patterns.criational.abstractfactory;

public class ColorFactory implements AbstractFactory{

    @Override
    public Color create(String type) {
        if("White".equals(type)){
            return new White();
        } else if("Brown".equals(type)){
            return new Brown();
        } else if("Black".equals(type)){
            return new Black();
        }
        return null;
    }
}
