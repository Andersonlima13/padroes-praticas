package org.example.ConcretProducts;

import org.example.Notification;

public class PushNotification implements Notification {
    @Override
    public void notificarUsuario(String mensagem) {
        System.out.println("NOTIFICATÇAO POR PUSH");
    }
}
