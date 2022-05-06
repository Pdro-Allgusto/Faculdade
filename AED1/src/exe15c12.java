import java.util.Scanner;

public class exe15c12 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int vet[] = new int[10];
	int cont=0,soma=0;
	double media;
	for (int aux = 0; aux < 10; aux++) {
		System.out.print("Informe um número inteiro: ");
		vet[aux] = teclado.nextInt();
	}
	for (int aux = 0; aux < 10; aux++) {
		if(vet[aux]%2==0) {
			cont++;
			soma+=vet[aux];
		}
	}
	media=soma/cont;
	System.out.print(media);
	teclado.close();
	}

}
