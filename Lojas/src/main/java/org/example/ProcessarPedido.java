package org.example;

abstract class ProcessarPedido {
    // template metodo
    public void realizarPedido(){
        selecao();
        pagamento();
        entrega();
    }
    abstract void selecao();
    abstract void pagamento();
    abstract void entrega();

}
