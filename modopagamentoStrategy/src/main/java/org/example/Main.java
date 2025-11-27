package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(150.00);
        pedido.setFormaDePagamento(new PagamentoPayPal("cliente@email.com", "123"));
        pedido.processarPagamento();
    }
}