package design_patterns.behavior.state;

public class EmAprovacao implements OrcamentoState{

    boolean descontoAplicado;

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if (!descontoAplicado){
            orcamento.valor -= orcamento.valor * 0.05;
            descontoAplicado = true;
        } else{
            throw new RuntimeException("Desconto já foi aplicado.");
        }
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
