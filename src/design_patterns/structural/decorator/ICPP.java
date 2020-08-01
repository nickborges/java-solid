package design_patterns.structural.decorator;

public class ICPP extends ImpostoDecorator{

    private final double ICPP = 0.6;

    public ICPP() {
    }

    public ICPP(ImpostoDecorator impostoDecorator) {
        super(impostoDecorator);
    }

    @Override
    public double calcula(Oracamento orcamento) {
        return orcamento.getValor() * ICPP + calculaOutroImposto(orcamento);
    }

    @Override
    public double total(Oracamento orcamento) {
        return orcamento.getValor()
                + (orcamento.getValor() * ICPP + calculaOutroImposto(orcamento));
    }
}
