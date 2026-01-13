package org.example;
// entidade
public class Chamado {
    private String problema;
    private String categoria;


    public Chamado(String problema, String categoria){
        this.problema = problema;
        this.categoria = categoria;
    }


    public String getProblema() { return problema; }

    public String getCategoria() { return categoria; }


}
