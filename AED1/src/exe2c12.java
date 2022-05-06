import java.util.Scanner;

public class exe2c12 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int vet[] = new int[10];
	for (int aux = 0; aux < 10; aux++) {
		System.out.print("Informe um número inteiro: ");
		vet[aux] = teclado.nextInt();
	}
	for (int aux = 0; aux < 10; aux++) {
		if (vet[aux] > 5 && vet[aux] < 10 )
			System.out.print(vet[aux]+" ");
	}
	teclado.close();
	}

}
