package org.example;

public class Funcionarios {
    private String nome;
    private String sexo;
    private String funcao;
    private int salario;

    public Funcionarios(String nome, String sexo, String funcao, int salario) {
        this.nome = nome;
        this.sexo = sexo;
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void informacoesFuncionario(){
        System.out.println("Funcionario: " + this.nome + ", " + this.sexo + ", " + this.funcao + ", " + this.salario);
    }

    public void somarSalario(){
        System.out.println("Funcionário: " + nome + " Salário anual: " + salario*12);
    }

    public void sexo() {
        System.out.println("Funcionário: " + nome + " Sexo: " + sexo);
    }
}
