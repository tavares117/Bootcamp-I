import java.util.Scanner;

public class DiaSemana {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int dia = 0;
		int mes = 0;
		int ano = 0;
		int diaSemana = 0;
		
		// Entrada de dados
		System.out.print("Informe o dia ");
		dia = leitor.nextInt();
		
		System.out.print("Informe o mês : ");
		mes = leitor.nextInt();
		
		System.out.print("Informe o ano: ");
		ano = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		diaSemana = (((dia) + (2 * mes) + ((3 * (mes + 1))/5) + ((ano) + (ano / 4)) - (ano / 100) + 
				(ano / 400) + 2) % 7);
		
		// Saída de dados
		if (diaSemana == 0 ) {
			System.out.println("Sábado !");
		} else if (diaSemana == 1 ) {
			System.out.println("Domingo !");
		} else if (diaSemana == 2 ) {
			System.out.println("Segunda-feira !");
		} else if (diaSemana == 3 ) {
			System.out.println("Terça-feira !");
		} else if (diaSemana == 4 ) {
			System.out.println("Quarta-feira !");
		} else if (diaSemana == 5 ) {
			System.out.println("Quinta-feira !");
		} else if (diaSemana == 6 ) {
			System.out.println("Sesta-feira !");
			
		}
	}
}
