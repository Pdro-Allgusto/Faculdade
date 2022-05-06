import java.util.Scanner;

public class exe19c12 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int vet[] = new int[100];
	int numero,cont=0;
	for (int aux = 0; aux < 100; aux++) {
		System.out.print("Informe um bilhete: ");
		vet[aux] = teclado.nextInt();
	}
	System.out.print("Informe o número do bilhete sorteado: ");
	numero = teclado.nextInt();
	for (int aux = 0; aux < 100; aux++) {
		if(vet[aux]==numero) {
			System.out.println("Pessoa foi premiada");
		}else
			cont++;
			
	}
	if(cont==100) {
		System.out.println("Pessoa não foi premiada ");
	}
	
	teclado.close();
	}

}
