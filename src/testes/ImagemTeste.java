package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import midia.Imagem;
import midia.Midia;

public class ImagemTeste {
	
	@Test
	public void testCaminhoMidia() {
		Midia midia = new Imagem("src", "3:38");
		assertEquals("src", midia.getCaminhoMidia());
	}
	
	@Test
	public void testAudio() {
		Imagem midia = new Imagem("src", "3:38");
		assertEquals("src", midia.imagem());
	}
}
