import java.util.Scanner;

public class exe3c10 {

	public static void main(String[] args) {
	double pi = 3.1416,raio, angulo,valor;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Para finalizar digite -1 no valor do raio");
	System.out.print("Informe o valor do ângulo: ");
	angulo = teclado.nextDouble();
	do {
		System.out.print("Informe o valor do raio: ");
		raio = teclado.nextDouble();
		if(raio!=-1) {
			valor = (Math.pow(raio, 2)*pi*angulo)/360;
			System.out.println("Valor do setor circular = "+valor);
		}

	} while (raio != -1);

	teclado.close();
	}

}
