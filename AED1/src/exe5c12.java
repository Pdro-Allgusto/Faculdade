import java.util.Scanner;

public class exe5c12 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int vet[] = new int[10],maior=0;
	for (int aux = 0; aux < 10; aux++) {
		System.out.print("Informe um número inteiro: ");
		vet[aux] = teclado.nextInt();
	}
	for (int aux = 0; aux < 10; aux++) {
		if(aux==0||vet[aux]>maior)
			maior=vet[aux];
	}
	System.out.print("Maior Valor = "+maior);
	teclado.close();
	}

}
