package ProjetoTestes;

public class Video extends Midia {
	protected String duracao;

	public Video(String caminhoMidia, String duracao) {
		super(caminhoMidia);
		this.duracao = duracao;
	}

	@Override
	public String getCaminhoMidia() {
		return caminhoMidia;
	}

	@Override
	public String toString() { //+Video
		return this.getClass().getSimpleName() + "\nOrigem: " + this.caminhoMidia + "\nDuração: " + duracao;
	}
}