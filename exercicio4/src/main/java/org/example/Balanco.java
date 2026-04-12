package org.example;

public class Balanco {
    private int janeiro = 15000;
    private int fevereiro = 23000;
    private int marco = 17000;

    public Balanco(int janeiro, int fevereiro, int marco) {
        this.janeiro = janeiro;
        this.fevereiro = fevereiro;
        this.marco = marco;
    }

    public int getJaneiro() {
        return janeiro;
    }

    public void setJaneiro(int janeiro) {
        this.janeiro = janeiro;
    }

    public int getFevereiro() {
        return fevereiro;
    }

    public void setFevereiro(int fevereiro) {
        this.fevereiro = fevereiro;
    }

    public int getMarco() {
        return marco;
    }

    public void setMarco(int marco) {
        this.marco = marco;
    }

    public int soma() {
        return janeiro + fevereiro + marco;
    }

    public double media() {
        return soma() / 3;
    }
}
