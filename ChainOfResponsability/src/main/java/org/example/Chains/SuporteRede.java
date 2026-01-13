package org.example.Chains;

import org.example.Chamado;
import org.example.SuporteHandler;

public class SuporteRede extends SuporteHandler {

    @Override
    public void atenderChamado(Chamado chamado) {
        if (chamado.getCategoria().equalsIgnoreCase("Rede")) {
            System.out.println("🌐 Suporte de Rede");
            System.out.println("Olá! Sou o Carlos e vou atender seu chamado:");
            System.out.println(chamado.getProblema());
        } else {
            chamarProximo(chamado);
        }
    }
}