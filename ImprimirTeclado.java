import java.util.Scanner;

public class ImprimirTeclado {
	public ImprimirTeclado() {

	}

	// pode adiconar qual quer variavel para imprimir
	String fistNome;
	int cpf;

	// construtor
	public ImprimirTeclado(String fistNome, int cpf) {
		this.fistNome = fistNome;
		this.cpf = cpf;
	}

	// metodo main
	public static void main(String[] args) {

		// imprimir texto para o usuario
		System.out.println("Digite seu nome");

		// ler oque o usuario digitou
		Scanner tecla = new Scanner(System.in);

		// criando um objeto
		ImprimirTeclado t = new ImprimirTeclado();

		// dando um valor para a variavel nome de acordo com oque o usuario digitar
		t.fistNome = tecla.next();

		System.out.println("-------------------");

		// repetindo tudo para cpf
		System.out.println("Digite seu cpf");
		t.cpf = tecla.nextInt();

		// chamar o void imprimir
		t.imprimir();
		
	}

	// void para imprimir os dados
	public void imprimir() {
		System.out.println("-------------------");
		System.out.println("Nome: " + fistNome);
		System.out.println("cpf: " + cpf);
		System.out.println("-------------------");
	}
}
