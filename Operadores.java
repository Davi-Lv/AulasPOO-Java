//criando a classe
public class ExercicioOperadores {
	//metodo main
	public static void main(String[] args) {
		//adicionando o tipo INT para as variaveis a,b,c
		int a, b, c;
		
		//adicionando valores as variaveis a,b
		a = 5;
		b = 2;
		//somando e incrementando em 1 a variavel a
		c = b-- + ++a;
		System.out.println(c);
		//imprimindo o valor 8
		
		//adicionando outros valores para as variaveis a,b,c
		a = 2;
		b = 3;
		c = 4;
		c -= a + 5;
		System.out.println(c);
		//imprimindo o valor -3
		
		//adicionando outros valores para as variaveis a,b
		a = 6;
		b = 8;
		//se a for maior ou igual a b ele retorna 15 se verdadeiro e 10 se falso usando o operador ternario
		c = a >= b ? 15 : 10;
		System.out.println(c);
		//imprimindo o valor 10 
		
		//concatenando as strings.
		String x = "5";
		String y = "5";
		//concatenando (juntando) as Strings x e y 
		String z = x + y;
		System.out.println(z);
		//iprimindo a String 55
		
		/*
		* ele não soma os numeros dessa conta por qua não são numeros,
		* eles estão transformados em Strings e a "soma" na verdade faz a junção de x e y
		/*
	}
}
