package org.example;

public class SuporteRede implements Suporte {
    private Suporte proximoSuporte;

    @Override
    public void proximoSuporte(Suporte proximoSuporte) {
        this.proximoSuporte = proximoSuporte;

    }

    @Override
    public void atenderChamado(Chamado chamado) {

    }
}
