import java.util.Scanner;
public class exe7c8 {
	public static void main(String[] args) {
	int cont1 = 0,cont2 = 0, soma = 0,idade;
	double media;
	String nome;
	System.out.println("O programa vai informar quantos alunos tem até 12 anos, quantos alunos tem acima de 30 anos e a média das idades informadas");
	Scanner teclado = new Scanner(System.in);
	for(int rep=1; rep<=50; rep++) {
		System.out.print("Informe o nome: ");
	     nome = teclado.nextLine();
	     nome = teclado.nextLine();
	     System.out.print("Informe a idade: ");
	     idade = teclado.nextInt();
	     soma+=idade;
	     if(idade<=12) {
	    	 cont1++;
	     }
	     if(idade>30) {
	    	 cont2++;
	     }
	}
	media = (float)soma/50.0;
	System.out.println("Alunos até 12 anos = "+cont1);
	System.out.println("Alunos acima de 30 anos = "+cont2);
	System.out.println("Média das idades = "+media);
	teclado.close();
	}

}
