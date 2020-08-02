package design_patterns.behavior.state.exemplo2;

public class Positivo implements SaldoState {

    @Override
    public void depositar(Conta conta, double valor) {
        conta.saldo += valor * 0.98;
    }

    @Override
    public void sacar(Conta conta, double valor) {
        conta.saldo -= valor;

        validarSaldo(conta, valor);
    }

    private void validarSaldo(Conta conta, double valor){
        if(conta.saldo < valor){
            conta.estadoAtual = new Negativo();
        }
    }

}
