import java.util.Scanner;

public class exe10Cc9 {

	public static void main(String[] args) {
	double num, den, serie=0;
	   int termos;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de termos: ");
		termos = teclado.nextInt();
	   for (int aux=1; aux<=termos; aux++) {
	     num = aux*2-1;
	     den = aux*2;
	     serie += num / den;
	   }
	   serie = 1.0/3*Math.pow(serie, 2);
	   System.out.print("Valor da Série = "+serie);
	   teclado.close();
	}

}
