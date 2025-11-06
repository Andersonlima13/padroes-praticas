package org.example;

public class PagamentoCartao implements Pagamento{

    @Override
    public double calcularValorPagamento(double valorTotal, int quantiaPedido) {
        double total = valorTotal * quantiaPedido;
        double taxa = total * 0.05;
        return total + taxa;
    }
}
