package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.java.Ahorcado;

public class AhorcadoTest {

	@Test
	void test() {
		Ahorcado ahorcado = new Ahorcado();
		
		String salida = ahorcado.helloAhorcado();
		
		assertEquals("Hello", salida);
	}

}
