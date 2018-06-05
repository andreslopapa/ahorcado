package com.agiles;

import static org.junit.Assert.*;
import org.junit.Test;

public class AhorcadoTest {
	
	@Test
	void ingresarUnaSolaLetra() {
		Ahorcado ahorcado = new Ahorcado();
		
		ahorcado.ingresarLetra('h');
		
		String letra = ahorcado.getLetrasUsadas();
		
		assertEquals("h", letra);
	}
	
	@Test
	void juegoGanado() {
		Ahorcado ahorcado = new Ahorcado();
		
		ahorcado.ingresarLetra('h');
		ahorcado.ingresarLetra('o');
		ahorcado.ingresarLetra('l');
		ahorcado.ingresarLetra('a');
		
		boolean ganador = ahorcado.isGanador();
		
		assertEquals(true, ganador);
	}
	
	@Test
	void juegoPerdido() {
		Ahorcado ahorcado = new Ahorcado();
		
		ahorcado.ingresarLetra('h');
		ahorcado.ingresarLetra('a');
		ahorcado.ingresarLetra('l');
		ahorcado.ingresarLetra('a');
		
		boolean ganador = ahorcado.isGanador();
		
		assertEquals(false, ganador);
	} 
	
	/* @Test
	void juegoGanadoConCincoLetras() {
		Ahorcado ahorcado = new Ahorcado();
		
		ahorcado.ingresarLetra('h');
		ahorcado.ingresarLetra('p');
		ahorcado.ingresarLetra('l');
		ahorcado.ingresarLetra('a');
		ahorcado.ingresarLetra('o');
		
		boolean ganador = ahorcado.isGanador();
		
		assertEquals(true, ganador);
	}  */
	
	@Test
	void juegoGanadoConCincoLetras() {
		Ahorcado ahorcado = new Ahorcado();
		
		ahorcado.ingresarLetra('p');
		ahorcado.ingresarLetra('j');
		ahorcado.ingresarLetra('n');
		
		int errores = ahorcado.getErroresRestantes();
		
		assertEquals(1, errores);
	}  
	
	@Test
	void finConErroresRestantesCero() {
		Ahorcado ahorcado = new Ahorcado();
		
		ahorcado.ingresarLetra('p');
		ahorcado.ingresarLetra('j');
		ahorcado.ingresarLetra('m');
		ahorcado.ingresarLetra('d');
		
		int errores = ahorcado.getErroresRestantes();
		
		assertEquals(0, errores);
	} 
	
	@Test
	void mostrarLetrasIngresadas() {
		Ahorcado ahorcado = new Ahorcado();
		
		ahorcado.ingresarLetra('p');
		ahorcado.ingresarLetra('j');
		ahorcado.ingresarLetra('n');
		
		String letras = ahorcado.getLetrasUsadas();
		
		assertEquals("pjn", letras);
	}
	
	@Test
	void irMostrandoPalabra() {
		Ahorcado ahorcado = new Ahorcado();
		
		ahorcado.ingresarLetra('h');
		ahorcado.ingresarLetra('j');
		ahorcado.ingresarLetra('l');
		
		String mostrado = ahorcado.mostrarPalabra();
		
		assertEquals("h_l_", mostrado);
	}

	@Test
	void ingresarPalabraCompleta() {
		Ahorcado ahorcado = new Ahorcado();
		
		ahorcado.ingresarPalabra("hola");
		
		String mostrado = ahorcado.getLetrasUsadas();
		
		assertEquals("hola", mostrado);
	}
	
	@Test
	void cargarNuevaPalabra() {
		Ahorcado ahorcado = new Ahorcado();

		int cantidadAntes = ahorcado.getCantidadPalabras(); 
		ahorcado.addPalabra("hola");
		int cantidadDespues = ahorcado.getCantidadPalabras();
		
		assertTrue(cantidadDespues == (cantidadAntes+=1));
	}
	
	@Test
	void seleccionarPalabra() {
		Ahorcado ahorcado = new Ahorcado();

		ahorcado.seleccionarPalabra("hola");
		
		juegoGanado();
	}
}
