package org.example;

public class PagamentoPayPal implements PagamentoStrategy{
    private String email;
    private String senha;

    public PagamentoPayPal(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }




    @Override
    public boolean pagar(double valor) {
        if(senha == ""){
            System.out.println("senha errada");

        }
        return true;
    }




}
