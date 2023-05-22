import state.comState.Pedido;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        System.out.println(pedido.getEstadoAtual());
        pedido.sucessoAoPagar();
        System.out.println(pedido.getEstadoAtual());
        pedido.cancelarPedido();
        System.out.println(pedido.getEstadoAtual());
    }
}