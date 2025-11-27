package org.example;
//contexto
public class Pedido {
    private double valorPagamento;
    private PagamentoStrategy tipoDePagamento;

    public void Pedido(double valorPagamento){
        this.tipoDePagamento = tipoDePagamento;
    }

    public void setFormaDePagamento(PagamentoStrategy tipoDePagamento){
        this.tipoDePagamento = tipoDePagamento;
    }

    public void processarPagamento(PagamentoStrategy tipoDePagamento,double valorPagamento){

    }


}
