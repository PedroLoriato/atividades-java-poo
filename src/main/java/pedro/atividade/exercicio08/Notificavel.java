package pedro.atividade.exercicio08;

public interface Notificavel {
    void enviar(String mensagem);
    default void enviarUrgente(String mensagem) {
        enviar("[URGENTE] " + mensagem);
    }
}