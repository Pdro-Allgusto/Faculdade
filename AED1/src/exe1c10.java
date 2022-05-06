import java.util.Scanner;

public class exe1c10 {

	public static void main(String[] args) {
		double multa, valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para finalizar digite -1 no valor da multa");
		do {
			System.out.print("Informe o valor da multa: ");
			valor = teclado.nextDouble();
			if(valor!=-1) {
				multa = valor*0.1;
				System.out.println("Valor da multa = "+multa);
			}

		} while (valor != -1);

		teclado.close();
	}

}
