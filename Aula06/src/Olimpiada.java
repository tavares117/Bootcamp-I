import java.util.Scanner;

public class Olimpiada {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double n4 = 0;
		double n5 = 0;
		double n6 = 0;
		
		double media = 0;
		
		// Entrada de dados
		System.out.print("digite a nota do primero avaliador: ");
		n1 = leitor.nextDouble();
		
		System.out.print("digite a nota do segundo avaliador: ");
		n2 = leitor.nextDouble();
		
		System.out.print("digite a nota do terceiro avaliador: ");
		n3 = leitor.nextDouble();
		
		System.out.print("digite a nota do quarto avaliador: ");
		n4 = leitor.nextDouble();
		
		System.out.print("digite a nota do quinto avaliador: ");
		n5 = leitor.nextDouble();
		
		System.out.print("digite a nota do sexto avaliador: ");
		n6 = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		double maior = 	Math.max(n1, 
						Math.max(n2, 
						Math.max(n3, 
						Math.max(n4, 
						Math.max(n5, n6)))));
		double menor = 	Math.min(n1,
						Math.min(n2,
						Math.min(n3,
						Math.min(n4,
						Math.min(n5, n6)))));
		
		media = ((n1 + n2 + n3 + n4 + n5 + n6 - maior - menor) / 4);						
		
		// Saída de dados
		System.out.println("A média é: " + media);
	}	
}
