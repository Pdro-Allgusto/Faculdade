import java.util.Scanner;
public class exe8c5 {
	public static void main(String[] args) {
	double areaSetorCircular, angulo, raio, pi;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular o valor do raio de um setor circulat");
	System.out.print("Informe a área do setor circular: ");
	areaSetorCircular = teclado.nextDouble();
	System.out.print("Informe o ângulo: ");
	angulo = teclado.nextDouble();
	pi = 3.1416;
	raio = Math.sqrt(areaSetorCircular*360/(angulo*pi));
	System.out.println("Raio: "+raio);
	teclado.close();
	}

}
