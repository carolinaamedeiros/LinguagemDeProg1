package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FarmController {

    @FXML
    private Button btCadastrarNome;

    @FXML
    private Button btCadastrarSexo;

    @FXML
    private Button btCalcularSalario;

    @FXML
    private Label lbNomeFunc;

    @FXML
    private Label lbSalario;

    @FXML
    private Label lbSexoFunc;

    @FXML
    private TextField txtNomeFunc;

    @FXML
    private TextField txtSalario;

    @FXML
    private TextField txtSexoFunc;

    @FXML
    void cadastrarNomeFunc(ActionEvent event) {
        String nome =  txtNomeFunc.getText();
    }

    @FXML
    void cadastrarSexoFunc(ActionEvent event) {
        String sexo = txtSexoFunc.getText();
    }

    @FXML
    void calcularSalarioFunc(ActionEvent event) {
        double Salario = Double.parseDouble(txtSalario.getText());
        txtSalario.clear();
        txtSalario.setText(String.format("%.2f", +Salario*12));

    }
// txtComida.setText(comida.getNome());
//        txtTipo.setText(comida.getTipo());
//        txtValor.setText(comida.getPreco()+"");
}
