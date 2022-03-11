package com.sovos;

public class PorComissao extends Employee{
    private double salario;
    private double comissao;
    private int vendas;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public PorComissao(String nome, String familia, double salario, double comissao, int vendas) {
        super(nome, familia);
        this.salario = salario;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return "Por item: " + super.toString();
    }

    @Override
    public double ganha() {
        return getSalario()+getComissao()*getVendas();
    }
}
