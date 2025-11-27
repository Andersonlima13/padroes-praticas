package org.example;

public class PagamentoCartaoCredito  implements PagamentoStrategy{
    private int numero;
    private int cvv;


    public void PagamentoStrategy(int numero, int cvv){
        this.cvv = cvv;
        this.numero = numero;
    }


    @Override
    public boolean pagar(double valor) {
        return false;
    }
}
