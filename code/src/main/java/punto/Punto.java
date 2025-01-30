package punto;

public class Punto  {
	double y;
	double x;
	
	public Punto(double x, double y) {
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
		double dx = otro.x - x;
		double dy = otro.y - y;
		double resultado = Math.sqrt(dx*dx + dy*dy);
		return resultado;
	}
}
