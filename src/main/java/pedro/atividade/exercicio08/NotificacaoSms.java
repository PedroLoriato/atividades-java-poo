package pedro.atividade.exercicio08;

public class NotificacaoSms implements Notificavel {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Disparando SMS para o celular: " + mensagem);
    }
}