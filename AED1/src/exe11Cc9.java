import java.util.Scanner;

public class exe11Cc9 {

	public static void main(String[] args) {
	double num, den, serie=0;
	   int termos;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de termos: ");
		termos = teclado.nextInt();
	   for (int aux=1; aux<=termos; aux++) {
	     num = (aux*2+1)*Math.sqrt(aux*4+1);
	     den = Math.pow(5, aux);
	     serie += num / den;
	   }
	   serie = Math.pow(serie, 2);
	   System.out.print("Valor da Série = "+serie);
	   teclado.close();
	}

}
