package ProjetoTestes;

public class Audio extends Midia {
	protected String duracao;

	public Audio(String caminhoMidia, String duracao) {
		super(caminhoMidia);
		this.duracao = duracao;
	}

	@Override
	public String getCaminhoMidia() {
		return caminhoMidia;
	}

	@Override
	public String toString() { //+Audio
		return this.getClass().getSimpleName() + "\nOrigem: " + this.caminhoMidia + "\nDuração: " + duracao;
	}
}