import java.util.Scanner;

public class exe6c10 {

	public static void main(String[] args) {
	double a,b,c,x,y,distancia;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe o valor de A: ");
	a = teclado.nextDouble();
	System.out.print("Informe o valor de B: ");
	b = teclado.nextDouble();
	System.out.print("Informe o valor de C: ");
	c = teclado.nextDouble();
	do {
		System.out.print("Informe o valor de X: ");
		x = teclado.nextDouble();
		System.out.print("Informe o valor de Y: ");
		y = teclado.nextDouble();
		distancia = (a*x+b*y+c)/Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println("X="+x+" Y="+y+" Diatância="+distancia);
	} while (distancia!=0);

	teclado.close();

	}

}
