import java.util.Scanner;

public class MediaNota {
		public static void main(String[] args) {
			// Declaração de variáveis
			Scanner leitor = new Scanner(System.in);
			double notaP1 = 0;
			double notaP2 = 0;
			double notaP3 = 0;
			double media =0;
			// Entrada de Dados
			System.out.print("Informe a nota da primenra prova: ");
			notaP1 = leitor.nextDouble();
			System.out.print("Informe a nota da segunda prova: ");
			notaP2 = leitor.nextDouble();
			System.out.print("Informe a nota da terceira prova: ");
			notaP3 = leitor.nextDouble();
			leitor.close();
			
			// Processamento
			media = ((notaP1 + notaP2 + notaP3) / 3);
			
			// Saída de dados
			System.out.println("A média do cursso é: " + media);
		}

}
