import java.util.Scanner;

public class Avaliacao {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		double notaP1 = 0;
		double notaP2 = 0;
		double notaP3 = 0;
		double notaSubstitutiva = 0;
		double media = 0;
		
		// Entrada de dados
		System.out.print(" Digite a nota da primeira prova : ");
		notaP1 = leitor.nextDouble();
		
		System.out.print(" Digite a nota da segunda prova : ");
		notaP2 = leitor.nextDouble();
		
		System.out.print(" Digite a nota da terceira prova : ");
		notaP3 = leitor.nextDouble();
		
		// Processamento
		media = ((notaP1 + notaP2 + notaP3) / 3);
		
		// Saída de dados
		if (media >= 5) {
			System.out.println("PARABÉNS! Vá beber pra comemorar!");
		}else {
			System.out.println("Digite a nota da substitutiva: ");
			notaSubstitutiva = leitor.nextDouble();
	
			if (notaSubstitutiva >= 5) {
			System.out.println("SE FODEU ! tenta de novo ano que vem: ");
		}
	}
		leitor.close();
	}
}
