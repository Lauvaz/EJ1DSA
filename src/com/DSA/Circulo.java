package com.DSA;

public class Circulo extends Figure {
    private double CirculoRadio;
    private double areaCirculo;

    public Circulo (double CirculoRadio){
        this.CirculoRadio=CirculoRadio;
        this.areaCirculo=(Math.pow(CirculoRadio,2)*Math.PI);

    }
    public double getAreaCirculo() {

        return areaCirculo;
    }

    @Override
    public double area() {
        return this.areaCirculo;
    }

}
