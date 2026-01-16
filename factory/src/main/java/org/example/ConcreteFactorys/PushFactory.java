package org.example.ConcreteFactorys;

import org.example.ConcretProducts.PushNotification;
import org.example.Notification;
import org.example.NotificationFactory;

public class PushFactory extends NotificationFactory {

    @Override
    protected Notification criarNotification() {
        return new PushNotification(); // retorna o produto relativo a fabrica
    }
}
