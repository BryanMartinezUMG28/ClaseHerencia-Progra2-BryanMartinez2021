package com.company.HerenciaII;

public abstract class FiguraGeometricaCuerposGeometricos extends FiguraGeometrica {
    @Override
    String mostrarTipoFigura() {
        return super.mostrarTipoFigura();
    }

    @Override
    double calcularArea() {
        return 0;
    }

    @Override
    double calcularPerimetro() {
        return 0;
    }

    abstract double calcularVolumen();
}