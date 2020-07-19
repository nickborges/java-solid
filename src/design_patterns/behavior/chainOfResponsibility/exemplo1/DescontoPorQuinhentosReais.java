package design_patterns.behavior.chainOfResponsibility.exemplo1;

public class DescontoPorQuinhentosReais implements Desconto{

    private Desconto desconto;

    @Override
    public double desconta(Orcamento orcamento) {
        if(orcamento.getValor() > 500){
            return orcamento.getValor() * 0.07;
        } else{
            return desconto.desconta(orcamento);
        }
    }

    @Override
    public void proximoDesconto(Desconto desconto) {
        this.desconto = desconto;
    }
}
