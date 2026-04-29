package org.example;

public class Remedios {
    private String nome;
    private String tipo;
    private double valor;
    private int quantidade;

    public Remedios(String nome, String tipo, double valor, int quantidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.quantidade = quantidade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void tipoRemedio(){
        System.out.println("Tipo de Remedio: " + tipo);
    }

    public void adicionarEstoque(){
        quantidade++;
        System.out.println("Remédio adicionado: " + quantidade);
    }

    public void retirarEstoque(){
        quantidade--;
        System.out.println("Remédio vendido: " + quantidade);
    }
}

