package Heranca;

/* Crie a classe Poupanca, que deverá ser uma subclasse de ContaCorrente e implemente 
 * o método renderJuros(double taxa), que incrementa o saldo da conta de acordo com 
 * a taxa passada por parâmetro.
 */

public class Poupanca extends ContaCorrente {
	
	public Poupanca(int numero, String string, Cliente cliente) {
		super(numero, string, cliente);
	}
	
	void renderJuros(double taxa) {
		double novoSaldo = super.getSaldo();
		novoSaldo = novoSaldo + (novoSaldo * taxa);
		super.setSaldo(novoSaldo);
	}
}
