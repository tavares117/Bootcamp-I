import java.util.Scanner;

public class MediaTurma {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		double nota = 0;
		double soma = 0;
		double quantidade = 0;
		double media = 0;
		
		// Entrada de dados
		do {
			System.out.print("Digite a nota da prova: ");
			nota = leitor.nextDouble();
			
			soma += nota;
			quantidade++;
			
			System.out.print("Digite <1> se houver " + "mais alunos: ");
		} while(leitor.nextInt() == 1);
		
		leitor.close();
		
		// Processamento
		media = (soma / quantidade);
		
		// Saída de dados
		System.out.println("Média da turma: " + media);
		
	}

}
