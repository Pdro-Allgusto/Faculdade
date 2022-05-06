import java.util.Scanner;
public class exe1c5 {
	public static void main(String[] args) {
	double x, total;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai rodar a formula f(x)=x^3+4x+10");
	System.out.print("Informe o x: ");
	x = teclado.nextDouble();
	total = Math.pow(x, 3)+4*x+10;
	System.out.println("Resultado: "+total);
	teclado.close();
	}

}
