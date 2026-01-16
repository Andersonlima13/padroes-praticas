package org.example.ConcreteFactorys;

import org.example.ConcretProducts.SmsNotification;
import org.example.Notification;
import org.example.NotificationFactory;

public class SmsFactory extends NotificationFactory {
    @Override
    protected Notification criarNotification() {
        return new SmsNotification();
    }
}
