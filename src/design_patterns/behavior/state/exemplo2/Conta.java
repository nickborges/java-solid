package design_patterns.behavior.state.exemplo2;

public class Conta {

    protected double saldo;
    protected SaldoState estadoAtual;

    public Conta(double saldo) {
        this.saldo = saldo;
        this.estadoAtual = new Positivo();
    }

    public void sacar(double valor){
        estadoAtual.sacar(this, valor);
    }

    public void depositar(double valor){
        estadoAtual.depositar(this, valor);
    }

}
