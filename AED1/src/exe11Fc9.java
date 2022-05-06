import java.util.Scanner;

public class exe11Fc9 {

	public static void main(String[] args) {
	double num, den, serie=0;
	   int termos;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de termos: ");
		termos = teclado.nextInt();
	   for (int aux=1; aux<=termos; aux++) {
	     num = (aux*2-1)*Math.pow(2, aux+1);
	     den = Math.pow(aux*5-3, 2);
	     serie += num / den;
	   }
	   serie = 5*Math.sqrt(serie);
	   System.out.print("Valor da Série = "+serie);
	   teclado.close();
	}

}
