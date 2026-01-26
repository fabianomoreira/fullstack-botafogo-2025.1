package com.example.demo;

public class Soma {
    private int fator1;
    private int fator2;

    public int getFator1() {
        return fator1;
    }

    public void setFator1(int fator1) {
        this.fator1 = fator1;
    }

    public int getFator2() {
        return fator2;
    }

    public void setFator2(int fator2) {
        this.fator2 = fator2;
    }

    public int calcular(int fator1, int fator2){
        return fator1 + fator2;
    }
}
