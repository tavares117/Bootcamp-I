import java.util.Scanner;

public class ComputadorBordo {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		double distancia = 0;
		double tempo = 0;
		double consumo = 0;
		double velocidadeMedia = 0;
		double quantidadeCombustivel = 0;
		
		// Entrada de dados
		System.out.print(" Digite a distância percorrida: ");
		distancia = leitor.nextDouble();
		
		System.out.print(" Digite o tempo do percurso: ");
		tempo = leitor.nextDouble();
		
		System.out.print(" Digite o consumo médio do veículo: ");
		consumo = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		velocidadeMedia = (distancia / tempo);
		quantidadeCombustivel = (distancia / consumo);
		
		// Saída de dados
		System.out.println("Velocidade média: " + velocidadeMedia);
		System.out.println("quantidade combustível: " + quantidadeCombustivel);
	}
}