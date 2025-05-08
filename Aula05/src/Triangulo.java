import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		
		// Entrada de dados
		System.out.print("Digite o tamanho do lado a: ");
		a = leitor.nextInt();
		
		System.out.print("Digite o tamanho do lado b: ");
		b = leitor.nextInt();
		
		System.out.print("Digite o tamanho do lado c: ");
		c = leitor.nextInt();
		
		leitor.close();
		
		// Saída de dados
		if ((a == b) && (b == c)) {
			System.out.println("Triângulo equilátero !");
		} else if ((a == b) || (b == c) || (a == c)) {
			System.out.print("trângulo isósceles !");
		} else {
			System.out.println("Triângulo escaleno !");
		}
	}
}
