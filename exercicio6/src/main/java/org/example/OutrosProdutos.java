package org.example;

public class OutrosProdutos {
    String nome;
    String categoria;
    double valor;

    public OutrosProdutos(String nome, String categoria, double valor) {
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void produtosDisponiveis(){
        System.out.println("Produtos disponíveis: " + nome);
    }
    public void categoriasDisponiveis(){
        System.out.println("Categoria: " + categoria);
    }

    public void mensagemFinal(){
        System.out.println("Compra realizada com sucesso!");
    }
}
