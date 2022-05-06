import java.util.Scanner;

public class exe1c11 {

	public static void main(String[] args) {
		int numero, cont = 0;
		double funcao, media, soma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um numero inteiro: ");
		numero = teclado.nextInt();
		for (int aux = 1; aux <= numero; aux += 2) {
			funcao = (aux*4-2)/5.0+Math.pow(aux, 2);
			cont++;
			soma += funcao;
			System.out.println("x = " + aux + " f(x) = " + funcao);
		}
		media = soma / cont;
		System.out.println("Média = " + media);

		teclado.close();
	}

}
