package org.example;

//import static jdk.vm.ci.code.CodeUtil.M;


public class Farmacia {
    void main() {
        Funcionarios funcionario1 = new Funcionarios("João", "M", "Farmaceutico", 5000);
        funcionario1.informacoesFuncionario();
        Funcionarios funcionario2 = new Funcionarios("Joaquina", "F", "Gerente", 7000);
        funcionario2.informacoesFuncionario();
        funcionario1.somarSalario();
        funcionario2.somarSalario();
        funcionario1.sexo();
        funcionario2.sexo();

        Remedios remedio1 = new Remedios("Tylenol", "Comprimido", 10, 3);
        remedio1.tipoRemedio();
        remedio1.adicionarEstoque();
        remedio1.retirarEstoque();

        OutrosProdutos produto1 = new OutrosProdutos("chocolate", "comida", 5);
        OutrosProdutos produto2 = new OutrosProdutos("esmalte", "beleza", 4.5);
        produto1.categoriasDisponiveis();
        produto2.categoriasDisponiveis();
        produto1.produtosDisponiveis();
        produto2.produtosDisponiveis();
        produto1.mensagemFinal();
        produto2.mensagemFinal();
    }
}

