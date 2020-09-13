package design_patterns.behavior.command;

public class Main {

    public static void main(String[] args) {
        FilaDeTrabalho fila = new FilaDeTrabalho();

        Pedido pedido1 = new Pedido("Fulano 1", 150.0);
        Pedido pedido2 = new Pedido("Fulano 2", 250.0);

        fila.adiciona(new PagarPedido(pedido1));
        fila.adiciona(new PagarPedido(pedido2));

        fila.adiciona(new FinalizarPedido(pedido1));
        fila.adiciona(new FinalizarPedido(pedido2));

        fila.processo();

    }
}
