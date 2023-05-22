package bridge.implementacao;

public class Email implements ICanalEnvio {
    @Override
    public void enviarMensagem(String assunto, String mensagem) {
        System.out.println("Mensagem envida por EMAIL");
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
    }
}
