package com.company.HerenciaII;

public class Triangulo extends FiguraGeometricaPlana {

        //Al igual que el circulo extenienda, y agregar para obtener perimetro
    private double calcularPerimetro;

    public Triangulo(){
        calcularPerimetro = 0.0;

    }

    public void setArea (double nuevoPerimetro){
        calcularPerimetro = nuevoPerimetro;
    }

    public double getPerimetro(){
        return calcularPerimetro;
    }


    @Override
    public String mostrarTipoFigura(){
        return "Circulo("+calcularPerimetro+")";
    }
}