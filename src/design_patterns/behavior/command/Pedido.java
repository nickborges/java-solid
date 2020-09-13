package design_patterns.behavior.command;

import java.time.LocalDate;

public class Pedido {

    private String cliente;
    private double valor;
    private Status status;
    private LocalDate dataFinalizacao;

    public Pedido(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.status = Status.NOVO;
    }

    public void paga(){
        status = Status.PAGO;
    }

    public void finaliza(){
        dataFinalizacao = LocalDate.now();
        status = Status.ENTREGUE;
    }

    public String getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente='" + cliente + '\'' +
                ", valor=" + valor +
                ", status=" + status +
                ", dataFinalizacao=" + dataFinalizacao +
                '}';
    }
}
