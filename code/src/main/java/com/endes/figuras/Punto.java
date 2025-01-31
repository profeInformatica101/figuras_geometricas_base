package com.endes.figuras;

public class Punto {
	private double x;
	private double y;
	
	public Punto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double distancia(Punto otro) {
		double dx = (otro.getX() - x) * (otro.getX() - x);
		double dy = (otro.getY() - y) * (otro.getY() - y);
		double res = Math.sqrt(dx + dy);
		return res;
	}
}
