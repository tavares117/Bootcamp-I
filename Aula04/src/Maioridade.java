import java.util.Scanner;

public class Maioridade {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int idade = 0;
		
		//Entrada de dados
		System.out.print(" Digite a sua idade: ");
		idade = leitor.nextInt();
		
		leitor.close();
		
		// Saída da dados
		if (idade >= 18) {
			System.out.println("vá ao boteco beber !");
			} else {
				System.out.println("vá á casa dormir !");
		
		}
				
	}
}
