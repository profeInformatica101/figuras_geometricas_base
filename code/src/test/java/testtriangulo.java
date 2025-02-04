package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.endes.instrumento.Termometro;

class testtriangulo {

	//private Triangulo triangulo;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Antes de todas las pruebas");
	}
	@BeforeEach
	void setUp() throws Exception{
		termometro = new Triangulo("Equilatero", "negro", 1, 1, 1);
	}
	@test
	@Displayname (Area del triangulo)
	public void calculaArea();
		double resultadoEsperado=0;
		triangulo.
}
