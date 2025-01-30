package com.endes.figuras;

/*
 * @author Juan Carlos Pizarro Alonso
 */

public class Circulo extends FiguraGeometrica{
	
	//private Punto centro;
	private double radio;

	/*
	 * @param
	 * 
	 * @return
	 */
	
	// falta Punto centro
	
	public Circulo(String nombre, String color, double radio) {
		super(nombre, color);
		this.radio = radio;		
	}

	/*
	 * @param
	 * 
	 * @return
	 */
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * (radio * radio);
	}

	/*
	 * @param
	 * 
	 * @return
	 * 
	 */
	
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radio;
	}
	
	/*
	 * @param
	 * 
	 * @return
	 */
	
	public void rotar(double angulo) {
		
	}
	
	/*
	 * @param
	 * 
	 * @return
	 */
	
	public void trasladar(double dx, double dy) {
		
	}

	

}
