package design_patterns.structural.decorator;

public abstract class ImpostoDecorator {

    private ImpostoDecorator outroImpostoDecorator;

    public ImpostoDecorator() {
    }

    public ImpostoDecorator(ImpostoDecorator outroImpostoDecorator) {
        this.outroImpostoDecorator = outroImpostoDecorator;
    }

    public abstract double calcula(Orcamento orcamento);

    public abstract double total(Orcamento orcamento);

    protected double calculaOutroImposto(Orcamento orcamento){
        if(outroImpostoDecorator == null){
            return 0;
        }
        return outroImpostoDecorator.calcula(orcamento);
    }

}
