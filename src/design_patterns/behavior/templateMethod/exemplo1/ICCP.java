package design_patterns.behavior.templateMethod.exemplo1;

public class ICCP extends TemplateImpostoCondicional{

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }
}
