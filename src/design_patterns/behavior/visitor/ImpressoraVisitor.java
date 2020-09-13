package design_patterns.behavior.visitor;

public class ImpressoraVisitor implements Visitor{

    @Override
    public void visitaSoma(Soma soma){
        soma.getEsquerda().visita(this);
        soma.getDireita().visita(this);
    }

    @Override
    public void visitaSubtracao(Subtracao subtracao){
        subtracao.getEsquerda().visita(this);
        subtracao.getDireita().visita(this);
    }

    @Override
    public void visitaNumero(Numero numero){
        System.out.println(numero.getNumero());
    }

    @Override
    public void visitaRaiz(RaizQuadrada raizQuadrada){
        raizQuadrada.getExpressao().visita(this);
    }

    @Override
    public void visitaMultiplicacao(Multiplicacao multiplicacao){
        multiplicacao.getDireita().visita(this);
        multiplicacao.getEsquerda().visita(this);
    }

    @Override
    public void visitaDividsao(Divisao divisao){
        divisao.getDireita().visita(this);
        divisao.getEsquerda().visita(this);
    }
}
