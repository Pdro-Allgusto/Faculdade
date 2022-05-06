import java.util.Scanner;

public class exe11c13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		int cont = 1;
		System.out.print("Informe o nome completo de uma pessoa: ");
		nome = teclado.nextLine();
		nome=nome.toUpperCase();
		String palavras[] = nome.split(" ");
		for (int x = palavras.length - 1; x >= 0; x--) {
			if (cont == 2) {
				System.out.println(palavras[x]);
				break;
			} else
				cont++;

		}
		teclado.close();
	}

}
//pedro augusto morais