package design_patterns.behavior.state.exemplo2;

public class Positivo implements SaldoState {

    @Override
    public void depositar(Conta conta, double valor) {
        conta.saldo += valor * 0.98;
    }

    @Override
    public void sacar(Conta conta, double valor) {
        conta.saldo -= valor;

        validarSaldo(conta);
    }

    private void validarSaldo(Conta conta){
        if(conta.saldo < 0){
            conta.estadoAtual = new Negativo();
        }
    }

}
