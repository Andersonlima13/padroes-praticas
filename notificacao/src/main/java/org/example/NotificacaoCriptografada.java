package org.example;

public class NotificacaoCriptografada extends NotificacaoDecorator {

    public NotificacaoCriptografada(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        String mensagemCriptografada = "###" + mensagem + "###";
        System.out.println("Criptografando mensagem...");
        super.enviar(mensagemCriptografada);
    }
}