package design_patterns.behavior.chainOfResponsibility.exemplo1;

public class DescontoPorVendaCasada implements Desconto{

    private Desconto desconto;

    @Override
    public double desconta(Orcamento orcamento) {
        if(orcamento.contemItemPorNome("Caneta") &&
                orcamento.contemItemPorNome("Lápis")){
            return orcamento.getValor() * 0.05;
        } else {
            return desconto.desconta(orcamento);
        }
    }

    @Override
    public void proximoDesconto(Desconto desconto) {
        this.desconto = desconto;
    }
}
