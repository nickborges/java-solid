package design_patterns.structural.decorator;

public abstract class ImpostoDecorator {

    private ImpostoDecorator outroImpostoDecorator;

    public ImpostoDecorator() {
    }

    public ImpostoDecorator(ImpostoDecorator outroImpostoDecorator) {
        this.outroImpostoDecorator = outroImpostoDecorator;
    }

    public abstract double calcula(Oracamento orcamento);

    public abstract double total(Oracamento orcamento);

    protected double calculaOutroImposto(Oracamento oracamento){
        if(outroImpostoDecorator == null){
            return 0;
        }
        return outroImpostoDecorator.calcula(oracamento);
    }

}
