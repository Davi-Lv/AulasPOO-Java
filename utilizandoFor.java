/*
 * Utilizando a estrutura de repetição FOR, 
 * complete o programa abaixo para imprimir todos os 
 * números de 261 a 381 e sempre que o número impresso for par, 
 * imprima ao lado do número o texto “é par”. 
 * Exemplo: 302 é par. Caso o número seja ímpar, 
 * só é necessário imprimir apenas o número. Exemplo: 301
 */

//criando a classe
public class utilizandoFor {
	// metodo main
	public static void main(String[] args) {

		// criando a estrutura de repetição FOR
		// criando uma variavel com o nome(rep) com o tipo INT
		// inicialização; condição; incremento
		for (int rep = 261; rep < 382; rep++) {
			
			//apenas entra neste IF com os valores sobrando zero
				//entrou e adicionoou o nome "par" ao valor par
			if (rep % 2 == 0) {
				System.out.println(rep + " par");
			} 
			//caso não, entre, ele é impar e não é adicionado nada, apensa imprimido
			else
				System.out.println(rep);
		}

		System.out.println("---------------------");
		
		/*
		 * Utilizando uma estrutura de repetição, complete o programa abaixo para
		 * imprimir todos os números de 80 a 340 e sempre que o número impresso for
		 * ímpar, imprima ao lado do número o texto “é ímpar”. Exemplo: 81 é ímpar. Caso
		 * o número seja par, só é necessário imprimir apenas o número. Exemplo: 82.
		 */
		
		//usei o while nesta
			//coloquei uma variavel inteira com o valor de 80
		int rep = 80;
		
		//se essa variavel (rep) for menor que 340, o laço se repete
		while (rep < 340) {
			
			//incrementa mais um
			rep++;
			
			//se a variavel sobrar um valor 1, entra no IF e adicionoou o nome "impar"
			if (rep % 2 == 1) {
				//imprime a resposta com o nome "impar"
				System.out.println(rep + " impar");
			} 
			//se não for impar, apenas o valor é impresso
			else
				System.out.println(rep);
		}

	}
}
