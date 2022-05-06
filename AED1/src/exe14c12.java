import java.util.Scanner;

public class exe14c12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long populacao[] = new long[100];
		long temp;
		String nome[] = new String[100];
		String estado[] = new String[100];
		String pausa, tempo;
		for (int aux = 0; aux < 100; aux++) {
			System.out.print("Informe o nome da cidade: ");
			nome[aux] = teclado.nextLine();
			System.out.print("Informe o nome do estado: ");
			estado[aux] = teclado.nextLine();
			System.out.print("Informe a quantidade da população: ");
			populacao[aux] = teclado.nextInt();
			teclado.nextLine();
		}
		for (int aux = 0; aux < 10; aux++) {
			for (int x = 0; x < 10; x++)
				if (populacao[x] < populacao[x + 1]) {
					temp = populacao[x];
					populacao[x] = populacao[x + 1];
					populacao[x + 1] = temp;
					pausa = nome[x];
					nome[x] = nome[x + 1];
					nome[x + 1] = pausa;
					tempo = estado[x];
					estado[x] = estado[x + 1];
					estado[x + 1] = tempo;

				}
			for (int x = 9; x >= 0; x--)
				System.out.println(nome[x]+" "+estado[x]+" "+populacao[x]);

		}
		teclado.close();
	}

}
