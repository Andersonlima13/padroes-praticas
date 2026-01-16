package org.example;

public abstract class NotificationFactory {

    public void notificar(String mensagem){
        Notification notification = criarNotification();
        notification.notificarUsuario(mensagem);
    }

    protected abstract Notification criarNotification();
}
