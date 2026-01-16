package org.example.ConcretProducts;

import org.example.Notification;

public class SmsNotification implements Notification {
    @Override
    public void notificarUsuario(String mensagem) {
        System.out.println("NOTIFICATÇAO POR SMS");
    }
}
