import java.util.Scanner;
public class exe13c8 {
	public static void main(String[] args) {
	int populacao,populacaoMenor = 0, eleitores, homens, mulheres, contM = 0, cont1 = 0;
	String cidade, cidadeMenor = "";
	double porcentagem;
	Scanner teclado = new Scanner(System.in);
	for(int aux=1; aux<=858; aux++) {
		System.out.print("Informe o nome da cidade: ");
	    cidade = teclado.nextLine();
	    teclado.next();
	    System.out.print("Informe a quantidade da população: ");
	    populacao = teclado.nextInt();
	    System.out.print("Informe a quantidade de eleitores: ");
	    eleitores = teclado.nextInt();
	    System.out.print("Informe a quantidade de mulheres: ");
	    mulheres = teclado.nextInt();
	    System.out.print("Informe a quantidade de homens: ");
	    homens = teclado.nextInt();
	    System.out.println("----------------------------------------------------");
		if(homens+ mulheres!=populacao) {
			 System.out.println("Homens e mulheres diferi da população da cidade");
		}
		porcentagem = (float)(100*eleitores)/populacao;
		System.out.println("percentual de eleitores = "+porcentagem);
		System.out.println("----------------------------------------------------");
		if(populacao>1000000) {
			cont1++;
		}
		if(mulheres>homens) {
			contM++;
		}
		if(aux==1||populacao<populacaoMenor) {
			populacaoMenor = populacao;
			cidadeMenor = cidade;
		}
	}
	System.out.println("Total de cidades com mais de 1 milhão de habitantes = "+cont1);
	System.out.println("Cidades com mais mulheres que homens = "+contM);
	System.out.println("Cidade com menor população = "+cidadeMenor);
	teclado.close();
	}

}
