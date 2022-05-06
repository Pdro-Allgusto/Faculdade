import java.util.Scanner;
public class exe10c8 {
	public static void main(String[] args) {
	String nome, nomeMaior = "";
	int rep, quantidade;
	double precoUni, precoParcial, precoParcialT = 0, precoTotal = 0, mediaParcial;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe a quantidade de insumos consumidos no projeto: ");
    rep = teclado.nextInt();
	for(int aux=1; aux<=rep; aux++) {
		System.out.print("Informe o nome: ");
	     nome = teclado.nextLine();
	     nome = teclado.nextLine();
	     System.out.print("Informe a quantidade: ");
	     quantidade = teclado.nextInt();
	     System.out.print("Informe o preço unitario: ");
	     precoUni = teclado.nextDouble();
		precoParcial = quantidade*precoUni;
		if(aux==1 || precoParcial>precoParcialT) {
			precoParcialT = precoParcial;
			nomeMaior = nome;
		}
		if(precoParcial>0) {
			precoTotal +=precoParcial; 
		}
	}
	mediaParcial =(float) precoTotal/rep;
	System.out.println("Custo total do projeto = "+ precoTotal);
	System.out.println("Média dos custos parciais = "+ mediaParcial);
	System.out.println("Nome do insumo de maior custo parcial = " + nomeMaior);
	teclado.close();
	}

}
