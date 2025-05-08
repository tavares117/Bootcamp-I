import java.util.Scanner;

public class ParidadeSinal {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int numero = 0;
		
		// Entrada de dados
		System.out.print(" Digite o número: ");
		numero = leitor.nextInt();
		
		leitor.close();
			
		// Saída de dados
		if (numero == 0) {
			System.out.println("Zero !");
		} else {
		if ((numero % 2) == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		if (numero > 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");	
		}
			}
	}
}
