package design_patterns.chainOfResponsibility.exemplo1;

public class CalculadorDesconto {

    public double calcula(Orcamento orcamento){
        Desconto d1 = new DescontoPorCincoItens();
        Desconto d2 = new DescontoPorQuinhentosReais();
        Desconto d3 = new DescontoPorVendaCasada();
        Desconto d4 = new SemDesconto();

        d1.proximoDesconto(d2);
        d2.proximoDesconto(d3);
        d3.proximoDesconto(d4);

        return d1.desconta(orcamento);

    }

}
