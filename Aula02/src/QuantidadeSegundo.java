import java.util.Scanner;

public class QuantidadeSegundo {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		int qtdTotalSegundos = 0;
		
		// Etrada de dados	
		System.out.print("Digite as horas: ");
		horas = leitor.nextInt();
		
		System.out.print("Digite os minutos: ");
		minutos= leitor.nextInt();
		
		System.out.print("Digite os segundos: ");
		segundos = leitor.nextInt();
		
		leitor.close();
		
		// processamento
		qtdTotalSegundos = ((segundos) + (60 * minutos) + (3600 * horas));
		
		//Saída de dados 
		System.out.println("Total de segundos: " + qtdTotalSegundos);
		
		
			
	}

}
