package design_patterns.chainOfResponsibility.exemplo2;

public class TesteRequisicao {

    public static void main(String[] args) {
        ExecutorRequisicao executorRequisicao = new ExecutorRequisicao();

        executorRequisicao.executor(
                new Requisicao(Formato.XML),
                new Conta("Fulano 2", 5000)
        );
    }
}
