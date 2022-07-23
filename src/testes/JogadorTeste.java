package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import bean.Jogador;
import bean.JogadorCaptain;
import bean.JogadorNoob;
import bean.Jogo;


public class JogadorTeste {
	
	@Test
	public void testAdicionarJogo(Jogo jogo) {
	};
	
	@Test 
	public void testRemoverJogo(Jogo jogo) {
		Jogador jogador1 = new JogadorNoob("String", "String", "String", "String", 18, "String");
		Jogador jogador2 = new JogadorCaptain("String", "String", "String", "String", 18, "String");
		boolean test1, test2;
		test1 = jogador1.removerJogo(jogo);
		test2 = jogador2.removerJogo(jogo);
		if (test1 == true && 
			test2 == true) {
			System.out.println("Aprovado!");
		}
		else {
			if (test1 != true)
				System.out.println("Jogador Noob Reprovado!");
			else {
				System.out.println("Jogador Captain Reprovado!");
			}
		}
	}
	
	@Test
	public void testImprimirJogos() {
		Jogador jogador1 = new JogadorCaptain("String", "String", "String", "String", 18, "String");
		Jogador jogador2 = new JogadorNoob("String", "String", "String", "String", 18, "String");
		assertEquals("src", jogador1.imprimirJogos());
		assertEquals("src", jogador2.imprimirJogos());
	}
	
	
}
