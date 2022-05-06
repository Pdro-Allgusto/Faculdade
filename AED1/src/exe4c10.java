import java.util.Scanner;

public class exe4c10 {

	public static void main(String[] args) {
		double bdi, valor, parcial, total = 0, bdiT, valorFinal;
		long quantidade;
		String nome;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para finalizar digite fim no nome do material");
		System.out.print("Informe o valor do BDI da empresa: ");
		bdi = teclado.nextDouble();
		teclado.nextLine();
		do {
			System.out.print("Informe o nome do material: ");
			nome = teclado.nextLine();
			if (!nome.equalsIgnoreCase("fim")) {
				System.out.print("Informe o valor do material: ");
				valor = teclado.nextDouble();
				System.out.print("Informe a quantidade do material: ");
				quantidade = teclado.nextLong();
				teclado.nextLine();
				parcial = quantidade * valor;
				total += parcial;
				System.out.println("Custo Parcial = " + parcial);
				System.out.println();
			}
		} while (!nome.equalsIgnoreCase("fim"));
		bdiT = total * bdi / 100;
		valorFinal = total + bdiT;
		System.out.println("Preço Final = " + valorFinal);
		teclado.close();
	}

}
