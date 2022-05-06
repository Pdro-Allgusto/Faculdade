import java.util.Scanner;

public class exe13c11 {

	public static void main(String[] args) {
		double num, den, serie = 0;
		int termos, cont = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de termos: ");
		termos = teclado.nextInt();
		do {
			cont++;
			num = cont * Math.pow(cont * 9 + 1, cont * 2);
			den = Math.pow(7, cont - 1);
			serie += num / den;
		} while (cont != termos);
		serie = 71 + Math.cbrt(serie);
		System.out.print("Valor da Série = " + serie);
		teclado.close();
	}

}
