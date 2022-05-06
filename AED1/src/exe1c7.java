import java.util.Scanner;
public class exe1c7 {
	public static void main(String[] args) {
		int jogos;
		String nome;
		Scanner teclado = new Scanner(System.in);
		System.out.println("O programa vai falar quanto você ganhou");
		System.out.print("Informe seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Informe quantos jogos você acertou: ");
		jogos = teclado.nextInt();
		switch (jogos) {
		case 6: case 7: case 8: case 9: case 10:
			System.out.println(nome+" ganhou outro cartão");
			break;
		case 11:
			System.out.println(nome+" ganhou R$100,00");
			break;
		case 12:
			System.out.println(nome+" ganhou R$1000,00");
			break;
		case 13:
			System.out.println(nome+" ganhou R$50000,00");
			break;
		default:
			System.out.println(nome+" não ganhou nada");
			break;
		}
		teclado.close();
	}


}
