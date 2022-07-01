//importando o scanner
import java.util.Scanner;

//criando a classe
public class SwitchCase {
	//criando um metodo main 
	public static void main(String[] args) {
		
		//objeto para scanear a tecla do usuario
		Scanner mes = new Scanner(System.in);
		//imprimindo
		System.out.println("Digite o mes");
			//usando switch para ser chamado de acordo com oque o usuario digitar
			switch(mes.nextInt()) {
		    case 1:
		    	System.out.println("Janeiro");
		   		 break;
		    case 2:
		    	System.out.println("Fevereiro");
		   		 break;		   		 
		    case 3:
		    	System.out.println("Março");
		   		 break;		   		 
		    case 4:
		    	System.out.println("Abril");
		   		 break;		   		 
		    case 5:
		    	System.out.println("Maio");
		   		 break;		   		 
		    case 6:
		    	System.out.println("Junho");
		   		 break;		   		 
		    case 7:
		    	System.out.println("Julho");
		   		 break;		   		 
		    case 8:
		    	System.out.println("Agosto");
		   		 break;		   		 
		    case 9:
		    	System.out.println("Setembro");
		   		 break;		   		 
		    case 10:
		    	System.out.println("Outubro");
		   		 break;		   		 
		    case 11:
		    	System.out.println("Novembro");
		   		 break;		   		 
		    case 12:
		    	System.out.println("Dezembro");
		   		 break;		   		 
		    default:
		   		 System.out.println("Valor invalido! escolha o mes de 1 a 12");
		   		 
		}			
		}
	}
