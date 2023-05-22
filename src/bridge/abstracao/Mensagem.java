package bridge.abstracao;

import bridge.implementacao.ICanalEnvio;

public abstract class Mensagem {

    protected ICanalEnvio canalEnvio;
    protected String assunto;
    protected String mensagem;

    public Mensagem (ICanalEnvio canalEnvio) {
        this.canalEnvio = canalEnvio;
    }

    abstract public void enviar();

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
