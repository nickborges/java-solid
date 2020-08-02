package design_patterns.structural.decorator;

public class DecoratorMain {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(100);
        ImpostoDecorator decorator = new ICMS(new ISS(new ICPP()));

        double imposto = decorator.calcula(orcamento);
        double total = decorator.total(orcamento);

        System.out.println("Valor do imposto: "+ imposto);
        System.out.println("Valor total: " + total);

    }
}
