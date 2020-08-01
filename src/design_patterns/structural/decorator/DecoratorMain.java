package design_patterns.structural.decorator;

public class DecoratorMain {

    public static void main(String[] args) {

        Oracamento oracamento = new Oracamento(100);
        ImpostoDecorator decorator = new ICMS(new ISS(new ICPP()));

        double imposto = decorator.calcula(oracamento);
        double total = decorator.total(oracamento);

        System.out.println("Valor do imposto: "+ imposto);
        System.out.println("Valor total: " + total);

    }
}
