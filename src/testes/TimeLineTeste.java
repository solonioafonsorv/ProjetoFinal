package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import post.TimeLine;

public class TimeLineTeste {
	
	@Test
	public void testeVisualizarPosts() {
		TimeLine timeline = new TimeLine();
		assertEquals("src", timeline.visualizarPosts());
	}
	
	@Test
	public void testeCurtidasTotais() {
		TimeLine timeline = new TimeLine();
		assertEquals("src", timeline.curtidasTotais());
	}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
}
