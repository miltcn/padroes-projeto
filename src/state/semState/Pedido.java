package state.semState;

public class Pedido {
    private Estado estadoAtual;

    public Pedido() {
        this.estadoAtual = Estado.AGUARDANDO_PAGAMENTO;
    }

    public void sucessoAoPagar() {
        if(this.estadoAtual == Estado.AGUARDANDO_PAGAMENTO) {
            this.estadoAtual = Estado.PAGO;
        } else {
            System.out.println("O pedido não está aguardando pagamento!");
        }
    }

    public void cancelarPedido() {
        if(this.estadoAtual == Estado.AGUARDANDO_PAGAMENTO || this.estadoAtual == Estado.PAGO) {
            this.estadoAtual = Estado.CANCELADO;
        } else {
            System.out.println("O pedido não pode ser cancelado!");
        }
    }

    public void despacharPedido() {
        if(this.estadoAtual == Estado.PAGO) {
            this.estadoAtual = Estado.ENVIADO;
        } else {
            System.out.println("O pedido não do ser enviado!");
        }
    }

    public Estado getEstado() {
        return this.estadoAtual;
    }
}
