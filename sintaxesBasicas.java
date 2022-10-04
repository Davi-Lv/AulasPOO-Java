/*
 * todos os exemplos não contem tudo do java, 
 * apenas uma ou duas representações
 * apenas aplicando alguns aprendizados na pratica
 */

//clase
public class sintaxesBasicas {
	//metodo main
	public static void main(String[] args) {
		//sintaxes basicas do Java
				
		//exemplo de comentário simples
		
		/*
		 * exemplo de comentário em bloco
		 * podendo adicionar em varias linhas
		 * oque desejar
		 */
		
		/**
		 * exemplo de comentario do tipo Javadoc
		 */
		
		//a linha de codigo só termina quando tem um ponto e virgula ";"
			//comando para imprimir na tela.
		System.out.println("imprimir algo"
				+ " na tela");
		
		//como declarar uma variavel ?
			// <tipo> <indentificador> [= <valor>];
		int idade = 21;
		String name = "Davi";
		
		//tipos primitivos 

			//exemplo do tipo numerico
			int number = 300;
			float numero = 10.4f;
			System.out.println(number);
			System.out.println(numero);
			
			//exemplo do tipo caracteres
				//char apenas recebe apenas um caractere
			char sexo = 'M';
			System.out.println(sexo);
			
		//tipo especial no java chamado String (tipo referencia)
		String nome = "Davi ";
		
		//atribuir um valor para uma variavel declarada
		String sobreNome;
		sobreNome = "Mordonho";
		
		//ao usar a operação mais (+) o java concatena os dois textos
		System.out.println(nome + sobreNome);
		System.out.println("idade = " + idade);
		
				
		//declarando um tipo para varias variaveis
		int ano, dia, mes;
		ano = 2001;
		dia = 11;
		mes = 05;
		
		
		
		//operadores aritméticos
			
			//mutiplicar *			
			//dividir /
			//resto pra divisão 1 %
			//subitrair -
			//somar +
			
		//operando valores com tipos diferentes 
			//byte + int = (o resultado sempre ira ser o maior tipo (int > byte) então o resultado é um int)
		
		//operadores de comparação
			//> maior que: descrição(op maior que op) uso(op > op)
			//>= maior ou igual
			//< menor que
			//<= menor ou igual
			//== igual
			//!= diferente
		
		//comparação com boolean
			//&& se a e b forem true retorna false e ao contrario tb
			//& msm coisa só que a e b é avaliado
			//|| retorna true se a ou b for true se a for true b n é avaliado
			//| msm coisa só que a e b é avaliado
			//^ retorna true se a ou b for true avalia a e b
			//! retorna true se a for false (!a)
		
		//operador de incremento e decremento
			//-- decrementa a op em 1 (--op)
			//++ incrementa a op em 1 (++op)
		
		boolean test1 = true;
		boolean test2 = true;
		System.out.println(test1 && test2);
		
		//operador ternario
			//x é igual a y ? se sim entregue 1 se não entregue 0
		int x = 20;
		int y = 20;
		int z = x == y ? 1 : 0;
		
		System.out.println(z);		
		
	}

}
