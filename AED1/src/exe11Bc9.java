import java.util.Scanner;

public class exe11Bc9 {

	public static void main(String[] args) {
	double num, den, serie=0;
	   int termos;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de termos: ");
		termos = teclado.nextInt();
	   for (int aux=1; aux<=termos; aux++) {
	     num = aux*3-2;
	     den = Math.sqrt(aux*3+4);
	     serie += num / den;
	   }
	   serie = 5.0/3*(serie);
	   System.out.print("Valor da Série = "+serie);
	   teclado.close();
	}

}
