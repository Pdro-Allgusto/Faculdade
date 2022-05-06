import java.util.Scanner;

public class exe10c12 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int nota[] = new int[50],soma=0;
	String nome[] = new String[50];
	double media;
	for (int aux = 0; aux < 50; aux++) {
		System.out.print("Informe o nome do aluno: ");
		nome[aux] = teclado.nextLine();
		System.out.print("Informe a nota do aluno: ");
		nota[aux] = teclado.nextInt();
		teclado.nextLine();
		soma+=nota[aux];
	}
	media=soma/50;
	for (int aux = 0; aux < 50; aux++) {
		if(nota[aux]>media) {
			System.out.print(nome[aux]+" ");
		}
	}
	teclado.close();
	}

}
