package com.company.HerenciaII;

public class Circulo extends FiguraGeometricaPlana {

    //Comentario para visualiar lo nuevo agregado
    //Para poder obtener el radio de nuestro circulo extendido desde figura geometrica, y plana.

    private double calcularRadio;

    public Circulo(){
        calcularRadio = 0.0;

    }

    public void setRadio (double nuevoRadio){
        calcularRadio = nuevoRadio;
    }

    public double getRadio(){
        return calcularRadio;
    }

    public double calcularArea(){
        return Math.PI * calcularRadio * calcularRadio;

    }

    public double calcularPerimetro(){
        return (2 * calcularRadio * Math.PI);
    }

    @Override
    public String mostrarTipoFigura(){
        return "Circulo("+calcularRadio+")";
    }
}