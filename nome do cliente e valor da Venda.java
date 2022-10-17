import java.util.Scanner;

public class Venda {
	
	String nomeCliente;
	double valorTotal;
		
	public Venda() {
		
	}

	public Venda(String nomeCliente, double valorTotal) {	
		this.nomeCliente = nomeCliente;
		this.valorTotal = valorTotal;
			
		}
	
	public void imprimirVenda() {		
		System.out.println("Cliente: " + nomeCliente + ", Valor total da venda: " + valorTotal);
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
	
	    Venda v1 = new Venda();
	    System.out.println("informe o nome do cliente:");
	    v1.nomeCliente = teclado.next();
	    
	    
	    System.out.println("------------------------------------------------------");
	    System.out.println("Informe o valor da venda");
	    v1.valorTotal = teclado.nextDouble();
	    
	    System.out.println("------------------------------------------------------");
	    v1.imprimirVenda();
	    System.out.println("------------------------------------------------------");
	    
	    
	}
		
}

