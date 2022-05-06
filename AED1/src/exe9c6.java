import java.util.Scanner;
public class exe9c6 {
	public static void main(String[] args) {
		double altura, pesoIdeal;
		String sexo;
		Scanner teclado = new Scanner(System.in);
		System.out.println("O programa vai calcular o peso ideal para homens e para mulheres");
		System.out.print("Informe sua altura em metros: ");
		altura = teclado.nextDouble();
		teclado.nextLine();
		System.out.print("Informe se você é F ou M: ");
		sexo = teclado.nextLine();
		if (sexo.equalsIgnoreCase("f")) {
			pesoIdeal = 62.1 * altura - 44.7;
		} else {
			pesoIdeal = 72.7 * altura - 58;
		}
		System.out.println("O peso ideal é " + pesoIdeal);
		teclado.close();

	}

}
