import java.util.Scanner;

public class exe24c12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vet1[] = new int[10];
		int vet2[] = new int[10];
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe um número inteiro: ");
			vet1[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 10; aux++) {
			if (vet1[aux] % 3 == 0) {
				vet2[aux] = vet1[aux];
			}

		}
		for (int aux = 0; aux < 10; aux++) {
			if (vet2[aux] != 0) {
				System.out.print(vet2[aux] + " ");
			}
		}
		teclado.close();
	}

}
