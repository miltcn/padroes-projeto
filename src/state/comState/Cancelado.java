package state.comState;

public class Cancelado implements IState {

    private Pedido pedido;

    public Cancelado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() throws Exception {
        throw new Exception("Operação não suportada, o pedido se encontra cancelado.");
    }

    @Override
    public void cancelarPedido() throws Exception {
        throw new Exception("Operação não suportada, pedido já cancelado.");
    }

    @Override
    public void despacharPedido() throws Exception {
        throw new Exception("Operação não suportada, o pedido se encontra cancelado.");
    }

    public String descricao() {
        return "Cancelado";
    }
}
