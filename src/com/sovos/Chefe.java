package com.sovos;

public class Chefe extends Employee {
    private double salario;

    public Chefe(String nome, String familia) {
        super(nome, familia);
    }

    public Chefe(String nome, String familia, double salario) {
        super(nome, familia);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double ganha() {
        return getSalario();
    }

    @Override
    public String toString() {
        return "Chefe: " + super.toString();
    }
}
