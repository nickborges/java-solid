package design_patterns.structural.facade;

public class Fatura {

    private String codigo;
    private double valor;

    public Fatura(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }
}
