package com.DSA;

public class Cuadrado extends Rectangulo{
    private int CuadradoLado;
    private int areaCuadrado;

    public Cuadrado(int CuadradoLado){
        super (CuadradoLado,CuadradoLado);


    }
    public int getAreaCuadrado() {
        return areaCuadrado;
    }
}
