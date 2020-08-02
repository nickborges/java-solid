package design_patterns.behavior.state.exemplo2;

public class Negativo implements SaldoState {

    @Override
    public void depositar(Conta conta, double valor) {
        conta.saldo = valor * 0.95;
        if(conta.saldo > 0){
            conta.estadoAtual = new Positivo();
        }
    }

    @Override
    public void sacar(Conta conta, double valor) {
        throw new RuntimeException("Esta transação não permitida seu saldo está negativo. " + conta.saldo);
    }

}
