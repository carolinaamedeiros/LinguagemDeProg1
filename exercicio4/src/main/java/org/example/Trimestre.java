package org.example;


public class Trimestre {
    void main() {
    Balanco balanco = new Balanco(15000, 23000, 17000);
        int total = balanco.soma();
        double media = balanco.media();
    System.out.println("Balanço do trimestre:");
    System.out.println("Total: " + total);
    System.out.println("Média: " + media);

    }
}
