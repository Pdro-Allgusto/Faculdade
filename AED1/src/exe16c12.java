import java.util.Scanner;

public class exe16c12 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int vet[] = new int[10];
	double  real,impre;
	for (int aux = 0; aux < 10; aux++) {
		System.out.print("Informe um número inteiro: ");
		vet[aux] = teclado.nextInt();
	}
	System.out.print("Informe um número real: ");
	real = teclado.nextDouble();
	for (int aux = 0; aux < 10; aux++) {
		impre=vet[aux]*real;
		System.out.print(impre+" ");
	}
	teclado.close();
	}

}
