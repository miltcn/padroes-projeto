package state.comState;

import state.semState.Estado;

public class Pedido {
    private IState aguardandoPagamento;
    private IState pago;
    private IState cancelado;
    private IState enviado;
    private IState estadoAtual;

    public Pedido() {
        this.aguardandoPagamento = new AguardandoPagamento(this);
        this.pago = new Pago(this);
        this.cancelado = new Cancelado(this);
        this.enviado = new Enviado(this);

        this.estadoAtual = this.aguardandoPagamento;
    }

    public void sucessoAoPagar() {
        try {
            this.estadoAtual.sucessoAoPagar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void cancelarPedido() {
        try {
            this.estadoAtual.cancelarPedido();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void despacharPedido() {
        try {
            this.estadoAtual.despacharPedido();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public IState getAguardandoPagamento() {
        return aguardandoPagamento;
    }

    public IState getPago() {
        return pago;
    }

    public IState getCancelado() {
        return cancelado;
    }

    public IState getEnviado() {
        return enviado;
    }

    public String getEstadoAtual() {
        return estadoAtual.descricao();
    }

    public void setEstadoAtual(IState estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
}
