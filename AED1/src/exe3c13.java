import java.util.Scanner;

public class exe3c13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, posicao, retorno;
		System.out.print("Informe um número(entre 0 e 999999999): ");
		numero = teclado.nextInt();
		if (numero > 999999999 || numero < 0) {
			System.out.println("Número fora do parametro");
		} else {
			System.out.print("Informe uma posição(entre 1 e 9): ");
			posicao = teclado.nextInt();
			if (posicao == 1) {
				retorno = numero % 10;
				System.out.println(retorno);
			} else if (posicao == 2) {
				retorno = numero % 100 / 10;
				System.out.println(retorno);
			} else if (posicao == 3) {
				retorno = numero % 1000 / 100;
				System.out.println(retorno);
			} else if (posicao == 4) {
				retorno = numero % 10000 / 1000;
				System.out.println(retorno);
			} else if (posicao == 5) {
				retorno = numero % 100000 / 10000;
				System.out.println(retorno);
			} else if (posicao == 6) {
				retorno = numero % 1000000 / 100000;
				System.out.println(retorno);
			} else if (posicao == 7) {
				retorno = numero % 10000000 / 1000000;
				System.out.println(retorno);
			} else if (posicao == 8) {
				retorno = numero % 100000000 / 10000000;
				System.out.println(retorno);
			} else if (posicao == 9) {
				retorno = numero % 1000000000 / 100000000;
				System.out.println(retorno);
			} else if (posicao < 1 || posicao > 9) {
				System.out.println("Posição fora do parametro");
			}
		}
		teclado.close();
	}

}
