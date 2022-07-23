package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import midia.Audio;
import midia.Midia;

public class AudioTeste {
	
	@Test
	public void testCaminhoMidia() {
		Midia midia = new Audio("src", "3:38");
		assertEquals("src", midia.getCaminhoMidia());
	}
	
	@Test
	public void testAudio() {
		Audio midia = new Audio("src", "3:38");
		assertEquals("src", midia.audio());
	}
}
