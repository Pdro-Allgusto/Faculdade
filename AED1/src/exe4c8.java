import java.util.Scanner;
public class exe4c8 {
	public static void main(String[] args) {
	String nome;
	int idade, cont, cont2;
	cont = 0;
	cont2 = 0;
	System.out.println("O programa vai informar quantos alunos tem menos de 18 anos e quantos tem maias de 18");
	Scanner teclado = new Scanner(System.in);
	 for(int rep=1; rep<=50; rep++) {
		 System.out.print("Informe o nome do aluno: ");
	     nome = teclado.nextLine();
	     System.out.print("Informe a idade: ");
	     idade = teclado.nextInt();
	     if(idade<=18) {
	    	 cont++;
	     }else
	    	 cont2++;
	 }
	 System.out.println("alunos com mais de 18 = " +cont2);
	 System.out.println("alunos com menos de 18 = " +cont);
	 System.out.println("O programa acabou");
	teclado.close();
	}

}
