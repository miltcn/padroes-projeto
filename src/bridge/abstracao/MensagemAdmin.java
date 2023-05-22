package bridge.abstracao;

import bridge.implementacao.ICanalEnvio;

public class MensagemAdmin extends Mensagem {
    public MensagemAdmin(ICanalEnvio canalEnvio) {
        super(canalEnvio);
    }

    @Override
    public void enviar() {
        System.out.println("Mensagem envida por um ADMINISTRADOR");
        this.canalEnvio.enviarMensagem(this.assunto, this.mensagem);
    }
}
