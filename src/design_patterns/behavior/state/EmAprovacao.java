package design_patterns.behavior.state;

public class EmAprovacao implements OrcamentoState{

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.valor -= orcamento.valor * 0.05;
    }

    @Override
    public void aprovar(Orcamento oracamento) {
        oracamento.estadoAtual = new Aprovado();
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.estadoAtual = new Reprovado();
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("Oraçamento ainda está em aprovação e não pode ser finalizado.");

    }
}
