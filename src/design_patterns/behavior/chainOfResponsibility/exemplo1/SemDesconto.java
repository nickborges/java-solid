package design_patterns.behavior.chainOfResponsibility.exemplo1;

public class SemDesconto implements Desconto{

    private Desconto desconto;

    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void proximoDesconto(Desconto desconto) {
    }
}
