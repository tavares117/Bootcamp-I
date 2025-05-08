import java.util.Scanner;

public class LeituraMascarada {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int numero = 0;
		
		// Entrada de dados
		do {
			System.out.print("Digite um número > 10: ");
			numero = leitor.nextInt();
			if (numero <= 10) {
				System.out.println("Amigão... não " + "tá difícil... tenta de novo...");
			}
		} while (numero <= 10);
		
		leitor.close();
		
		// Saída de dados
		System.out.println("Obrigado !");
		
	}
}
	

