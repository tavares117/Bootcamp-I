import java.util.Scanner;

public class SalarioMinimo {
	public static void main (String[] args) {
		// Declaração de varíaveis
		Scanner leitor = new Scanner(System.in);
		double salario = 0;
		double qtdSalariosMinimos = 0;
		
		//Entrada de dados
		System.out.print("Digite o seu salario: ");
		salario = leitor.nextDouble();
		
		leitor.close();
		
		//Processamento
		qtdSalariosMinimos = (salario / 1518);
		
		// Saída de dados
		System.out.println("A quantidade de salários mínimos é: " + qtdSalariosMinimos);
		
	}
}