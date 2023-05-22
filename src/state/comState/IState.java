package state.comState;

public interface IState {
    public void sucessoAoPagar() throws Exception;
    public void cancelarPedido() throws Exception;
    public void despacharPedido() throws Exception;
    public String descricao();
}
