import java.util.Scanner;

public class exe11c12 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int nota[] = new int[50],notaM=0;
	String nome[] = new String[50],nomeM = "";
	for (int aux = 0; aux < 50; aux++) {
		System.out.print("Informe o nome do aluno: ");
		nome[aux] = teclado.nextLine();
		System.out.print("Informe a nota do aluno: ");
		nota[aux] = teclado.nextInt();
		teclado.nextLine();
	}
	for (int aux = 0; aux < 50; aux++) {
		if(aux==0||nota[aux]>notaM) {
			nomeM=nome[aux];
			notaM=nota[aux];
		}
	}
	System.out.println("Aluno que obteve a maior nota = "+nomeM);
	teclado.close();
	}

}
