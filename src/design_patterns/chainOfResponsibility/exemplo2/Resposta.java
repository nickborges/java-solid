package design_patterns.chainOfResponsibility.exemplo2;

public interface Resposta {
    void responde(Requisicao requisicao, Conta conta);
    void proximo(Resposta resposta);
}
