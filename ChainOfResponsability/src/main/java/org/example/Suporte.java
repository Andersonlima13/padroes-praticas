package org.example;
// handler
public interface Suporte {
    SuporteHandler setProximo(SuporteHandler proximo);
    void atenderChamado(Chamado chamado);
    // ao inves de chamar o proximo na interface, definimos o handler, chamamos ele e
    // o mesmo faz o servico de encaminhar ao proximo
}
