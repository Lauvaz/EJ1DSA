package com.EJ1DSA;

public class Triangulo extends Figure{
    private double TrianguloBase;
    private double TrianguloAltura;
    private double areaTriangulo;

    public Triangulo (double TrianguloBase, double TrianguloAltura){
        this.TrianguloBase=TrianguloBase;
        this.TrianguloAltura=TrianguloAltura;
        this.areaTriangulo=((TrianguloBase*TrianguloAltura)/2);

    }
    public double getAreaTriangulo() {
        return areaTriangulo;
    }

    @Override
    public double area() {
        return this.areaTriangulo;
    }
}
