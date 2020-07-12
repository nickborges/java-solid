package design_patterns.chainOfResponsibility.exemplo2;

public class SemRetorno implements Resposta{

    @Override
    public void responde(Requisicao requisicao, Conta conta) {
        System.out.println("Nenhum formato encontrado");
    }

    @Override
    public void proximo(Resposta resposta) {
    }
}
