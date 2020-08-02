package design_patterns.behavior.state;

public class Reprovado implements OrcamentoState{
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Oraçamento já foi reprovado.");
    }

    @Override
    public void aprovar(Orcamento oracamento) {
        throw new RuntimeException("Oraçamento já foi reprovado.");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Oraçamento já foi reprovado.");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
}
