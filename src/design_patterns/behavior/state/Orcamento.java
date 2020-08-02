package design_patterns.behavior.state;

public class Orcamento{

    protected double valor;

    protected OrcamentoState estadoAtual;

    public Orcamento(double valor) {
        this.valor = valor;
        estadoAtual = new EmAprovacao();
    }

    public double getValor() {
        return valor;
    }

    public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprovar() {
        estadoAtual.aprovar(this);
    }

    public void reprovar() {
        estadoAtual.reprovar(this);

    }

    public void finalizar() {
        estadoAtual.finalizar(this);
    }
}
