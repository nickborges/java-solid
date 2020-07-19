package design_patterns.behavior.chainOfResponsibility.exemplo1;

public class DescontoPorCincoItens implements Desconto{

    private Desconto desconto;

    @Override
    public double desconta(Orcamento orcamento) {
        if(orcamento.getItens().size() > 5){
            return orcamento.getValor() * 0.1;
        } else {
            return desconto.desconta(orcamento);
        }
    }

    @Override
    public void proximoDesconto(Desconto desconto) {
        this.desconto = desconto;
    }
}
