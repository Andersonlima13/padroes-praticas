package org.example;

public class NotificacaoComLog extends NotificacaoDecorator {

    public NotificacaoComLog(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[LOG] Registrando envio...");
        super.enviar(mensagem);
    }
}