/**
 * 
 */
package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class CirculoTest {

	Circulo circulo;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		Punto centro = new Punto(2,2);
		double radio = 10;
		Punto extremo = new Punto(centro.getX() + radio, centro.getY());
		circulo = new Circulo("Primero", "Azul", centro, radio);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test del constructor de la clase Circulo
	 * 
	 * 
	 */
	@Test
	@DisplayName("Test constructor clase Circulo")
	void testConstructor() {
		String nombreEsperado = "Primero";
		String nombre = circulo.getNombre();
		assertEquals(nombreEsperado, nombre);
	}
	
	/**
	 * Test del metodo para obtener el centro del circulo
	 */
	/*@Test
	@DisplayName("Test metodo obtener centro")
	void testGetCentro() {
		Punto resultadoEsperado = new Punto(2,2);
		Punto resultado = circulo.getCentro();
		assertEquals(resultadoEsperado, resultado);
	}*/
	
	/**
	 * Test del metodo para obtener el radio del circulo
	 */
	@Test
	@DisplayName("Test metodo obtener radio")
	void testGetRadio() {
		double resultadoEsperado = 10;
		double resultado = circulo.getRadio();
		assertEquals(resultadoEsperado, resultado);
	}
	
	/**
	 * Test para obtener el punto extremo del circulo
	 */
	/*@Test
	@DisplayName("Test metodo obtener extremo")
	void testGetExtremo() {
		Punto resultadoEsperado = new Punto(4,2);
		Punto resultado = circulo.getExtremo();
		assertEquals(resultadoEsperado, resultado);
	}*/
	
	/**
	 * Test del metodo area()
	 * 
	 */
	@Test
	@DisplayName("Test del metodo para obtener el area del circulo")
	void testArea() {
		double resultadoEsperado = Math.PI * (10*10);
		double resultado = circulo.area();
		assertEquals(resultadoEsperado, resultado);
	}
	
	/**
	 * Test del metodo perimetro()
	 * 
	 */
	@Test
	@DisplayName("Test del metodo para obtener el perimetro del circulo")
	void testPerimetro() {
		double resultadoEsperado = 2 * Math.PI * 10;
		double resultado = circulo.perimetro();
		assertEquals(resultadoEsperado, resultado);
	}
	
	/**
	 * Test del metodo rotar()
	 * 
	 */
	/*@Test
	@DisplayName("Test del metodo para rotar el circulo")
	void testRotar() {
		circulo.rotar(Math.PI / 2);  // Rotar 90 grados (PI/2 radianes)
        
        // El punto extremo debe estar en (0, 5) tras la rotación
        assertEquals(0, circulo.getExtremo().getX(), 0.01, "El punto extremo X no se rotó correctamente");
        assertEquals(5, circulo.getExtremo().getY(), 0.01, "El punto extremo Y no se rotó correctamente");
	}*/
	
	/**
	 * Test del metodo trasladar()
	 * 
	 */
	/*@Test
	@DisplayName("Test del metodo para trasladar el circulo de un punto a otro")
	void testTrasladar() {
		circulo.trasladar(2, 3);
        assertEquals(2, circulo.getCentro().getX());
        assertEquals(3, circulo.getCentro().getY());
	}*/
}
