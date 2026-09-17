package pedro.atividade.exercicio08;

public class Main {
    private static void processarNotificacoesNormais(Notificavel email, Notificavel sms) {
        System.out.println("--- Notificações Normais ---");
        email.enviar("Sua fatura foi fechada.");
        sms.enviar("Seu código de verificação é 4492.");
    }

    private static void processarNotificacoesUrgentes(Notificavel email, Notificavel sms) {
        System.out.println("\n--- Notificações Urgentes ---");
        email.enviarUrgente("O servidor do banco de dados caiu!");
        sms.enviarUrgente("O sistema foi invadido!");
    }

    public static void main(String[] args) {
        Notificavel email = new NotificacaoEmail();
        Notificavel sms = new NotificacaoSms();

        processarNotificacoesNormais(email, sms);
        processarNotificacoesUrgentes(email, sms);
    }
}
