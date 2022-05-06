import java.util.Scanner;

public class exe3c12 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int vet[] = new int[10];
	for (int aux = 0; aux < 10; aux++) {
		System.out.print("Informe um número inteiro: ");
		vet[aux] = teclado.nextInt();
	}
	for (int aux = 0; aux < 10; aux++) {
		if (34 % vet[aux] == 0)
			System.out.print(vet[aux]+" ");
	}
	teclado.close();
	}

}
