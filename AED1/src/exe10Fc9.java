import java.util.Scanner;

public class exe10Fc9 {

	public static void main(String[] args) {
	double num, den, serie=0;
	   int termos;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de termos: ");
		termos = teclado.nextInt();
	   for (int aux=1; aux<=termos; aux++) {
	     num = Math.pow(aux, 2);
	     den = Math.pow(aux*2, 2);
	     serie += num / den;
	   }
	   System.out.print("Valor da Série = "+serie);
	   teclado.close();
	}

}
