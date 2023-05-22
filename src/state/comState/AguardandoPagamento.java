package state.comState;

public class AguardandoPagamento implements IState {
    private Pedido pedido;

    public AguardandoPagamento(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        this.pedido.setEstadoAtual(this.pedido.getPago());
    }

    @Override
    public void cancelarPedido() throws Exception {
        this.pedido.setEstadoAtual(this.pedido.getCancelado());
    }

    @Override
    public void despacharPedido() throws Exception {
        throw new Exception("Operação não suportada, o pedido não foi pago.");
    }

    public String descricao() {
        return "Aguardando Pagamento";
    }
}
