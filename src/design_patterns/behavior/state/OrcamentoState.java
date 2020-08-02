package design_patterns.behavior.state;

public interface OrcamentoState {

    void aplicaDescontoExtra(Orcamento orcamento);
    void aprovar(Orcamento oracamento);
    void reprovar(Orcamento orcamento);
    void finalizar(Orcamento orcamento);

}
