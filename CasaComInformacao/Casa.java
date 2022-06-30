package CasaComInformacao;

public class Casa {
	Endereco endereco;
	String cor;
	Porta porta;
	Garagem garagem;
	boolean temMuro;
	Proprietario proprietario;

	public Casa() {

	}

	public Casa(Endereco endereco, String cor, Porta porta, Garagem garagem, boolean temMuro,
			Proprietario proprietario) {
		this.endereco = endereco;
		this.cor = cor;
		this.porta = porta;
		this.garagem = garagem;
		this.temMuro = temMuro;
		this.proprietario = proprietario;
	}
}