import java.util.Scanner;
public class exe5c6 {
	public static void main(String[] args) {
	double resto, numero, resultado;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai dizer se o n�mero � divis�vel ao mesmo tempo por 5 e 7");
	System.out.print("Coloque um n�mero: ");
	numero = teclado.nextDouble();
	resto = numero%7;
	if(resto==0) {
		resultado = resto%5;
		      if(resultado==0)
					System.out.println("O n�mero � divisivel por 5 e 7.");
	                else
					System.out.println("o n�mero n�o � divisivel por 5 e 7.");
	}else
		System.out.println("o n�mero n�o � divisivel por 5 e 7.");
	teclado.close();
	}
}
