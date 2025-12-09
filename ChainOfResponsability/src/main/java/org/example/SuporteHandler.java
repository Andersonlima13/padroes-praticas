package org.example;

public abstract class SuporteHandler implements Suporte {

    protected SuporteHandler proximo;

    @Override
    public SuporteHandler setProximo(SuporteHandler proximo) {
        this.proximo = proximo;
        return proximo; // permite montar a cadeia fluent-style
    }

    protected void chamarProximo(Chamado chamado) {
        if (proximo != null) {
            proximo.atenderChamado(chamado);
        } else {
            System.out.println("⚠ Nenhum suporte pôde resolver o problema.");
        }
    }
}
