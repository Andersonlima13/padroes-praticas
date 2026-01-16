package org.example.ConcreteFactorys;

import org.example.ConcretProducts.EmailNotification;
import org.example.Notification;
import org.example.NotificationFactory;

public class EmailFactory extends NotificationFactory {

    @Override
    protected Notification criarNotification() {
        return new EmailNotification();
    }
}
