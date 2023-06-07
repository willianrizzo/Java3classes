package exemplo_classe_celular;

import java.util.Scanner;

public class MetodosClasse {
	boolean ligado;
    int numero;
    Scanner digitar = new Scanner(System.in);
    
    
    public MetodosClasse(boolean ligado, int numero) {
		this.ligado = ligado;
		this.numero = numero;
		
	}

	public void ligar() {
        if (ligado) {
            System.out.println("O celular j� est� ligado.");
        } else {
            ligado = true;
            System.out.println("O celular foi ligado.");
        }
    }

    public void desligar() {
    	if (ligado) {
            ligado = false;
            System.out.println("O celular foi desligado.");
        } else {
            System.out.println("O celular j� est� desligado.");
        }
    }

    public void ligarParaNumero() {
    	if (ligado) {
            System.out.println("Digite o n�mero para ligar: ");
            numero = digitar.nextInt();
            System.out.println("Ligando para o n�mero: " + numero);
        } else {
            System.out.println("O celular est� desligado. Ligue o celular antes de fazer uma liga��o.");
        }
    }
  


   

}
