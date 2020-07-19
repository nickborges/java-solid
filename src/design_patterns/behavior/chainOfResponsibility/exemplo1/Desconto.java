package design_patterns.behavior.chainOfResponsibility.exemplo1;

public interface Desconto {

    double desconta(Orcamento orcamento);
    void proximoDesconto(Desconto desconto);

}
