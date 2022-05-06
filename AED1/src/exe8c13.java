import java.util.Scanner;

public class exe8c13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		System.out.print("Informe o nome completo de uma pessoa: ");
		nome = teclado.nextLine();
		String palavras[] = nome.split(" ");
		System.out.print(palavras[palavras.length - 1] + ", ");
		for (int x = 0; x <= palavras.length - 2; x++) {
			System.out.print(palavras[x].substring(0, 1) + ". ");
		}
		teclado.close();
	}

}