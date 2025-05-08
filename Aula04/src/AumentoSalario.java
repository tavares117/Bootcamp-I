import java.util.Scanner;

public class AumentoSalario {
	public static void main(String[] args) {
	// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int emprego = 0;
		double salario = 0;
		double novoSalario = 0;
		
	// Entrada de dados
	System.out.print(" Digite o emprego: ");
	emprego = leitor.nextInt();
	
	System.out.print(" Digite o salario: ");
	salario = leitor.nextInt();
	
	leitor.close();
	
	// Processamento
	if (emprego == 1) {
		novoSalario = (salario * 1.1);
	} else if (emprego == 2) {
		novoSalario = (salario * 1.15);
	} else {
		novoSalario = (salario * 1.25);
	}
	
	// Saída de dados
	System.out.println("o salário aumentado é: " + novoSalario);
		
	}
}
	

