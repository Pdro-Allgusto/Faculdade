import java.util.Scanner;

public class exe4c12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vet[] = new int[10];
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe um n�mero inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 10; aux++) {
			vet[aux]=vet[aux]*vet[aux];
			System.out.print(vet[aux] + " ");
		}
		teclado.close();
	}

}
