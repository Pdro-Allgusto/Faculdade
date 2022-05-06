import java.util.Scanner;

public class exe4c13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int aleatorio, cont = 0, numero;
		aleatorio = (int) Math.floor(Math.random() * 101);
		do {
			System.out.print("Informe um número(entre 0 e 100): ");
			numero = teclado.nextInt();
			cont++;
		} while (numero != aleatorio);
		System.out.println("Tentativas = "+cont);
		teclado.close();
	}

}
