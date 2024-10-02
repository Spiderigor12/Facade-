package igor2;
import java.util.Scanner;

public class Lanchonete {
	 public static void main(String[] args) {
	        int opcao;
	        Scanner teclado = new Scanner(System.in);
	        
	        System.out.println("Olá, seja bem-vindo(a) à Lanchonete Siri Cascudo!");
	        System.out.println("\nMenu");
	        System.out.println("1 - Combo A (Podrão)");
	        System.out.println("2 - Combo B (Artesanal)");
	        System.out.println("3 - Combo C (X-burguer)");	    
	        System.out.print("\nSelecione o seu combo: ");
	        
	        opcao = teclado.nextInt();
	        ComboFacade combo = new ComboFacade();
	        combo.criarCombo(opcao);
	        
	        // Verifica se um combo foi criado antes de imprimir
	        if (opcao >= 1 && opcao <= 3) {
	            System.out.println(combo);
	        } else {
	            System.out.println("Por favor, selecione uma opção válida.");
	        }

	        teclado.close(); // Fecha o scanner para evitar vazamento de recursos
	    }

}
