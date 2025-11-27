package org.example;

public class Pedido {

    private double valorPagamento;
    private PagamentoStrategy formaDePagamento;

    public Pedido(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public void setFormaDePagamento(PagamentoStrategy formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public void processarPagamento() {
        if (formaDePagamento == null) {
            System.out.println("❌ Nenhuma forma de pagamento definida!");
            return;
        }

        boolean sucesso = formaDePagamento.pagar(valorPagamento);

        if (sucesso) {
            System.out.println("🎉 Pedido pago com sucesso!");
        } else {
            System.out.println("❌ Falha ao processar pagamento!");
        }
    }
}
