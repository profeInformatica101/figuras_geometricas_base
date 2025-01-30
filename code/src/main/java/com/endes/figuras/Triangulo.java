package com.endes.figuras;

public class Triangulo extends FiguraGeometrica {
	private Punto = vertice1; //representa la base
	private Punto = vertice2;	// representamos altura
	private Punto = vertice3;
	public Triangulo(String nombre, String color, Punto v1, Punto v2, Punto v3) {
		super(nombre,color);
	}
	



	@Override
	public double area(Punto v1, Punto v2) {
		double resultado;
		resultado= (v1*v2)/2
		return resultado;
	}

	@Override
	public double perimetro(Punto v1, Punto v2, Punto v3) {
		double res=v1+v2+v3;
		
		return res;
	}
}