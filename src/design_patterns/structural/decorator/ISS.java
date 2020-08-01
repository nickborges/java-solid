package design_patterns.structural.decorator;

public class ISS extends ImpostoDecorator{

    private final double ISS = 0.5;

    public ISS() {
        super();
    }

    public ISS(ImpostoDecorator impostoDecorator) {
        super(impostoDecorator);
    }

    @Override
    public double calcula(Oracamento orcamento) {
        return orcamento.getValor() * ISS + calculaOutroImposto(orcamento);
    }

    @Override
    public double total(Oracamento orcamento) {
        return orcamento.getValor()
                + (orcamento.getValor() * ISS + calculaOutroImposto(orcamento));
    }
}
