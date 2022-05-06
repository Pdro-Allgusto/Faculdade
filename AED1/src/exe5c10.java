import java.util.Scanner;

public class exe5c10 {

	public static void main(String[] args) {
		double altura, peso, alturaM = 0,media;
		long cont = 0, contF = 0, contP = 0;
		String sexo;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para finalizar digite 0 na altura");
		do {
			System.out.print("Informe sua altura: ");
			altura = teclado.nextDouble();
			if (altura != 0) {
				System.out.print("Informe seu peso: ");
				peso = teclado.nextDouble();
				teclado.nextLine();
				System.out.print("Informe seu sexo (“M” ou “F”): ");
				sexo = teclado.nextLine();
				cont++;
				if (sexo.equalsIgnoreCase("f")) {
					contF++;
					if (peso < 60) {
						contP++;
					}

				} else {
					alturaM += altura;
				}
			}

		} while (altura != 0);
		media = alturaM/(cont-contF);
		System.out.println("Quantidade de pessoas pesquisadas = "+cont);
		System.out.println("Quantidade de mulheres = "+contF);
		System.out.println("Altura média dos homens = "+media);
		System.out.println("Quantidade de mulheres com peso menor que 60 = "+contP);
		teclado.close();

	}

}
