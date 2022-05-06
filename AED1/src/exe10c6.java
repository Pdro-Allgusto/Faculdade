import java.util.Scanner;
public class exe10c6 {
	public static void main(String[] args) {
		double resgatado, dias, taxaDiaria, rendimento, capital, impostoRenda, taxaAdm;
		Scanner teclado = new Scanner(System.in);
		System.out.println("O programa vai calcular um valor a ser resgatado de uma aplicação");
		System.out.print("Coloque o capital aplicado: ");
		capital = teclado.nextDouble();
		System.out.print("Coloque o número de dias que foi aplicado: ");
		dias = teclado.nextDouble();
		System.out.print("Coloque a taxa diaria em porcentagem: ");
		taxaDiaria = teclado.nextDouble();
		taxaAdm = 10;
		rendimento = capital * taxaDiaria/100 * dias;
		impostoRenda = 0.15*rendimento;
		resgatado = capital + rendimento - impostoRenda - taxaAdm;
		System.out.println("rendimento: " + rendimento + "\nImposto de renda: " + impostoRenda
				+ "\nValor a ser resgatado: " + resgatado);
		teclado.close();
	}

}
