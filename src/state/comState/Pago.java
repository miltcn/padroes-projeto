package state.comState;

public class Pago implements IState {

    private Pedido pedido;

    public Pago(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() throws Exception {
        throw new Exception("Operação não suportada, o pedido já foi pago.");
    }

    @Override
    public void cancelarPedido() {
        this.pedido.setEstadoAtual(this.pedido.getCancelado());
    }

    @Override
    public void despacharPedido() {
        this.pedido.setEstadoAtual(this.pedido.getEnviado());
    }

    public String descricao() {
        return "Pago";
    }
}
