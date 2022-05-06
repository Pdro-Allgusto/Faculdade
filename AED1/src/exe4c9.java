import java.util.Scanner;

public class exe4c9 {

	public static void main(String[] args) {
	double num, den, serie=0;
	int termos;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Informe a quantidade de termos: ");
	termos = teclado.nextInt();
	   for (int aux=1; aux<=termos; aux++) {
	     num = (aux*4-3)*(aux*4-2);
	     den = (aux*4-1)*(aux*4);
	     serie += num / den;
	   }
	   serie = Math.sqrt(serie);
	   System.out.print("Valor da Série = "+serie);
	   teclado.close();
	}

}
