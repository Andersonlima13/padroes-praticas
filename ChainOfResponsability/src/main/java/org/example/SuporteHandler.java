package org.example;

public abstract class SuporteHandler implements Suporte {


    protected SuporteHandler proximo;

    public SuporteHandler setProximo(SuporteHandler proximo) {
        this.proximo = proximo;
        return proximo;
    }

    protected void chamarProximo(Chamado chamado) {
        if (proximo != null) {
            proximo.atenderChamado(chamado);
        } else {
            System.out.println("⚠ Nenhum suporte pôde resolver o problema.");
        }
    }

}
