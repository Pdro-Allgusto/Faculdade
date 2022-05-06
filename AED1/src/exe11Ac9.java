import java.util.Scanner;

public class exe11Ac9 {

	public static void main(String[] args) {
	double num , den, serie=0;
	   int termos;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de termos: ");
		termos = teclado.nextInt();
	   for (int aux=1; aux<=termos; aux++) {
	     num = aux+aux*7-6;
	     den = Math.pow(4, aux-1);
	     serie += num / den;

	   }
	   serie = Math.pow(serie, 1.0/3);
	   System.out.print("Valor da Série = "+serie);
	   teclado.close();
	}

}
