import java.util.Scanner;
import java.util.Arrays;

public class exe13c12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String vet[] = new String[12];
		for (int aux = 0; aux < 12; aux++) {
			System.out.print("Informe os nomes dos 12 meses do ano (em ordem cronológica) : ");
			vet[aux] = teclado.nextLine();
		}
		Arrays.sort(vet);		
	    for (String nome : vet) {
	       System.out.println(nome);
	    }

		teclado.close();
	}

}
