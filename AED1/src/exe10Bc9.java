import java.util.Scanner;

public class exe10Bc9 {

	public static void main(String[] args) {
	double num, den, serie=0;
	   int termos;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de termos: ");
		termos = teclado.nextInt();
	   for (int aux=1; aux<=termos; aux++) {
	     num = aux*2;
	     den = aux*3;
	     serie += num / den;
	   }
	   serie = 1+Math.sqrt(serie);
	   System.out.print("Valor da S�rie = "+serie);
	   teclado.close();
	}

}
