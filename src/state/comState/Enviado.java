package state.comState;

public class Enviado implements IState {

    private Pedido pedido;

    public Enviado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() throws Exception {
        throw new Exception("Operação não suportada, o pedido já foi pago e enviado.");
    }

    @Override
    public void cancelarPedido() throws Exception {
        throw new Exception("Operação não suportada, o pedido já foi enviado.");
    }

    @Override
    public void despacharPedido() throws Exception {
        throw new Exception("Operação não suportada, o pedido já foi enviado.");
    }

    public String descricao() {
        return "Enviado";
    }
}
