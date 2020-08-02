package design_patterns.behavior.state;

public class Finalizado implements OrcamentoState {
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Oraçamento já foi finalizado.");
    }

    @Override
    public void aprovar(Orcamento oracamento) {
        throw new RuntimeException("Oraçamento já foi finalizado.");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Oraçamento já foi finalizado.");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("Oraçamento já foi finalizado.");
    }
}
