package com.endes.figuras;

/**
 * Clase que representa un Triángulo, hereda de FiguraGeometrica.
 */
public class Triangulo extends FiguraGeometrica {
    // Propiedades específicas del triángulo
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;

    /**
     * Constructor de la clase Triangulo.
     * 
     * @param nombre Nombre del triángulo.
     * @param color  Color del triángulo.
     * @param v1     Primer vértice del triángulo.
     * @param v2     Segundo vértice del triángulo.
     * @param v3     Tercer vértice del triángulo.
     */
    public Triangulo(String nombre, String color, Punto v1, Punto v2, Punto v3) {
        super(nombre, color);
        this.vertice1 = v1;
        this.vertice2 = v2;
        this.vertice3 = v3;
    }

    /**
     * Calcula el área del triángulo utilizando la fórmula del determinante.
     * 
     * @return El área del triángulo.
     */
    @Override
    public double area() {
        double x1 = vertice1.getX(), y1 = vertice1.getY();
        double x2 = vertice2.getX(), y2 = vertice2.getY();
        double x3 = vertice3.getX(), y3 = vertice3.getY();

        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }

    /**
     * Calcula el perímetro del triángulo sumando las longitudes de sus lados.
     * 
     * @return El perímetro del triángulo.
     */
    @Override
    public double perimetro() {
        double lado1 = vertice1.distancia(vertice2);
        double lado2 = vertice2.distancia(vertice3);
        double lado3 = vertice3.distancia(vertice1);

        return lado1 + lado2 + lado3;
    }

    /**
     * Rota el triángulo en torno a un punto central un ángulo dado.
     * 
     * @param angulo Ángulo en radianes para la rotación.
     */
    @Override
    public void rotar(double angulo) {
        vertice1.rotar(angulo);
        vertice2.rotar(angulo);
        vertice3.rotar(angulo);
    }

    /**
     * Traslada el triángulo por un vector (dx, dy).
     * 
     * @param dx Desplazamiento en el eje X.
     * @param dy Desplazamiento en el eje Y.
     */
    @Override
    public void trasladar(double dx, double dy) {
        vertice1.trasladar(dx, dy);
        vertice2.trasladar(dx, dy);
        vertice3.trasladar(dx, dy);
    }
}
