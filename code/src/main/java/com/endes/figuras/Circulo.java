package com.endes.figuras;

/**
 * Clase que representa un circulo
 * Hereda de la clase FiguraGeometrica
 * 
 * @author Juan Carlos Pizarro Alonso
 */
public class Circulo extends FiguraGeometrica{
	
	private Punto centro;
	private double radio;
	private Punto extremo;

	/**
	 * Constructor de la clase Circulo
	 * 
	 * @param nombre Nombre del circulo
	 * @param color Color del circulo
	 * @param centro Punto que representa el centro del circulo
	 * @param radio Radio del circulo
	 * 
	 */
	public Circulo(String nombre, String color, Punto centro, double radio) {
		super(nombre, color);
		this.centro = centro;
		this.radio = radio;		
	}

	/**
	 * Metodo para obtener el area del circulo
	 *  
	 * @return Area del circulo
	 */
	@Override
	public double area() {
		return Math.PI * (radio * radio);
	}

	/**
	 * Metodo para obtener el perimetro del circulo
	 * 
	 * @return Perimetro del circulo
	 */
	@Override
	public double perimetro() {
		return 2 * Math.PI * radio;
	}
	
	/**
	 * Metodo para rotar el circulo el angulo indicado
	 * 
	 * @param angulo Angulo que rota el circulo
	 * 
	 */
	@Override
	public void rotar(double angulo) {
		double X1 = centro.getX() + radio;
		extremo = new Punto(X1, centro.getY());
		double X2 = centro.getX() + (X1 - centro.getX()) * Math.cos(angulo) - (centro.getY() - centro.getY()) * Math.sin(angulo);
		double Y2 = centro.getY() + (X1 - centro.getX()) * Math.sin(angulo) + (centro.getY() - centro.getY()) * Math.cos(angulo);
		extremo.setX(X2);
		extremo.setY(Y2);
	}
	
	/**
	 * Metodo para trasladar el circulo a la posicion indicada
	 * 
	 * @param dx Nueva posicion del eje X del circulo
	 * @param dy Nueva posicion del eje Y del circulo
	 * 
	 */
	@Override
	public void trasladar(double dx, double dy) {
		centro.setX(dx);
		centro.setY(dy);
	}

}
