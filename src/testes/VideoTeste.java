package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import midia.Video;
import midia.Midia;

public class VideoTeste {
	
	@Test
	public void testCaminhoMidia() {
		Midia midia = new Video("src", "3:38");
		assertEquals("src", midia.getCaminhoMidia());
	}
	
	@Test
	public void testAudio() {
		Video midia = new Video("src", "3:38");
		assertEquals("src", midia.video());
	}
}
