package org.example;

import org.example.ConcreteFactorys.EmailFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        NotificationFactory factory;

        String tipoNotificacao = "EMAIL"; // poderia vir de config, input do usuário, API, etc.

        if ("EMAIL".equalsIgnoreCase(tipoNotificacao)) {
            factory = new EmailFactory();
        } else {
            throw new IllegalArgumentException("Tipo de notificação inválido");
        }

        factory.notificar("Olá! Você recebeu uma nova notificação.");
    }
}
