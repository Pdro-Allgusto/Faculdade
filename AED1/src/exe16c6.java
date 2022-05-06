import java.util.Scanner;

public class exe16c6 {
	public static void main(String[] args) {
		Double n1, n2, n3, nf, tf, media;
		int idade, peso1, peso2, faltas;
		Scanner teclado = new Scanner(System.in);
		System.out.println("O programa vai ver se o aluno vai passar");
		System.out.print("Informe a nota 1: ");
		n1 = teclado.nextDouble();
		System.out.print("Informe a nota 2: ");
		n2 = teclado.nextDouble();
		System.out.print("Informe a nota 3: ");
		n3 = teclado.nextDouble();
		System.out.print("Informe a nota trabalho final: ");
		tf = teclado.nextDouble();
		System.out.print("Informe a quantidade de faltas: ");
		faltas = teclado.nextInt();
		System.out.print("Informe idade: ");
		idade = teclado.nextInt();
		if (n1 < n2 && n1 < n3) {
			media = (n2 + n3) / 2;
		} else if (n2 < n1 && n2 < n3) {
			media = (n1 + n3) / 2;
		} else
			media = (n1 + n2) / 2;
		if (faltas <= 5) {
			peso1 = 3;
		} else if (faltas <= 10) {
			peso1 = 2;
		} else
			peso1 = 1;
		if (idade <= 17) {
			peso2 = 1;
		} else if (idade <= 50) {
			peso2 = 2;
		} else
			peso2 = 3;
		nf = media * peso1 + tf * peso2;
		if (nf <= 50) {
			System.out.println("Reprovado");
		} else if (nf <= 70) {
			System.out.println("Regular");
		} else if (nf <= 80) {
			System.out.println("Bom");
		} else if (nf <= 90) {
			System.out.println("Muito Bom");
		} else
			System.out.println("Excelente");
		teclado.close();
	}

}
