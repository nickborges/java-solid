package design_patterns.behavior.chainOfResponsibility.exemplo1;

public class Item {

    private final String nome;
    private final double valor;

    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
