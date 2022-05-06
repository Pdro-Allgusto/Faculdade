import java.util.Scanner;

public class exe4c11 {

	public static void main(String[] args) {
	double multa,idadeM,valor=0,porcentagem;
	String nome,sexo,nomeV="";
	int pontos, idade,contI=0,Idade=0,contP=0,idadeMaior=0,contM=0;
	Scanner teclado = new Scanner(System.in);
	for (int aux = 1; aux <= 230; aux ++) {
		System.out.print("Informe seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Informe sua idade: ");
		idade = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Informe o sexo do condutor(F ou M): ");
		sexo = teclado.nextLine();
		System.out.print("Informe quantidade de pontos perdidos na carteira: ");
		pontos = teclado.nextInt();
		System.out.print("Informe o valor da multa: ");
		multa = teclado.nextDouble();
		teclado.nextLine();
		Idade+=idade;
		valor+=multa;
		contI++;
		if(sexo.equalsIgnoreCase("m")) {
			contM++;
		}else
			if(pontos>7) {
				contP++;
			}
		if(idadeMaior<idade) {
			idadeMaior=idade;
			nomeV=nome;
		}
		
	}
	porcentagem = (contM * 100) / 230;
	idadeM=(float)Idade/contI;
	System.out.println("Idade média dos condutores = "+idadeM);
	System.out.println("Valor total das multas aplicadas = "+valor);
	System.out.println("Percentual de homens multados = "+porcentagem);
	System.out.println("Quantidade de mulheres que perderam 7 pontos na carteira = "+contP);
	System.out.println("Pessoa mais velha nome = "+nomeV+" idade = "+idadeMaior);
	teclado.close();
	}

}
