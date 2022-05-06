import java.util.Scanner;

public class exe18c12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String vet[] = new String[10];
		String nome;
		int lugar=0;
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe um nome: ");
			vet[aux] = teclado.nextLine();
		}
		System.out.print("Informe um nome que deseja encontrar: ");
		nome = teclado.nextLine();
		for (int aux = 0; aux < 10; aux++) {
			if(vet[aux].equalsIgnoreCase(nome)) {
				lugar=aux+1;
				System.out.println("Se encontra no lugar = "+lugar);
			}
				
		}
		if(lugar==0) {
			System.out.println("Não se encontra na fila");
		}
		
		teclado.close();
	}

}
