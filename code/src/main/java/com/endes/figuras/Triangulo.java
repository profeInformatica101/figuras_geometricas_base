package com.endes.figuras;

public class Triangulo extends FiguraGeometrica {
	private Punto = vertice1; //representa la base
	private Punto = vertice2;	// representamos altura
	private Punto = vertice3;
	
	public Triangulo(String nombre, String color, Punto v1, Punto v2, Punto v3) {
		super(nombre,color);
		
	}

	@Override
	public double area() {
		
		return (v1*v2)/2;
	}

	@Override
	public double perimetro() {
		
		return v1+v2+v3;
	}

	
	public void rotar(double angulo) {
		
	}
	public void trasladar(double dx, double dy) {
        
    }



}