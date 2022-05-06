import java.util.Scanner;

public class exe8c10 {

	public static void main(String[] args) {
		String cidade;
		long populacao, numeroEle, mulheres, homens,MH,cont=0,total = 0,porcentagem,eleitores=0,contF=0,somaH=0,mediaH,menorP=0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Informe o nome da cidede: ");
			cidade = teclado.nextLine();
			System.out.print("População: ");
			populacao = teclado.nextLong();
			System.out.print("Número de eleitores: ");
			numeroEle = teclado.nextLong();
			System.out.print("Quantidade de mulheres: ");
			mulheres = teclado.nextLong();
			System.out.print("Quantidade de homens: ");
			homens = teclado.nextLong();
			teclado.nextLine();
			MH=mulheres+homens;
			total += populacao;
			eleitores += numeroEle;
			cont++;
			somaH+=homens;
			if(mulheres>homens) {
				contF++;
			}
			if(populacao!=MH) {
				System.out.println("A soma dos homens mais as mulheres for diferente da população da cidade");
			}
			if(cont==1||menorP>populacao)
				menorP=populacao;
		} while (!cidade.equalsIgnoreCase("Zimbabue de Minas"));
		porcentagem=(100*eleitores)/populacao;
		mediaH=somaH/cont;
		System.out.println("Quantidade total de cidades do estado = "+cont);
		System.out.println("População total do estado = "+total);
		System.out.println("Percentual de eleitores = "+porcentagem);
		System.out.println("Quantidade de cidades cuja população tem mais mulheres = "+contF);
		System.out.println("Média de homens = "+mediaH);
		System.out.println("O nome da cidade de menor população do estado = "+menorP);
		teclado.close();
	}

}
