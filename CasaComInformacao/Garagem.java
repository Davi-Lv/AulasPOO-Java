package CasaComInformacao;

public class Garagem {
	int numeroDeCarros;
	boolean coberta;
	Porta porta;

	public Garagem() {

	}

	public Garagem(int numeroDeCarros, boolean coberta, Porta porta) {
		this.numeroDeCarros = numeroDeCarros;
		this.coberta = coberta;
		this.porta = porta;
	}
}
