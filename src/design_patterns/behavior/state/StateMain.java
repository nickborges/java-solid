package design_patterns.behavior.state;

public class StateMain {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(500.00);

        //Em aprovação
        orcamento.aplicaDescontoExtra();
        //orcamento.aplicaDescontoExtra(); // lança exception desconto já aplicado
        System.out.println(orcamento.estadoAtual + " - " +orcamento.getValor());

        //Aprovado
        orcamento.aprovar();
        orcamento.aplicaDescontoExtra();
        //orcamento.aplicaDescontoExtra(); // lança exception desconto já aplicado
        System.out.println(orcamento.estadoAtual + " - " +orcamento.getValor());

        //Finalizado
        orcamento.finalizar();
        System.out.println(orcamento.estadoAtual + " - " +orcamento.getValor());

        orcamento.estadoAtual = new EmAprovacao();
        orcamento.reprovar();
        System.out.println(orcamento.estadoAtual + " - " +orcamento.getValor());

    }
}
