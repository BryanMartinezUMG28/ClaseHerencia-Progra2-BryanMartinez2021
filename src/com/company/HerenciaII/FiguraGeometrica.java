package com.company.HerenciaII;

public abstract class FiguraGeometrica {
    private String forma;

    public FiguraGeometrica(){
        this.forma="Figura Geometrica";
    }

    String mostrarTipoFigura(){
        return this.forma;
    }

    abstract double calcularArea();
    abstract double calcularPerimetro();
}