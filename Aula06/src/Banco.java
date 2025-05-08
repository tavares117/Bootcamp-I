import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double saldoInicial = 0;
		double operacao = 0;
		double valor = 0;
		double saldoFinal = 0;
		
		// Entrada de dados
		System.out.print("digite o saldo inicial: ");
		saldoInicial = leitor.nextDouble();
		
		System.out.print("digite <1> para saque ou <2> para depósito: ");
		operacao = leitor.nextDouble();
		
		System.out.print("digite o valor: ");
		valor = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		if (operacao == 1) {
			saldoFinal = (saldoInicial - valor);
		} else if (operacao == 2) {
			saldoFinal = (saldoInicial + valor);
		} else {
			saldoFinal = saldoInicial;
		}
		
		// Saída de dados
		System.out.println("Saldo final: " + saldoFinal);
			
		}
	}	

