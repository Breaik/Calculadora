package com.company;

public class Calculadora implements Interface {
    private float valor;

    @Override
    public void premium0() {
        this.setValor(getValor()+29.90f);
    }

    @Override
    public void essencial() {
        this.setValor(getValor()+15);
    }

    @Override
    public void essencialPlus1() {
        this.setValor(getValor()/100 * 15 + getValor());
    }

    @Override
    public void resultado() {
        System.out.println("O valor do seu plano é de R$ "+getValor()+" mensais");
    }

    @Override
    public void essencialPlus2() {
        this.setValor(getValor()/100 * 20 + getValor());
    }


    @Override
    public void tabelaFip(float x) {
        if (x <= 15) {
            this.valor = 99;
        }
        else if(x <= 20){
            this.valor = 120;
        }
        else if(x <= 25){
            this.valor = 140;
        }
        else if(x <= 30){
            this.valor = 160;
        }
        else if(x <= 35){
            this.valor = 180;
        }
        else {
            System.out.println("Inválido");
        }
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
