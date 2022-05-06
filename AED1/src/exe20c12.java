import java.util.Scanner;

public class exe20c12 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int vet[] = new int[10];
	int soma=0,cont=0;
	double media;
	for (int aux = 0; aux < 10; aux++) {
		System.out.print("Informe um número inteiro: ");
		vet[aux] = teclado.nextInt();
	}
	for (int aux = 0; aux < 9; aux++) {
		if(vet[aux]>vet[9]) {
			System.out.print(vet[aux] + " ");
			soma+=vet[aux];
			cont++;
		}
	}
	System.out.println(" ");
	media=(float)soma/cont;
	System.out.println("Média dos números impressos = "+media);
	teclado.close();
	}

}
