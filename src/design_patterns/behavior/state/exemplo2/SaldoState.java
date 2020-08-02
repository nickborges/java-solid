package design_patterns.behavior.state.exemplo2;

public interface SaldoState {

    void depositar(Conta conta, double valor);
    void sacar(Conta conta, double valor);

}
