import java.util.Scanner;

public class MetodoNumericoDeNewton {
	public static void main(String[] args) {
		// Declarção de variáveis
		Scanner leitor = new Scanner(System.in);
		double numero = 0;
		double estimativa = 0;
		
		// Entrada de dados
		System.out.print("Digite um número: ");
		numero = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		estimativa = (numero / 2);
		for (int i = 0 ; i < 100 ; i++) {
			System.out.println(estimativa);
			estimativa = (((estimativa) + (numero / estimativa)) / 2); 
		}
		
		// Saída de dados
		System.out.println("Raiz quadrada pelo java : " + Math.sqrt(numero));
		System.out.println("Raiz quadrada por Newton : " + estimativa);
	}
}
