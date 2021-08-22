package com.company.HerenciaII;

public abstract class FiguraGeometrica {
    private String forma;

    public FiguraGeometrica(){
        this.forma="Figura Geometrica";
    }

    String mostrarTipoFigura(){
        return this.forma;
    }


    //Agregue radio para poder calcular el circulo

    abstract double calcularArea();
    abstract double calcularPerimetro();

}