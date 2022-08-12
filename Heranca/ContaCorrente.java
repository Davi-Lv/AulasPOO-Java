package Heranca;

//Atributos
public class ContaCorrente{
	private int Numero;
	private double Saldo;
//	(composição com a classe Cliente, atributos da classe Cliente: nome e cpf)
	private Cliente cliente; 
	
	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

//Metodos
	
//	(lógica: recebe um valor por parâmetro e credita esse valor ao saldo)
	void Creditar (double ValorCreditar) {
		this.Saldo = this.Saldo + ValorCreditar;
	}
	
//	(lógica: recebe um valor por parâmetro e debita esse valor ao saldo. 
//	Este algoritmo não deve aceitar que o saldo fique negativo)
	void Debitar (double ValorDebitar) {
		if (ValorDebitar >= Saldo) {
			this.Saldo = this.Saldo - ValorDebitar;
		}
	}

//	construtor
	
//	Um construtor que inicialize todos os atributos usando os parâmetros.
	public ContaCorrente(int numero, double saldo, Cliente cliente) {
		super();
		Numero = numero;
		Saldo = saldo;
		this.cliente = cliente;
	}

	public ContaCorrente(int numero2, String string, Cliente cliente2) {
		
	}


}
