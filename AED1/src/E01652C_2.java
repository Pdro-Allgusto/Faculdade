// Pedro Augusto Morais
import java.util.Scanner;

public class E01652C_2 {

	public static void main(String[] args) {
		double num, den, serie = 0;
		int termos;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de termos: ");
		termos = teclado.nextInt();
		for (int aux = 1; aux <= termos; aux++) {
			num = Math.pow(aux, 2) * Math.sqrt(aux * 2 + 3);
			den = Math.pow(19 + aux, aux);
			serie += num / den;
		}
		serie = 100 + (2.0 / 3) * serie;
		System.out.print("Valor da Série = " + serie);
		teclado.close();
	}
}
