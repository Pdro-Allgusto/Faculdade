import java.util.Scanner;
public class exe8c8 {
	public static void main(String[] args) {
		int falta, cont1 = 0,cont2=0,soma=0;
		double nota,media;
		System.out.println("O programa vai informar se o aluno passou ou não");
		Scanner teclado = new Scanner(System.in);
		for (int rep = 1; rep <= 50; rep++) {
			System.out.print("Informe a nota: ");
			nota = teclado.nextDouble();
			System.out.print("Informe a quantidade de faltas: ");
			falta = teclado.nextInt();
			if (nota >= 65 && falta < 16) {
				System.out.println("Aluno aprovado");
				soma+=nota;
				cont1++;
			} else
				System.out.println("Aluno reprovado");
				if(falta>=16) {
					cont2++;
				}
		}
		media = (float)soma/cont1;
		System.out.println("Média dos alunos aprovados = "+ media);
		System.out.println("Quantidade de alunos com mais de 16 faltas = " +cont2);
		teclado.close();
	}

}
