package design_patterns.behavior.state;

public class StateMain {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(500.00);

        orcamento.aplicaDescontoExtra();

        orcamento.aprovar();

        orcamento.aplicaDescontoExtra();

        orcamento.finalizar();

        System.out.println(orcamento.estadoAtual + " - " +orcamento.getValor());

        orcamento.estadoAtual = new EmAprovacao();

        System.out.println(orcamento.estadoAtual + " - " +orcamento.getValor());

    }
}
