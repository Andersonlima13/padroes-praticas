package org.example;

public class Pedido {
    private boolean pedidoEmEstoque;
    private boolean freteCalculado;
    private boolean descontoAplicado;
    private boolean pagamentoRealizado;
    private double valorDoPedido = 0.0;
    private EstadoPedido estadoAtualPedido;


    public Pedido(boolean PedidoEmEstoque, double valorDoPedido){
        this.pedidoEmEstoque = PedidoEmEstoque;
        this.valorDoPedido = valorDoPedido;
    }



    public void setEstadoPedido(EstadoPedido novoEstadoPedido){
        this.estadoAtualPedido = novoEstadoPedido;
    }


    public void processar(){
        estadoAtualPedido.processar(this);
    }



}
