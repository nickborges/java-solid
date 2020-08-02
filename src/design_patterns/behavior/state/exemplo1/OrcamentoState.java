package design_patterns.behavior.state.exemplo1;

public interface OrcamentoState {

    void aplicaDescontoExtra(Orcamento orcamento);
    void aprovar(Orcamento oracamento);
    void reprovar(Orcamento orcamento);
    void finalizar(Orcamento orcamento);

}
