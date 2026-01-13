package org.example.Chains;

import org.example.Chamado;
import org.example.Suporte;
import org.example.SuporteHandler;

public class SuporteGeral extends SuporteHandler  {
    private Suporte proximoSuporte;



    @Override
    public void atenderChamado(Chamado chamado) {
        System.out.println("⬜ Suporte de TI Geral");
        System.out.println("Olá! Sou a Marina e vou analisar o seu problema:");
        System.out.println(chamado.getProblema());
    }
}
