package design_patterns.behavior.command;

public class PagarPedido implements Comando{

    private Pedido pedido;

    public PagarPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executar() {
        System.out.println("Pagando o pedido ==>: " + pedido);
        pedido.paga();
    }
}
