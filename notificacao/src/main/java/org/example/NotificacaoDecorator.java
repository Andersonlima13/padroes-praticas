package org.example;

public abstract class NotificacaoDecorator implements Notificacao {

    protected Notificacao notificacao;

    public NotificacaoDecorator(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public void enviar(String mensagem) {
        notificacao.enviar(mensagem);
    }
}