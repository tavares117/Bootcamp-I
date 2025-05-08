public class NumerosPerfeitos {
	public static void main(String[] args) {
		// Declarção de variáveis
		int candidato = 0;
		int somaDivisores = 0;
		
		// Processamento
		while (true) {
			candidato++;
			somaDivisores = 0;
			
			for (int i = 1 ; i <= (candidato / 2) ; i++) {
				if ((candidato % i) == 0) {
					somaDivisores += i;
				}
			}
			
			if (candidato == somaDivisores) {
				System.out.println(candidato);
			}
		}
	}

}
