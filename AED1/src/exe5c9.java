import java.util.Scanner;

public class exe5c9 {

	public static void main(String[] args) {
		double num, den, serie = 0;
		int termos;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de termos: ");
		termos = teclado.nextInt();
		for (int aux = 1; aux <= termos; aux++) {
			num = (aux * 2 - 2) + (aux * 3);
			den = aux * 6 + 1;
			serie += num / den;
		}
		serie = 5 * serie;
		System.out.print("Valor da S�rie = " + serie);
		teclado.close();
	}

}
