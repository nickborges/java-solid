package design_patterns.behavior.chainOfResponsibility.exemplo2;

public interface Resposta {
    void responde(Requisicao requisicao, Conta conta);
    void proximo(Resposta resposta);
}
