import java.util.Scanner;

public class Atacado {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double preco = 0;
		int quantidade = 0;
		double valorTotal = 0;
		
		// Entrada de dados
		System.out.print("Digite o preço do produto: ");
		preco = leitor.nextInt();
		
		System.out.print("Digite a quantidade de produtos: ");
		quantidade = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		valorTotal = (preco * quantidade);
		
		if (quantidade > 30) {
			valorTotal *= 0.7;
		} else if (quantidade > 20) {
			valorTotal *= 0.8;
		}else if (quantidade > 10) {
			valorTotal *= 0.9;
		}
		// Saída de dados
		
		}
		}


