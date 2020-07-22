package design_patterns.behavior.templateMethod.exemplo1;

public abstract class TemplateImpostoCondicional implements Imposto{

    protected abstract double minimaTaxacao(Orcamento orcamento);

    protected abstract double maximaTaxacao(Orcamento orcamento);

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

    @Override
    public double calcular(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento)){
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }
}
