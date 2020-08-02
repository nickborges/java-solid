package design_patterns.behavior.state;

public class Aprovado implements OrcamentoState{
    
    boolean descontoAplicado;
    
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if (!descontoAplicado){
            orcamento.valor -= orcamento.valor * 0.01;
            descontoAplicado = true;
        } else{
            throw new RuntimeException("Desconto já foi aplicado.");
        }
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
