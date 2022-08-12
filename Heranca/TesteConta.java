package Heranca;

public class TesteConta {
	
	
//	Criar objetos das duas classes, executar seus métodos e mostrarna tela os
//	valores de seus atributos.

	
//	Tente chamar os métodos creditar e debitar de um objeto poupança. 
//	Eles estão disponíveis?
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Davi");
		cliente.setCpf("123.456.789-11");
		
		ContaCorrente conta1 = new ContaCorrente(100, "111.222.333-44", cliente);
		
		conta1.Creditar(10);
		System.out.println("Novo saldo: " + conta1.getSaldo());
		
		conta1.Debitar(25);
		System.out.println("Novo saldo: " + conta1.getSaldo());
				
		
		Poupanca p = new Poupanca(500, "982-21", cliente);
		
		p.Creditar(200);
	   	System.out.println("Novo saldo: " + p.getSaldo());
	   	 
	   	p.Debitar(400);
	   	System.out.println("Novo saldo: " + p.getSaldo());
	   	 
	   	p.renderJuros(0.10);
	   	System.out.println("Novo saldo: " + p.getSaldo());

	}
}
