package org.example.Chains;

import org.example.Chamado;
import org.example.Suporte;
import org.example.SuporteHandler;

public class SuporteSoftware extends SuporteHandler {
    private Suporte proximoSuporte;


    @Override
    public void atenderChamado(Chamado chamado) {
        if (chamado.getCategoria().equalsIgnoreCase("Software")) {
            System.out.println("🟦 Suporte de Rede");
            System.out.println("Olá! Sou o Carlos e vou iniciar o atendimento para:");
            System.out.println(chamado.getProblema());
        }
        proximoSuporte.atenderChamado(chamado);

    }
}
