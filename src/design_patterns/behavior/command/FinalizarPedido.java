package design_patterns.behavior.command;

public class FinalizarPedido implements Comando{

    private Pedido pedido;

    public FinalizarPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executar() {
        System.out.println("finalizando o pedido ==> " + pedido);
        pedido.finaliza();
    }
}
