package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.Ahorcado;

class AhorcadoTest {

	@Test
	void test() {
		Ahorcado ahorcado = new Ahorcado();
		
		String salida = ahorcado.helloAhorcado();
		
		assertEquals("Hello", salida);
	}

}
