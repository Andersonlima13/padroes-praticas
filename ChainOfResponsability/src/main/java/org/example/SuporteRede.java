package org.example;

public class SuporteRede implements Suporte {
    private Suporte proximoSuporte;

    @Override
    public void proximoSuporte(Suporte proximoSuporte) {
        this.proximoSuporte = proximoSuporte;

    }

    @Override
    public void atenderChamado(Chamado chamado) {
        if (chamado.getCategoria().equalsIgnoreCase("Rede")) {
            System.out.println("🟦 Suporte de Rede");
            System.out.println("Olá! Sou o Carlos e vou iniciar o atendimento para:");
            System.out.println(chamado.getProblema());
        }
        proximoSuporte.atenderChamado(chamado);

    }
}
