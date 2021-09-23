package com.DSA;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a = 7;
        Rectangulo rectangulo=  new Rectangulo(a, a);
        System.out.println("Área del rectangulo es " + rectangulo.getAreaRectangulo());

        Cuadrado cuadrado=  new Cuadrado(a);
        System.out.println("Área del cuadrado es " + cuadrado.getAreaCuadrado());

        Triangulo triangulo = new Triangulo(a,a);
        System.out.println("Área del triangulo es " + triangulo.getAreaTriangulo());

        Circulo circulo = new Circulo(a);
        System.out.println("Área del circulo es " + circulo.getAreaCirculo());

        Figure[] v = new Figure[4];
        v[0]=circulo;
        v[1]=rectangulo;
        v[2]=triangulo;
        v[3]=cuadrado;
        double Suma=sum(v);
        System.out.println(Suma);

/*
        sum(v);
        Area suma = new Area(a);
        System.out.println("La suma de las áreas anteriores es " + suma.getSuma());

 */
    }

    public static double sum(Figure[] v) {
        double sum=0;
        for (Figure f: v) {
            sum=sum+f.area();
        }
        return sum;


    }

}
