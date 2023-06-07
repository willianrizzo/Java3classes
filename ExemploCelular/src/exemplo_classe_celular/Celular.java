package exemplo_classe_celular;

import java.util.Scanner;

public class Celular {

	public static void main(String[] args) {
		MetodosClasse celular = new MetodosClasse(false, 99999999);
		Scanner digitar = new Scanner(System.in);
		
		System.out.println("Menu do Celular");
		System.out.println("---------------");
		System.out.println("Digite 1 para ligar");
		System.out.println("Digite 2 para desligar");
		System.out.println("Digite 3 para telefonar");
		System.out.println("Digite 4 para sair");
		System.out.println("---------------");
		
		int opcao;
		
		do   {
			opcao = digitar.nextInt();
			
			switch (opcao) {
			case 1:
				celular.ligar();
				break;
			
			case 2:
				celular.desligar();
				break;
			
			case 3:
				celular.ligarParaNumero();
				break;
				
			case 4:
				System.out.println("Saindo...");
				break;
				
			default:
				System.out.println("Opção invalida!");
				break;
		}
	} while (opcao != 4);
		
		
	}
}


