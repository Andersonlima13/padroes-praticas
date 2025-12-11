package org.example;

// basicamente o componente concreto, o qual sofre de incrementos

public class NotificacaoSimples implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação: " + mensagem);
    }
}