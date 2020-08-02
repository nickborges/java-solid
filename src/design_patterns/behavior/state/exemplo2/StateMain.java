package design_patterns.behavior.state.exemplo2;

public class StateMain {

    public static void main(String[] args) {
        Conta conta = new Conta(500);
        conta.sacar(600);
        System.out.println("Status = " + conta.estadoAtual + " Saldo = " + conta.saldo);

        conta.depositar(700);
        System.out.println("Status = " + conta.estadoAtual + " Saldo = " + conta.saldo);

        conta.sacar(900);
        System.out.println("Status = " + conta.estadoAtual + " Saldo = " + conta.saldo);

        //conta.sacar(100); //lança exception pois o saldo ficou negativo

    }

}
