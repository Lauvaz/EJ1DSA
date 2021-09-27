package com.EJ1DSA;

public class Rectangulo extends Figure {
    private double RectanguloLado1;
    private double RectanguloLado2;
    private double areaRectangulo;

    public Rectangulo(double RectanguloLado1, double RectanguloLado2){
        this.RectanguloLado1=RectanguloLado1;
        this.RectanguloLado2=RectanguloLado2;
        this.areaRectangulo=(RectanguloLado1*RectanguloLado1)+(RectanguloLado2*RectanguloLado2);

    }
    public double getAreaRectangulo() {

        return areaRectangulo;
    }

    @Override
    public double area() {

        return this.areaRectangulo;
    }


}