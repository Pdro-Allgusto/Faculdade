import java.util.Scanner;

public class exe15c6 {
	public static void main(String[] args) {
		long codigo, quantidadeDias;
		double extra, valorFixo, payView, imposto, conta;
		String cidade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("O programa vai calcular o valor da conta que o assinante deverá pagar");
		System.out.print("Coloque o código do seu pacote: ");
		codigo = teclado.nextLong();
		System.out.print("Coloque a quantidade de dias de consumo de canais pay-per-view: ");
		quantidadeDias = teclado.nextLong();
		System.out.print("Coloque o valor dos serviços extras: ");
		extra = teclado.nextDouble();
		teclado.nextLine();
		System.out.print("Coloque o nome da cidade: ");
		cidade = teclado.nextLine();
		if (codigo == 1) {
			valorFixo = 65;
			payView = quantidadeDias * 1.2;
			if (cidade.equalsIgnoreCase("Belo Horizonte")) {
				imposto = 0;
				conta = valorFixo + payView + extra + imposto;
				System.out.println("Valor a ser pago: " + conta);
			} else if (cidade.equalsIgnoreCase("São Paulo")) {
				imposto = valorFixo * 0.01 + payView * 0.01 + extra * 0.01;
				conta = valorFixo + payView + extra + imposto;
				System.out.println("Valor a ser pago: " + conta);
			} else if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
				imposto = valorFixo * 0.015 + payView * 0.015 + extra * 0.015;
				conta = valorFixo + payView + extra + imposto;
				System.out.println("Valor a ser pago: " + conta);
			} else
				imposto = valorFixo * 0.02 + payView * 0.02 + extra * 0.02;
			conta = valorFixo + payView + extra + imposto;
			System.out.println("Valor a ser pago: " + conta);
		} else if (codigo == 2) {
			valorFixo = 104;
			payView = quantidadeDias * 2.1;
			if (cidade.equalsIgnoreCase("Belo Horizonte")) {
				imposto = 0;
				conta = valorFixo + payView + extra + imposto;
				System.out.println("Valor a ser pago: " + conta);
			} else if (cidade.equalsIgnoreCase("São Paulo")) {
				imposto = valorFixo * 0.01 + payView * 0.01 + extra * 0.01;
				conta = valorFixo + payView + extra + imposto;
				System.out.println("Valor a ser pago: " + conta);
			} else if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
				imposto = valorFixo * 0.015 + payView * 0.015 + extra * 0.015;
				conta = valorFixo + payView + extra + imposto;
				System.out.println("Valor a ser pago: " + conta);
			} else
				imposto = valorFixo * 0.02 + payView * 0.02 + extra * 0.02;
			conta = valorFixo + payView + extra + imposto;
			System.out.println("Valor a ser pago: " + conta);
		} else
			valorFixo = 137;
		payView = quantidadeDias * 0.0;
		if (cidade.equalsIgnoreCase("Belo Horizonte")) {
			imposto = 0;
			conta = valorFixo + payView + extra + imposto;
			System.out.println("Valor a ser pago: " + conta);
		} else if (cidade.equalsIgnoreCase("São Paulo")) {
			imposto = valorFixo * 0.01 + payView * 0.01 + extra * 0.01;
			conta = valorFixo + payView + extra + imposto;
			System.out.println("Valor a ser pago: " + conta);
		} else if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
			imposto = valorFixo * 0.015 + payView * 0.015 + extra * 0.015;
			conta = valorFixo + payView + extra + imposto;
			System.out.println("Valor a ser pago: " + conta);
		} else
			imposto = valorFixo * 0.02 + payView * 0.02 + extra * 0.02;
		conta = valorFixo + payView + extra + imposto;
		System.out.println("Valor a ser pago: " + conta);
		teclado.close();
	}

}
