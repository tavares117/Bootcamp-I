import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		double temperaturaCelsius = 0;
		double temperaturaFahrenheit = 0;
		
		//Entrada de dados
		System.out.print("Digite a temperatura em graus Celsius: ");
		temperaturaCelsius = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		temperaturaFahrenheit = (((9 * temperaturaCelsius) / 5) + 32);
		
		//Saída de dados
		System.out.println(" A temperatura em gringo é: " + temperaturaFahrenheit);
	}
}
