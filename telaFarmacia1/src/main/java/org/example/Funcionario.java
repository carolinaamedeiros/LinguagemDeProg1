package org.example;

public class Funcionario {

    private String nome;
    private String sexo;
    private String funcao;
    private int salario;

    public Funcionario(String nome, String sexo, String funcao, int salario) {
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

    public void nomesFuncionario() {
        System.out.println("Funcionário: " + this.nome);
    }

    public void somarSalario(){
        System.out.println("Salário: " + salario*12);
    }

    public void sexoFuncionario() {
        System.out.println("Funcionário: " + nome + " Sexo: " + sexo);
    }
}

