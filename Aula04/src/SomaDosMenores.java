import java.util.Scanner;

public class SomaDosMenores {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int soma = 0;
		
		// Entrada de dados
		System.out.print(" Digitr o primeiro número : ");
		num1 = leitor.nextInt();
		
		System.out.print(" Digitr o segundo número : ");
		num2 = leitor.nextInt();
		
		System.out.print(" Digitr o terceiro número : ");
		num3 = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		if ((num1 > num2) && (num1 > num3)) {
			soma = (num2 + num3);
		} else if ((num2 > num1) && (num2 > num3)) {
			soma = (num1 + num3);
		} else {
			soma = (num1 + num2);
		}
		
		// Saída de dados
		System.out.println("A soma dos dois menores é: " + soma);
		}
	}

