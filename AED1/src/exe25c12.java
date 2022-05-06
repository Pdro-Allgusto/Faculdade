import java.util.Scanner;

public class exe25c12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int pontuacao[] = new int[20];
		String nome[] = new String[20];
		int temp;
		String tempN, time;
		for (int aux = 0; aux < 20; aux++) {
			System.out.print("Informe o nome do time: ");
			nome[aux] = teclado.nextLine();
			System.out.print("Informe a pontuação final do time: ");
			pontuacao[aux] = teclado.nextInt();
			teclado.nextLine();
		}

		for (int aux = 0; aux < 19; aux++) {
			for (int x = 0; x < 19; x++) {
				if (pontuacao[x] < pontuacao[x + 1]) {
					temp = pontuacao[x];
					pontuacao[x] = pontuacao[x + 1];
					pontuacao[x + 1] = temp;
					tempN = nome[x];
					nome[x] = nome[x + 1];
					nome[x + 1] = tempN;

				}
			}
		}
		System.out.print("Informe um nome que deseja encontrar: ");
		time = teclado.nextLine();
		for (int aux = 0; aux < 20; aux++) {
			if (nome[aux].equalsIgnoreCase(time)) {
				if (aux < 4) {
					System.out.print("Copa Libertadores");
				} else if (aux < 12) {
					System.out.print("Copa Sul-americana");
				} else if (aux <= 21) {
					System.out.print("Rebaixada");
				} else
					System.out.print("Time não encontrado");
			}

		}
		teclado.close();
	}

}
