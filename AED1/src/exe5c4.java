import java.util.Scanner;
public class exe5c4 {
	public static void main(String[] args) {
		String nome, nomeMae;
		int numeroFilhos;
		double salario;
		Scanner arquivo = new Scanner(
				exe5c4.class.getResourceAsStream("pessoa.txt"));
	      nome = arquivo.nextLine();
	      numeroFilhos = arquivo.nextInt();
	      salario = arquivo.nextDouble();
	      nomeMae = arquivo.nextLine();
	      System.out.println("Nome: "+nome);
	      System.out.println("Quantidade de filhos: "+numeroFilhos);
	      System.out.println("Salário R$"+salario); 
	      System.out.println("Mãe: "+nomeMae);      
	      arquivo.close();
	}

}
