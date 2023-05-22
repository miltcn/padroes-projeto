package bridge.implementacao;

public class SMS implements ICanalEnvio {
    @Override
    public void enviarMensagem(String assunto, String mensagem) {
        System.out.println("Mensagem envida por SMS");
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
    }
}
