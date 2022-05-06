import java.util.Scanner;

public class exe7c12 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int nota[] = new int[50];
	String nome[] = new String[50];
	for (int aux = 0; aux < 50; aux++) {
		System.out.print("Informe o nome do aluno: ");
		nome[aux] = teclado.nextLine();
		System.out.print("Informe a nota do aluno: ");
		nota[aux] = teclado.nextInt();
		teclado.nextLine();
	}
	for (int aux = 0; aux < 50; aux++) {
		if(nota[aux]<30) {
			System.out.println(nome[aux] + " Conceito D");
		}else
			if(nota[aux]<60) {
				System.out.println(nome[aux] + " Conceito C");
			}else
				if(nota[aux]<80) {
					System.out.println(nome[aux] + " Conceito B");
				}else
					System.out.println(nome[aux] + " Conceito A");
	}
	teclado.close();
	}

}
