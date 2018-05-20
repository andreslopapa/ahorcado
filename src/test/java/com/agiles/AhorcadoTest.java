package com.agiles;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AhorcadoTest {

	@Test
	void test() {
		Ahorcado ahorcado = new Ahorcado();
		
		String salida = ahorcado.helloAhorcado();
		
		assertEquals("Hello", salida);
	}

}
