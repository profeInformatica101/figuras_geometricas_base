package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CirculoTest {

	Circulo circulo;
	@BeforeEach
	void setup() throws Exception {
		 circulo = new Circulo("Circulo 1" , "rojo" , new Punto(2,2), 2);
	}
	
	/**
	 * Pruebas delconstructor
	 */
	
	@Test
	@DisplayName("Contructor radio negativo")
	void constructorRadioNegativo () {
		Circulo circulo = new Circulo("Circulo 1" , "rojo" , new Punto(2,2), -2);
		Circulo circuloEsperado = new Circulo("Circulo 1" , "rojo" , new Punto(2,2), 1);
		double radioCirculo = circulo.radio;
		double radioCirculoEsperado = circuloEsperado.radio;
		assertEquals(radioCirculo, radioCirculoEsperado, "El contructor no funciona correctamente");
	}
	
	/**
	 * Pruebas del metodo `area()`
	 */
	
	@Test
	@DisplayName("Obtener area")
	void testArea () {
		double resultadoEsperado = circulo.radio * circulo.radio * Math.PI;
		double resultadObtenido = circulo.area();
		
		assertEquals(resultadObtenido, resultadoEsperado, "La funcion area no funciona");
	}
	
	/**
	 * Pruebas del metodo `perimetro()`
	 */
	
	@Test
	@DisplayName("Obtener perimetro")
	void testPerimetro () {
		double resultadoEsperado = circulo.radio * 2 * Math.PI;
		double resultadObtenido = circulo.perimetro();
		
		assertEquals(resultadObtenido, resultadoEsperado, "La funcion perimetro no funciona");
	}
}
