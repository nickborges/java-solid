package design_patterns.behavior.chainOfResponsibility.exemplo1;

public class TesteDesconto {

    public static void main(String[] args) {

        CalculadorDesconto calculadorDesconto = new CalculadorDesconto();

        Orcamento orcamento = new Orcamento(100.0);
        orcamento.adicionaItem(new Item("Caneta", 10.0));
        orcamento.adicionaItem(new Item("Lápis", 10.0));
        orcamento.adicionaItem(new Item("Borracha", 5.0));

        double descontoFinal = calculadorDesconto.calcula(orcamento);

        System.out.println(descontoFinal);

    }
}
