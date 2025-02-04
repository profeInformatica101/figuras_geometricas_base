package com.endes.figuras;

public class Circulo extends FiguraGeometrica{
	protected Punto centro;
	protected double radio;
	protected final double PI = Math.PI;
	
	public Circulo (String nombre, String color, Punto centro, double radio) {
		super(nombre, color);
		this.centro = centro;
		if	(radio > 0) {
			this.radio = radio;
		} else {
			this.radio = 1;
		}
	}

	@Override
	public double area() {
		double resultado = PI * radio * radio;
		return resultado;
	}

	@Override
	public double perimetro() {
		double resultado = PI * radio * 2;
		return resultado;
	}
}
