import java.util.Scanner;

public class exe14c11 {

	public static void main(String[] args) {
	double num, den, serie = 0,pi=0;
	int cont = 0;
	Scanner teclado = new Scanner(System.in);
	do {
		cont++;
		num = 1;
		den = cont*2-1;
		if (cont % 2 != 0)
			serie += num / den;
		else
			serie -= num / den;
		pi = 4*serie;
		if(pi>3.1416 && pi<3.1417) {
			break;
		}
	} while (cont!=0);
	System.out.print("Valor de PI = " + pi+" Termos = "+cont);
	teclado.close();
	}

}
