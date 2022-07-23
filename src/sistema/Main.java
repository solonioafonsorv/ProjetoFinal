package sistema;

import bean.Jogador;
import bean.JogadorCaptain;
import bean.JogadorNoob;
import bean.Jogo;
import midia.Imagem;
import post.Post;
public class Main {
    
    public static void main(String[] args) {
    	Post post1 = new Post("It can heal all diseases", 65);
    	Jogo game1 = new Jogo(187.30, "GoodOfFar");
    	Jogo game2 = new Jogo(120.20, "LauraProoft");
    	post1.adicionarMidia(new Imagem("/home/Cherry_Tree.png", "1980x1080"));
    	Jogador jogador1 = new JogadorNoob("Tony", "Tony", "Choppa", "TonyTonyChoppa@Strawhats.com", 21, "MrHiriluk");
    	jogador1.adicionarJogo(game1);
    	jogador1.adicionarJogo(game2);
    	jogador1.adicionarPost(post1);
    	System.out.println(jogador1.toString());
    }
    
}
