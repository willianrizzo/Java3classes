package exemplo_classe_garrafa;

import java.util.Scanner;

public class MetodosGarrafa {
	boolean quantidade;
	String marca;
	boolean fechar;
	boolean abrir;
	
	Scanner entrada = new Scanner(System.in);
	
	public void EscolherMarca() {
		System.out.println("Digite a marca da Garrafa: ");
		marca = entrada.nextLine();
	}
	
	public void Quantidade() {
		System.out.println("A garrafa est� cheia?");
		quantidade = entrada.nextBoolean();
		
		if (quantidade == true) {
			System.out.println("N�o precisa encher");
		} else {
			System.out.println("Est� vazia");
		}
	}
	
	 public void Fechada() {
	        System.out.println("A garrafa est� aberta? (true/false)");
	        fechar = entrada.nextBoolean();
	    }
	    
	    public void Abrir() {
	        System.out.println("Abrir a garrafa? (true/false)");
	        abrir = entrada.nextBoolean();
	    }
	
	
}

	
