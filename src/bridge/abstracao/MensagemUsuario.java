package bridge.abstracao;

import bridge.implementacao.ICanalEnvio;

public class MensagemUsuario extends Mensagem {
    public MensagemUsuario(ICanalEnvio canalEnvio) {
        super(canalEnvio);
    }

    @Override
    public void enviar() {
        System.out.println("Mensagem envida pelo USUÁRIO");
        this.canalEnvio.enviarMensagem(this.assunto, this.mensagem);
    }
}
