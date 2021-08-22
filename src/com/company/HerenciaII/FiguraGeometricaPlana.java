package com.company.HerenciaII;

public abstract class FiguraGeometricaPlana extends FiguraGeometrica {

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    //Agregue calcularRadio para poder realizar mejor el circulo
    @Override
    public double calcularRadio(){
        return 0;
    }
}