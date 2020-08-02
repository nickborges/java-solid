package design_patterns.structural.decorator;

public class ICPP extends ImpostoDecorator{

    private final double ICPP = 0.6;

    public ICPP() {
    }

    public ICPP(ImpostoDecorator impostoDecorator) {
        super(impostoDecorator);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * ICPP + calculaOutroImposto(orcamento);
    }

    @Override
    public double total(Orcamento orcamento) {
        return orcamento.getValor()
                + (orcamento.getValor() * ICPP + calculaOutroImposto(orcamento));
    }
}
