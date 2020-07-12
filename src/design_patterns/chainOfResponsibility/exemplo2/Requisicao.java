package design_patterns.chainOfResponsibility.exemplo2;

public class Requisicao {
    private Formato formato;

    public Requisicao(Formato formato) {
        this.formato = formato;
    }

    public Formato getFormato() {
        return formato;
    }
}
