package ProjetoTestes;

public class Imagem extends Midia {
	protected String resolucao;
	
	public Imagem(String caminhoMidia, String resolucao) {
		super(caminhoMidia);
		this.resolucao = resolucao;
	}

	@Override
	public String getCaminhoMidia() {
		return caminhoMidia;
	}

	@Override
	public String toString() { //+Imagem
		return this.getClass().getSimpleName() + "\nOrigem: " + this.caminhoMidia + "\nResolução: " + resolucao;	
	}
	
	
}