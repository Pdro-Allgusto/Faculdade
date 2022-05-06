import java.util.Scanner;

public class exe6c6 {
	public static void main(String[] args) {
		double a, b, c, delta, raiz1, raiz2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("O programa vai calcular Báskara");
		System.out.print("Coloque o valor de A: ");
		a = teclado.nextDouble();
		System.out.print("Coloque o valor de B: ");
		b = teclado.nextDouble();
		System.out.print("Coloque o valor de C: ");
		c = teclado.nextDouble();
		delta = Math.pow(b, 2) - 4 * a * c;
		if (delta > 0) {
			raiz1 = (-b - Math.sqrt(delta)) / 2 * a;
			raiz2 = (-b + Math.sqrt(delta)) / 2 * a;
			System.out.println("Teremos duas raizer = " + raiz1 + " e " + raiz2);
		} 
			if (delta == 0) {
				raiz1 = (-b) / 2 * a;
				System.out.println("Teremos uma raiz = " + raiz1);
			} else
				System.out.println("Não existe raiz");
		teclado.close();
	}

}
