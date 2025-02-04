package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class PuntoTest {
	
	Punto punto;
	
	@BeforeEach
	void setUp() throws Exception{
		punto = new Punto(0.0,0.0);
	}
	
	
	@Test
	@DisplayName ("Prueba constructor")
	void test() {
		double resultadoEsperado=0;
		double resultado;
		resultado = punto.getX();
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	@DisplayName ("getX")
	void test1() {
		double resultadoEsperado = 4.5;
		punto.setX(resultadoEsperado);
		double resultado; 
		resultado = punto.getX();
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	@DisplayName ("getY")
	void test2() {
		double resultadoEsperado = 3;
		punto.setY(resultadoEsperado);
		double resultado; 
		resultado = punto.getY();
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	@DisplayName ("Distancia")
	void test3() {
		Punto punto1 = new Punto(3, 3);
		Punto punto2 = new Punto(3, 2);
		double resultadoEsperado = 1;
		double resultado;
		resultado = punto1.distancia(punto2);
		assertEquals(resultadoEsperado, resultado);
	}

}
