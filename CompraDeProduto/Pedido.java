package CompraDeProduto;

public class Pedido {

	Produto produto;
	int quantidade;
	int valorTotal;
	
	public Pedido(Produto produto, int quantidade, int valorTotal) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorTotal = valorTotal; 
	}

	public Pedido() {

	}
	
	void adicionarProduto (Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorTotal = produto.valor * quantidade;
		
	}
}
