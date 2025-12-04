package org.example;

public class SuporteGeral implements Suporte{
    private Suporte proximoSuporte;

    @Override
    public void proximoSuporte(Suporte proximoSuporte) {
        this.proximoSuporte = proximoSuporte;

    }

    @Override
    public void atenderChamado(Chamado chamado) {
        System.out.println("⬜ Suporte de TI Geral");
        System.out.println("Olá! Sou a Marina e vou analisar o seu problema:");
        System.out.println(chamado.getProblema());
    }
}
