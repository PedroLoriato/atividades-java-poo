package pedro.atividade.exercicio08;

public class NotificacaoEmail implements Notificavel {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando E-mail para o cliente: " + mensagem);
    }
}