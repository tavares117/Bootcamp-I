import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		// Entrada de dados
		System.out.print("digite o valor do primeiro ângulo: ");
		a = leitor.nextInt();
		
		System.out.print("digite o valor do segundo ângulo: ");
		b = leitor.nextInt();
		
		System.out.print("digite o valor do terceiro ângulo: ");
		c = leitor.nextInt();
		
		
		leitor.close();
		
		// Saída de dados
		if ((a + b + c) != 180) {
			System.out.println("Vai se foder, porra ! Isso nem é triângulo");
		} else if ((a == 90) || (b == 90) || (c == 90)) {
			System.out.println("Triângulo RETÂNGULO !");
		} else if ((a < 90) && (b < 90) && (c < 90)) {
			System.out.println("Triângulo ACUTÂNGULO !");
		} else {
			System.out.println("Triângulo OBTUSÂNGULO !");
		}
	}

}
