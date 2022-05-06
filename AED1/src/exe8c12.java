import java.util.Scanner;

public class exe8c12 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int vet[] = new int[20];
	for (int aux = 0; aux < 20; aux++) {
		System.out.print("Informe um número inteiro: ");
		vet[aux] = teclado.nextInt();
	}
	for (int aux = 0; aux < 10; aux++) {
		vet[aux]=vet[aux]+vet[aux+10];
		System.out.print(vet[aux] + " ");
	}
	teclado.close();
	}

}
