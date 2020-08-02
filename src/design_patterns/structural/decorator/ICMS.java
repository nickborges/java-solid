package design_patterns.structural.decorator;

public class ICMS extends ImpostoDecorator{

    private final double ICMS = 0.7;

    public ICMS() {
        super();
    }

    public ICMS(ImpostoDecorator impostoDecorator) {
        super(impostoDecorator);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * ICMS + calculaOutroImposto(orcamento);
    }

    @Override
    public double total(Orcamento orcamento) {
        return orcamento.getValor()
                + (orcamento.getValor() * ICMS + calculaOutroImposto(orcamento));
    }
}
