package design_patterns.chainOfResponsibility.exemplo1;

public interface Desconto {

    double desconta(Orcamento orcamento);
    void proximoDesconto(Desconto desconto);

}
