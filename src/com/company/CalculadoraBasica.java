package com.company;

public class CalculadoraBasica {
    private String nombreDeClase;

    public CalculadoraBasica(){
        this.nombreDeClase="Calculadora Basica";
    }

    public  double sumar(double primerNumero, double segundoNumero){
        return primerNumero+segundoNumero;
    }

    public  double resta(double primerNumero, double segundoNumero){
        return primerNumero-segundoNumero;
    }
    public  double multriplicar(double primerNumero, double segundoNumero){
        return primerNumero*segundoNumero;
    }

    protected double restarVariosNumeros(){
        return 0.0;
    }

    public double sumarVariosNumeros(double [] variosNumeros){
        //el procedimiento
        return 0.0;
    }

}
