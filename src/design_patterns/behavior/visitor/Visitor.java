package design_patterns.behavior.visitor;

public interface Visitor {

    void visitaSoma(Soma soma);

    void visitaSubtracao(Subtracao subtracao);

    void visitaNumero(Numero numero);

    void visitaRaiz(RaizQuadrada raizQuadrada);

    void visitaMultiplicacao(Multiplicacao multiplicacao);

    void visitaDividsao(Divisao divisao);

}
