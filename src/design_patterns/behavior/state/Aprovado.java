package design_patterns.behavior.state;

public class Aprovado implements OrcamentoState{
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.valor -= orcamento.valor * 0.01;
    }

    @Override
    public void aprovar(Orcamento oracamento) {
        throw new RuntimeException("Orçamento já está aprovado.");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está aprovado.");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
}
