package com.sovos;

public class PorHora extends Employee {
    private double valor;
    private double horas;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public PorHora(String nome, String familia, double valor, double horas) {
        super(nome, familia);
        this.valor = valor;
        this.horas = horas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double ganha() {
        return getHoras()*getValor();
    }

    @Override
    public String toString() {
        return "PorHora: " +
                super.toString();
    }
}
