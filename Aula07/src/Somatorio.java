import java.util.Scanner;

public class Somatorio {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		double indice = 0;
		double somatorio = 0;
		
		// Entrada de dados
		System.out.print("Digite o índice: ");
		indice = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		for (double x = 1 ; x <= indice ; x++) {
			somatorio += (Math.pow(x, 2) + 3 * x + 3);
		}
		
		// Saída de dados
		System.out.println("Somatório: " + somatorio);
		}
	}


