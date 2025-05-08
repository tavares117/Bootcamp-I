import java.util.Scanner;

public class Geometria { 
	public static void main(String[] args) {
	// Declaração de variáveis
	Scanner leitor = new Scanner(System.in);
	int quantidadeLados = 0;
	double tamanhoAresta = 0;
	double perimetro = 0;
	double area = 0;
	
	// Entrada de dados
	System.out.print("Digite a quantidade de " + "lados do polígono: ");
	quantidadeLados = leitor.nextInt();
	
	System.out.print("Digite o tamanho da aresta: ");
	tamanhoAresta = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento
	perimetro = (quantidadeLados * tamanhoAresta);
	switch (quantidadeLados) {
	case 3:
		area = ((Math.pow(tamanhoAresta, 2) * Math.sqrt(3)) / 4);
		break;
	case 4:
		area = (Math.pow(tamanhoAresta, 2));
		break;
	case 5:
		area = ((5 * Math.pow(tamanhoAresta, 2)) / (4 * Math.tan(36)));
		break;
	case 6:
		area = ((3 * Math.pow(tamanhoAresta, 2) * Math.sqrt(3)) / 2);
		break;
	case 7:
		area = ((7 / 4) * Math.pow(tamanhoAresta, 2) * (1 / Math.tan(51.4285714)));
		break;	
	}
	// Saída de dados
	System.out.println("perímetro: " + perimetro);
	System.out.println("Área: " + area);
  }

}
